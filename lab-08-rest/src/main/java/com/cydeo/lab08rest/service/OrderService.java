package com.cydeo.lab08rest.service;

import com.cydeo.lab08rest.dto.OrderDTO;
import com.cydeo.lab08rest.dto.UpdateOrderDTO;

import java.util.List;
import java.util.Optional;

public interface OrderService {

    List<OrderDTO> getOrderList();

    OrderDTO updateOrder(OrderDTO order);

    OrderDTO updateOrderById(Long id, UpdateOrderDTO order);

    OrderDTO retrieveOrderById(Long id, Optional<String> currency);
}
