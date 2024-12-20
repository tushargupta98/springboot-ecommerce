package com.ecommerce.microservices.order.repository;

import com.ecommerce.microservices.order.model.Order;
import org.hibernate.metamodel.mapping.ordering.ast.OrderByComplianceViolation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
