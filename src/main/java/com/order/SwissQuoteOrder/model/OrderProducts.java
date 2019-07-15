package com.order.SwissQuoteOrder.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "OrderProducts")
@Data 

public class OrderProducts {
	
		OrderProducts() {}
		
		public OrderProducts(Integer client_id, Integer order_id	) {
			this.client_id = client_id;
			this.order_id = order_id;	
		}
		
		@Id
		@GeneratedValue (strategy = GenerationType.IDENTITY)
			
		private Integer order_id;
		private Integer client_id;
		
}
