package com.bbva.creditservice.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bbva.creditservice.dto.post.CreatePaymentDTO;
import com.bbva.creditservice.service.IPaymentService;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@RequestMapping("/api")
public class PaymentController {

@Autowired
private IPaymentService paymentService;
 
	@Operation(summary = "GENERAR UN NUEVO PAGO A UN CREDITO")
	@PostMapping("/pagos")
	public ResponseEntity<?> RealizarPago(@RequestBody CreatePaymentDTO paymentDTO){
		Map<String,Object> response =new HashMap<>();
		CreatePaymentDTO paymentDTONew =paymentService.createNewPayment(paymentDTO);
			if(paymentDTONew==null) {
			    response.put("mensaje", "credito no encontrado, porfavor digite un credito correcto a pagar");
				return new ResponseEntity<Map<String,Object>>(response,HttpStatus.CREATED);
			}
			response.put("mensaje", "Se ha pagado el credito " + paymentDTONew.getCredit_id());
			response.put("monto pagado", paymentDTONew.getPayment_amount());
			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.CREATED);
	}
	

}
