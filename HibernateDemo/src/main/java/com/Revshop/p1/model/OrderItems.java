package com.Revshop.p1.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@Entity
@Table(name="orderItems")
public class OrderItems {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long itemId;
	@ManyToOne
	@JoinColumn(name="order_id",nullable=true,referencedColumnName = "orderId")
	private Orders orders;
	@ManyToOne
	@JoinColumn(name="product_id",nullable = true,referencedColumnName = "productId")
	private Product product;
	

}
