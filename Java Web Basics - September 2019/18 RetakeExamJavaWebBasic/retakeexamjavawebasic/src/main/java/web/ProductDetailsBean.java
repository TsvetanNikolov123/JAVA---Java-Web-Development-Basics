package web;

import domain.models.view.ProductViewModel;
import org.modelmapper.ModelMapper;
import service.ProductService;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.servlet.http.HttpSession;

@Named
@RequestScoped
public class ProductDetailsBean extends BaseBean {

    private ProductViewModel productViewModel;
    private ProductService productService;
    private ModelMapper modelMapper;

    public ProductDetailsBean() {
    }

    @Inject
    public ProductDetailsBean(ProductService productService, ModelMapper modelMapper) {
        this.productService = productService;
        this.modelMapper = modelMapper;
    }

    @PostConstruct
    public void init() {
        String productId = FacesContext.getCurrentInstance().getExternalContext().getRequestParameterMap()
                .get("productId");

        this.productViewModel = this.modelMapper.map(this.productService.getById(productId), ProductViewModel.class);
        this.productViewModel.setImageName();
    }

    public ProductViewModel getProductViewModel() {
        return this.productViewModel;
    }

    public void setProductViewModel(ProductViewModel productViewModel) {
        this.productViewModel = productViewModel;
    }
}
