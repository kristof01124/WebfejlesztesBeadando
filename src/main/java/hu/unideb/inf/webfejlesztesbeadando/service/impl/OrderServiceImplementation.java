package hu.unideb.inf.webfejlesztesbeadando.service.impl;

import hu.unideb.inf.webfejlesztesbeadando.DTO.OrderDTO;
import hu.unideb.inf.webfejlesztesbeadando.entity.Order;
import hu.unideb.inf.webfejlesztesbeadando.repository.OrderRepository;
import hu.unideb.inf.webfejlesztesbeadando.repository.SiteUserRepository;
import hu.unideb.inf.webfejlesztesbeadando.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class OrderServiceImplementation implements OrderService {
    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private SiteUserRepository siteUserRepository;

    @Override
    public OrderDTO create(OrderDTO orderDTO) {
        Order order = new Order(orderDTO.orderId(), orderDTO.orderName(), orderDTO.price(), siteUserRepository.getReferenceById(orderDTO.siteUserId()));
        order = orderRepository.save(order);
        return new OrderDTO(order.getOrderId(), order.getOrderName(), order.getPrice(), order.getSiteUserDto().getUserId());
    }

    @Override
    public OrderDTO update(OrderDTO orderDTO) {
        Order order = new Order(orderDTO.orderId(), orderDTO.orderName(), orderDTO.price(), siteUserRepository.getReferenceById(orderDTO.siteUserId()));
        order = orderRepository.save(order);
        return new OrderDTO(order.getOrderId(), order.getOrderName(), order.getPrice(), order.getSiteUserDto().getUserId());
    }

    @Override
    public List<OrderDTO> readAll() {
        return orderRepository.findAll().stream().map((Order order) -> {
            return new OrderDTO(order.getOrderId(), order.getOrderName(), order.getPrice(), order.getSiteUserDto().getUserId());
        }).toList();
    }

    @Override
    public void delete(Long id) {
        orderRepository.delete(orderRepository.findById(id).get());
    }
}
