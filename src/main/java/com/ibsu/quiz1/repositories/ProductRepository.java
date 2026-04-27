package com.ibsu.quiz1.repositories;

import com.ibsu.quiz1.dto.ProductStats;
import com.ibsu.quiz1.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    // Requirement 6: DTO (Class-based) projection
    @Query("SELECT new com.ibsu.quiz1.dto.ProductStats(p.category, AVG(p.price)) " +
    "FROM Product p " +
    "GROUP BY p.category")
    List<ProductStats> getProductStatsByGroup();
}
