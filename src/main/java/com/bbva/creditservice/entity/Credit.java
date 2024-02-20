package com.bbva.creditservice.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Credit {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id_credit;
	private float amount;
	private Double request_interest_rate;
	private Double returned_interest_rate;
	private String state;
	private String currency;
	private String type_credit;
	private String initial_date;
	private String response_date;
	private String months;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name="client_id")
	@JsonBackReference
	private Client client;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="account_id")
	private Account account;
	
}
