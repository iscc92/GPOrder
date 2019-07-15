package com.order.SwissQuoteOrder.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "Order")
@Data 

public class Order {
	
	Order() {}
	
	public Order(Integer client_id, Integer status) {
		this.client_id = client_id;
		this.status = status;
	}

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer client_id;
	
	private Integer status;
}
