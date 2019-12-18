package web;

import domain.models.binding.ProductCreateBindingModel;
import domain.models.service.ProductServiceModel;
import org.modelmapper.ModelMapper;
import service.ProductService;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class ProductCreateBean extends BaseBean {

    private ProductCreateBindingModel productCreateBindingModel;

    private ProductService productService;
    private ModelMapper modelMapper;

    public ProductCreateBean() {
    }

    @Inject
    public ProductCreateBean(ProductService productService, ModelMapper modelMapper) {
        this.productService = productService;
        this.modelMapper = modelMapper;
    }

    @PostConstruct
    private void init() {
        this.productCreateBindingModel = new ProductCreateBindingModel();
    }

    public void create() {
        ProductServiceModel model = this.modelMapper.map(this.productCreateBindingModel, ProductServiceModel.class);
        this.productService.save(model);
        this.redirect("/home");
    }

    public ProductCreateBindingModel getProductCreateBindingModel() {
        return this.productCreateBindingModel;
    }

    public void setProductCreateBindingModel(ProductCreateBindingModel productCreateBindingModel) {
        this.productCreateBindingModel = productCreateBindingModel;
    }
}
