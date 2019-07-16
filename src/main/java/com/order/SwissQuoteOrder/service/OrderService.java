package com.order.SwissQuoteOrder.service;

import com.order.SwissQuoteOrder.model.Order;

public interface OrderService {
	
	Order createOrder(Order order);
	Order findOrderById(Integer order_id);
	Order findOrderByClientId(Integer client_id);
	Order updateStatusOrder(Order order);	
}
