package com.ibsu.quiz1.repositories;

import com.ibsu.quiz1.entities.Order;
import com.ibsu.quiz1.entities.OrderStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface OrderRepository extends JpaRepository<Order, Long> {
    // Requirement 3: JPQL search query for orders
    @Query("SELECT o from Order o " +
    "WHERE LOWER(o.customerName) LIKE LOWER(CONCAT('%', :customerName, '%')) " +
    "AND o.status = :status ORDER BY o.createdAt desc")
    List<Order> findByCustomerNameAndStatus(
            @Param("customerName") String customerName,
            @Param("status") OrderStatus status);
}
