package com.order.SwissQuoteOrder.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.order.SwissQuoteOrder.model.Order;
import com.order.SwissQuoteOrder.model.OrderProducts;
import com.order.SwissQuoteOrder.service.OrderService;
import com.order.SwissQuoteOrder.model.OrderRequest;

@RestController
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@RequestMapping(value = "/order/{order_id}", method = RequestMethod.GET)
	public OrderProducts findOrderById(@PathVariable Integer order_id) {
		return this.orderService.findOrderById(order_id);
	}
	
	@RequestMapping(value = "/order/product/{product_id}", method = RequestMethod.GET)
	public OrderProducts findOrderByIdProduct(@PathVariable Integer product_id) {
		return this.orderService.findOrderByIdProduct(product_id);
	}

	@RequestMapping(value = "/order/save", method = RequestMethod.POST)
	public OrderProducts saveOrder(@RequestBody OrderRequest orderRequest) {
		Order order = new Order(orderRequest.getClient_id(), orderRequest.getStatus());
		return this.orderService.saveOrder(order);
	}
	
	@RequestMapping(value = "order/delete/{order_id}", method = RequestMethod.DELETE)
	public OrderProducts deleteOrder(@PathVariable Integer order_id) {
		this.orderService.deleteOrder(order_id);
		return null;
	}
}
