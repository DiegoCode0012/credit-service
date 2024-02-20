package com.bbva.creditservice.dto.get;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClientGetDTO {
	private String name;
	private String last_name;
	private Integer phone;
	private Integer dni;
	private List<CreditGetDTO> creditos;
}
