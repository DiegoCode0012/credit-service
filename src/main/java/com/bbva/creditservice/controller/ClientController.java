package com.bbva.creditservice.controller;





import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bbva.creditservice.dto.get.ClientGetDTO;
import com.bbva.creditservice.service.IClientService;

import io.swagger.v3.oas.annotations.Operation;




@RestController
@RequestMapping("/api")
public class ClientController {
	
	@Autowired
	private IClientService serviceClient;
	
	//he deeactivado template proposal y java proposal , OJO
	@Operation(summary = "VER CREDITOS DE UN CLIENTE")
	@GetMapping("/clients/{id}")
	public ResponseEntity<?> VerMisCreditos(@PathVariable Long id) {
		Map<String,Object> response =new HashMap<>();
		ClientGetDTO ClientGetDTO= serviceClient.buscarCliente(id);
		if(ClientGetDTO==null) {
			response.put("mensaje","cliente no encontrado en la BBDD");
			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.NOT_FOUND);
		}
		response.put("cliente", ClientGetDTO);
		return 	new ResponseEntity<Map<String,Object>>(response,HttpStatus.OK);
	} 



}
