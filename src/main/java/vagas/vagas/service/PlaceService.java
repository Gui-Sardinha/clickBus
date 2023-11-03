package vagas.vagas.service;

import java.time.Instant;
import java.time.temporal.ChronoField;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;
import org.springframework.stereotype.Service;

import vagas.vagas.entities.Place;
import vagas.vagas.entities.DTO.PlaceDTO;
import vagas.vagas.repositories.PlaceRepository;

@Service
public class PlaceService {
	
	@Autowired
	private PlaceRepository repository;
	
	
	public List<PlaceDTO> findAll(){
		List<Place> obj = repository.findAll(Sort.by(Order.by("name")));
		List<PlaceDTO> dto = obj.stream().map(PlaceDTO::new).collect(Collectors.toList());
		return dto;
	}
	
	
	public List<PlaceDTO> findTOP(){
		List<Place> obj = repository.findTop3ByOrderByPrice();
		List<PlaceDTO> dto = obj.stream().map(PlaceDTO::new).collect(Collectors.toList());
		return dto;
	}
	
	
	public List<PlaceDTO> findByName(String nome) {
		Place entity = new Place();
		entity.setName(nome);
		List <Place> obj = repository.findByName(nome);
		List<PlaceDTO> dto = obj.stream().map(PlaceDTO::new).collect(Collectors.toList());
		
		return dto;
	}
	
	public PlaceDTO insert(PlaceDTO obj) {
		Place entity = new Place();
		entity.setName(obj.getName());
		entity.setSlug(obj.getSlug());
		entity.setState(obj.getState());
		entity.setCity(obj.getCity());
		entity.setPrice(obj.getPrice());
		entity.setImg(obj.getImg());
		obj.setCreatedAt(Instant.now().with(ChronoField.NANO_OF_SECOND, 0));
		entity.setCreatedAt(obj.getCreatedAt());
		repository.save(entity);
		
		PlaceDTO obj2 = new PlaceDTO(entity);
		
		return obj2;
	}
	
	public PlaceDTO update(Long id, PlaceDTO obj) {
		Place entity = repository.getReferenceById(id);
		updateData(entity, obj);
		repository.save(entity);
		
		PlaceDTO obj2 = new PlaceDTO(entity);
		
		return obj2;
	}


	private void updateData(Place entity, PlaceDTO obj) {
		entity.setName(obj.getName());
		entity.setCity(obj.getCity());
		entity.setState(obj.getState());
		entity.setSlug(obj.getSlug());
		entity.setPrice(obj.getPrice());
		entity.setImg(obj.getImg());
		obj.setUpdatedAt(Instant.now().with(ChronoField.NANO_OF_SECOND, 0));
		entity.setUpdatedAt(obj.getUpdatedAt());
		
	}
	
	public void delete(Long id) {
		repository.deleteById(id);
	}
	
}
