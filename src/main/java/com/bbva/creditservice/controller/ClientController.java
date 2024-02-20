package com.bbva.creditservice.controller;





import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@RestController
@RequestMapping("/api")
public class ClientController {
	/*
	@Autowired
	private IClientService serviceClient;
	
	//he deeactivado template proposal y java proposal , OJO
	@Operation(summary = "VER CLIENTE POR SU ID")
	@GetMapping("/clients/{id}")
	public ResponseEntity<?> VerMisCreditos(@PathVariable Long id) {
		Map<String,Object> response =new HashMap<>();
	/*	ClientDTO clientDTO= serviceClient.buscarCliente(id);
		if(clientDTO==null) {
			response.put("mensaje","cliente no encontrado en la BBDD");
			return new ResponseEntity<Map<String,Object>>(response,HttpStatus.NOT_FOUND);
		}*/
	//	response.put("xxx", clientDTO);
	//	response.put("cliente", clientDTO.getCreditos());
//		return 	new ResponseEntity<Map<String,Object>>(response,HttpStatus.OK);
	//} 



}
