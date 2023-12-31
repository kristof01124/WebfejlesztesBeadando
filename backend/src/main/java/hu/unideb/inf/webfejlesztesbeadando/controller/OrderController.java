package hu.unideb.inf.webfejlesztesbeadando.controller;

import hu.unideb.inf.webfejlesztesbeadando.DTO.OrderDTO;
import hu.unideb.inf.webfejlesztesbeadando.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    OrderService orderService;

    @GetMapping("/getAll")
    ResponseEntity getAllOrders() {
        return new ResponseEntity<>(orderService.readAll(), HttpStatus.OK);
    }

    @PostMapping("/createOrder")
    ResponseEntity createOrder(@RequestBody OrderDTO orderDTO) {
        return new ResponseEntity(orderService.create(orderDTO), HttpStatus.CREATED);
    }

    @PatchMapping("/updateOrder")
    ResponseEntity updateOrder(@RequestBody OrderDTO orderDTO) {
        return new ResponseEntity(orderService.update(orderDTO), HttpStatus.OK);
    }

    @DeleteMapping("/deleteOrder")
    ResponseEntity deleteOrder(@RequestBody OrderDTO orderDTO) {
        orderService.delete(orderDTO.orderId());
        return new ResponseEntity(HttpStatus.OK);
    }

}
