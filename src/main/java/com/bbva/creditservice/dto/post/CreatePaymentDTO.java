package com.bbva.creditservice.dto.post;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreatePaymentDTO {
	
	private Long credit_id;
	private Date payment_date;
	private float payment_amount;
}
