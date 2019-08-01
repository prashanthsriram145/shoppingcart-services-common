package com.visa.shoppingcart.common.dao;

import com.visa.shoppingcart.common.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
@Repository
public interface ProductRepository extends JpaRepository<Product,String> {

    List<Product> findAllByCategory_CategoryName(String categoryName);

}
