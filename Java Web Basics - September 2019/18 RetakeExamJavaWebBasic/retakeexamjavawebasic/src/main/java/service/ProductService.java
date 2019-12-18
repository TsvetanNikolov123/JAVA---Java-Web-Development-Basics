package service;

import domain.models.service.ProductServiceModel;
import net.bytebuddy.implementation.bytecode.assign.TypeCasting;

import java.util.List;

public interface ProductService {

    void save(ProductServiceModel productServiceModel);

    List<ProductServiceModel> getAll();

    ProductServiceModel getById(String id);

    void delete(String id);
}
