package com.order.SwissQuoteOrder.service;

import com.order.SwissQuoteOrder.model.OrderProducts;

public interface OrderProductsService {

	OrderProducts createOrder(OrderProducts orderProducts);
	OrderProducts saveOrder(OrderProducts orderProduct);
	OrderProducts updateOrder(OrderProducts orderProduct);
	OrderProducts findOrderById(Integer order);
	OrderProducts findOrderByIdProduct(Integer product_id);
	OrderProducts statusOrder(Integer order_id);
}
