package hu.unideb.inf.webfejlesztesbeadando.controller;

import hu.unideb.inf.webfejlesztesbeadando.DTO.OrderDTO;
import hu.unideb.inf.webfejlesztesbeadando.DTO.SiteUserDTO;
import hu.unideb.inf.webfejlesztesbeadando.service.OrderService;
import hu.unideb.inf.webfejlesztesbeadando.service.SiteUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/siteUsers")
public class SiteUserController {

    @Autowired
    SiteUserService siteUserService;

    @GetMapping("/getAll")
    ResponseEntity getAllOrders() {
        return new ResponseEntity<>(siteUserService.readAll(), HttpStatus.OK);
    }

    @PostMapping("/createUser")
    ResponseEntity createOrder(@RequestBody SiteUserDTO siteUserDTO) {
        return new ResponseEntity(siteUserService.create(siteUserDTO), HttpStatus.CREATED);
    }

    @PostMapping("/updateUser")
    ResponseEntity updateOrder(@RequestBody SiteUserDTO siteUserDTO) {
        return new ResponseEntity(siteUserService.update(siteUserDTO), HttpStatus.OK);
    }

    @PostMapping("/deleteUser")
    ResponseEntity deleteOrder(@RequestBody Long id) {
        siteUserService.delete(id);
        return new ResponseEntity(HttpStatus.OK);
    }

}
