package cap.stone.services;

import java.util.List;

/**
 * @Author: Megan McKinney
 */
public interface CRUDService<T> {
    List<?> listAll();

    T getById(Integer id);

    T saveOrUpdate(T domainObject);

    void delete(Integer id);
}
