package web;

import domain.models.view.ProductViewModel;
import org.modelmapper.ModelMapper;
import service.ProductService;

import javax.enterprise.context.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Named
@RequestScoped
public class ProductDeleteBean extends BaseBean {

    private ProductService productService;
    private ModelMapper modelMapper;

    public ProductDeleteBean() {
    }

    @Inject
    public ProductDeleteBean(ProductService productService, ModelMapper modelMapper) {
        this.productService = productService;
        this.modelMapper = modelMapper;
    }

    public void removeProduct() {
        String id = ((HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest()).getParameter("productId");
        this.productService.delete(id);
        this.redirect("/home");
    }

    public ProductViewModel getProductById(String id) {
        return this.modelMapper.map(this.productService.getById(id), ProductViewModel.class);
    }
}
