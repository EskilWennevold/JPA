package junit.demo.Service;

import junit.demo.Model.Product;
import junit.demo.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepo;


    public List<Product> allProducts(){
        ArrayList<Product> productList = new ArrayList<>();
        productRepo.findAll().forEach(e -> productList.add(e));
        return productList;
    }
    public Product findById(int id){
        Optional<Product> optionalProduct;
        optionalProduct = productRepo.findById(id);
        return optionalProduct.get();
    }
    public Product createProduct(Product p){
        productRepo.save(p);
        return null;
    }
    public Product updateProduct(Product p){
        productRepo.save(p);
        return null;
    }
    public void deleteProduct(int id){
        productRepo.deleteById(id);
    }

}
