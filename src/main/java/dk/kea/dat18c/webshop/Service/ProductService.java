package dk.kea.dat18c.webshop.Service;

import dk.kea.dat18c.webshop.Model.Product;
import dk.kea.dat18c.webshop.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> getAll(){
        return productRepository.getAll();
    }
}
