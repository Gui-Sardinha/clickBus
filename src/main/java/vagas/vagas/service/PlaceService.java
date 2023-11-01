package vagas.vagas.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vagas.vagas.entities.Place;
import vagas.vagas.entities.DTO.PlaceDTO;
import vagas.vagas.repositories.PlaceRepository;

@Service
public class PlaceService {
	
	@Autowired
	private PlaceRepository repository;
	
	
	public List<PlaceDTO> findAll(){
		List<Place> obj = repository.findAll();
		List<PlaceDTO> dto = obj.stream().map(PlaceDTO::new).collect(Collectors.toList());
		return dto;
	}
}
