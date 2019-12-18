package service;

import domain.entities.Product;
import domain.models.service.ProductServiceModel;
import org.modelmapper.ModelMapper;
import repository.ProductRepository;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;
    private final ModelMapper modelMapper;

    @Inject
    public ProductServiceImpl(ProductRepository productRepository, ModelMapper modelMapper) {
        this.productRepository = productRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public void save(ProductServiceModel productServiceModel) {
        this.productRepository.save(this.modelMapper.map(productServiceModel, Product.class));
    }

    @Override
    public List<ProductServiceModel> getAll() {
        return this.productRepository.findAll()
                .stream()
                .map(product -> this.modelMapper.map(product, ProductServiceModel.class))
                .collect(Collectors.toList());
    }

    @Override
    public ProductServiceModel getById(String id) {
        return this.modelMapper.map(this.productRepository.findById(id), ProductServiceModel.class);
    }

    @Override
    public void delete(String id) {
        this.productRepository.delete(id);
    }
}
