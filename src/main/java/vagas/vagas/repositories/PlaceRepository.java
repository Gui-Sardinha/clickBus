package vagas.vagas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import vagas.vagas.entities.Place;

public interface PlaceRepository extends JpaRepository <Place,Long>{

}
