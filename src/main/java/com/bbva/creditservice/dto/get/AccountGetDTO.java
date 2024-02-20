package com.bbva.creditservice.dto.get;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccountGetDTO {
	private Long account_id;
	private String account_type;
	private float balance;
	private String state;
}
