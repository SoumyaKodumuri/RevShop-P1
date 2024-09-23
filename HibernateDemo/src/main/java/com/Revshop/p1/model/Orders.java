package com.Revshop.p1.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
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
@ToString
@Builder
@Entity
@Table(name="orders")
public class Orders {
	
	@Id
	private long orderId;
	@ManyToOne
	@JoinColumn(name="user_id" ,nullable=true)
	private User user;
	@Column(name="total_price")
	private Double totalPrice;
	private String address;
	private String payment;
	private LocalDateTime date;
	
	
	
	

}
