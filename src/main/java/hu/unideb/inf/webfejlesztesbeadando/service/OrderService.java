package hu.unideb.inf.webfejlesztesbeadando.service;

import hu.unideb.inf.webfejlesztesbeadando.DTO.OrderDTO;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface OrderService {
    public OrderDTO create(OrderDTO orderDTO);

    public OrderDTO update(OrderDTO order);

    public List<OrderDTO> readAll();

    public void delete(Long id);
}
