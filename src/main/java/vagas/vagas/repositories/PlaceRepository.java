package vagas.vagas.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import vagas.vagas.entities.Place;

public interface PlaceRepository extends JpaRepository <Place,Long>{
	List<Place> findByName(String name);
	
	List<Place> findTop3ByOrderByPrice();
}
