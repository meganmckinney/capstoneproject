package cap.stone.services.mapservices;

import cap.stone.domain.DomainObject;
import cap.stone.domain.Product;
import cap.stone.services.ProductService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: Megan McKinney
 */
@Service
@Profile("map")
public class ProductServiceImpl extends AbstractMapService implements ProductService {

    @Override
    public List<DomainObject> listAll() {
        return super.listAll();
    }

    @Override
    public Product getById(Integer id) {
        return (Product) super.getById(id);
    }

    @Override
    public Product saveOrUpdate(Product domainObject) {
        return (Product) super.saveOrUpdate(domainObject);
    }

    @Override
    public void delete(Integer id) {
        super.delete(id);
    }

   }
