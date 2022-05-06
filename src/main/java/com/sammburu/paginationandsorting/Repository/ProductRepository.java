package com.sammburu.paginationandsorting.Repository;

import com.sammburu.paginationandsorting.Model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
