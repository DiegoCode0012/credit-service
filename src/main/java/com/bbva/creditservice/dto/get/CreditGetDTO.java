package com.bbva.creditservice.dto.get;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreditGetDTO {
	private float amount;
	private Double request_interest_rate;
	private String currency;
	private String type_credit;
	private String initial_date;
	private String months;
	private String state;
	private AccountGetDTO account;

}
