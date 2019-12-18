package web;

import domain.models.view.ProductViewModel;
import org.modelmapper.ModelMapper;
import service.ProductService;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;
import java.util.stream.Collectors;

@Named
@RequestScoped
public class ProductListBean extends BaseBean {
    private List<ProductViewModel> productViewModels;

    private ProductService productService;
    private ModelMapper modelMapper;

    public ProductListBean() {
    }

    @Inject
    public ProductListBean(ProductService productService, ModelMapper modelMapper) {
        this.productService = productService;
        this.modelMapper = modelMapper;
    }

    @PostConstruct
    private void init() {
        List<ProductViewModel> products = this.productService
                .getAll()
                .stream()
                .map(productServiceModel -> this.modelMapper.map(productServiceModel, ProductViewModel.class))
                .collect(Collectors.toList());
        products.forEach(ProductViewModel::setImageName);
        this.setProductViewModels(products);
        String debug = "";
    }

    public List<ProductViewModel> getProductViewModels() {
        return this.productViewModels;
    }

    public void setProductViewModels(List<ProductViewModel> productViewModels) {
        this.productViewModels = productViewModels;
    }
}
