package hu.unideb.inf.webfejlesztesbeadando.repository;

import hu.unideb.inf.webfejlesztesbeadando.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
