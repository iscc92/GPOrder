package com.order.SwissQuoteOrder.service;

import com.order.SwissQuoteOrder.model.Order;

public interface OrderService {
	
	Order findOrderById(Integer order_id);
	Order findOrderByIdProduct(Integer product_id);
	Order saveOrder(Order order);
	Order deleteOrder(Integer order_id);
	
}
