package com.cydeo.lab08rest.controller;

import com.cydeo.lab08rest.dto.OrderDTO;
import com.cydeo.lab08rest.dto.ProductDTO;
import com.cydeo.lab08rest.dto.UpdateOrderDTO;
import com.cydeo.lab08rest.model.ResponseWrapper;
import com.cydeo.lab08rest.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/order")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping
    public ResponseEntity<ResponseWrapper> getOrderList(){

        return ResponseEntity.ok(new ResponseWrapper("Orders are retrieved",
                orderService.getOrderList(), HttpStatus.OK));

    }

    @PutMapping
    public ResponseEntity<ResponseWrapper> updateOrder(@RequestBody OrderDTO order){

        return ResponseEntity.ok(new ResponseWrapper("Order is updated", orderService.updateOrder(order), HttpStatus.OK));

    }

    @PutMapping("/{id}")
    public ResponseEntity<ResponseWrapper> updateOrderById(@PathVariable("id") Long id,@Valid @RequestBody UpdateOrderDTO order){

        return ResponseEntity.ok(new ResponseWrapper("Order is updated", orderService.updateOrderById(id, order), HttpStatus.OK));

    }

    @GetMapping("/{id}")
    public ResponseEntity<ResponseWrapper> getOrderById(@PathVariable("id") Long id, @RequestParam(required = false) Optional<String> currency){

        return ResponseEntity.ok(new ResponseWrapper("Order is updated", orderService.retrieveOrderById(id, currency), HttpStatus.OK));

    }



    }







