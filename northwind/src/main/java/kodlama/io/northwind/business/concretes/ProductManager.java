package kodlama.io.northwind.business.concretes;

import kodlama.io.northwind.business.abstracts.ProductService;
import kodlama.io.northwind.dataAccess.abstracts.ProductDao;
import kodlama.io.northwind.entities.concretes.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductManager implements ProductService {

    private final ProductDao productDao;

//    public ProductManager(ProductDao productDao) {
//        this.productDao = productDao;
//    }

    @Override
    public List<Product> getAll() {
        return this.productDao.findAll();
    }
}
