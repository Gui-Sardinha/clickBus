package vagas.vagas.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vagas.vagas.entities.DTO.PlaceDTO;
import vagas.vagas.service.PlaceService;



@RestController
@RequestMapping(value = "/places")
public class PlaceResource {
	
	@Autowired
	private PlaceService service;
	
	@GetMapping
	public ResponseEntity <List<PlaceDTO>> findAll(){
		List<PlaceDTO> list = service.findAll();
		return ResponseEntity.ok().body(list);
		
	}

}
