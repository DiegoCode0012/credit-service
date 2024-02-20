package com.bbva.creditservice.dto.post;








import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateClientDTO {
	private String name;
	private String last_name;
	private Integer phone;
	private Integer dni;

}
