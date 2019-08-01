package com.visa.shoppingcart.common.dao;

import com.visa.shoppingcart.common.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
