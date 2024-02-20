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

import com.bbva.creditservice.dto.post.CreateCreditDTO;
import com.bbva.creditservice.service.ICreditService;

import io.swagger.v3.oas.annotations.Operation;


@RestController
@RequestMapping("/api")
public class CreditController {

@Autowired
private ICreditService serviceCredit;



@Operation(summary = "GENERAR UN NUEVO CREDITO")
@PostMapping("/creditos")
public ResponseEntity<?> solicitarCredito(@RequestBody CreateCreditDTO creditDTO){ // DTO PONER con MapStruct
	Map<String,Object> response =new HashMap<>();
	
	
	// CreditDTO credito=serviceCredit.solicitarCredito(creditDTO);
	CreateCreditDTO credito=serviceCredit.solicitarCredito(creditDTO);
	/* PASAR TODA LA LOGICA AL SERVICIO*/

	response.put("mensaje", "Se verificara en unos dias la aprobación del credito");
	response.put("estatus", "Pendiente de Revisión");
	response.put("creditoNuevo", credito);

	return new ResponseEntity<Map<String,Object>>(response,HttpStatus.CREATED);
}

/*
@GetMapping("/creditos/idCliente/{idCliente}")
public ResponseEntity<?>  listarCreditosDeUnCliente(@PathVariable Long idCliente) {
	Map<String,Object> response =new HashMap<>();
		List<CreateCreditDTO>creditos= serviceCredit.listarCreditoDelCliente(idCliente);
		response.put("creditos", creditos);
	
	return new ResponseEntity<Map<String,Object>>(response,HttpStatus.CREATED);
} */

}
