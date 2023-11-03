package vagas.vagas.config;

import java.time.Instant;
import java.time.temporal.ChronoField;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import vagas.vagas.entities.Place;
import vagas.vagas.repositories.PlaceRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private PlaceRepository placeRepository;

	@Override
	public void run(String... args) throws Exception {

		Place place1 = new Place();
		
		place1.setName("Vila Mix");
		place1.setSlug("teste");
		place1.setCity("Sao Paulo");
		place1.setState("Sao Paulo");
		place1.setPrice(700.00);
		place1.setImg("https://photo620x400.mnstatic.com/087dfd415e06b0651f4528fea6642818/rio-de-janeiro.jpg?quality=70&format=pjpg");
		place1.setCreatedAt(Instant.parse("2019-06-20T19:53:07Z"));
		place1.setUpdatedAt(Instant.now().with(ChronoField.NANO_OF_SECOND, 0));
		
		Place place2 = new Place();
		place2.setName("Allianz");
		place2.setSlug("teste");
		place2.setCity("Sao Paulo");
		place2.setState("Sao Paulo");
		place2.setPrice(600.00);
		place2.setImg("https://photo620x400.mnstatic.com/087dfd415e06b0651f4528fea6642818/rio-de-janeiro.jpg?quality=70&format=pjpg");
		place2.setCreatedAt(Instant.parse("2029-06-20T19:53:07Z"));
		place2.setUpdatedAt(Instant.now().with(ChronoField.NANO_OF_SECOND, 0));
		
		Place place3 = new Place();
		place3.setName("Maracana");
		place3.setSlug("teste");
		place3.setCity("Rio de Janeiro");
		place3.setState("Rio de Janeiro");
		place3.setPrice(300.00);
		place3.setImg("https://photo620x400.mnstatic.com/087dfd415e06b0651f4528fea6642818/rio-de-janeiro.jpg?quality=70&format=pjpg");
		place3.setCreatedAt(Instant.parse("2021-06-20T19:53:07Z"));
		place3.setUpdatedAt(Instant.now().with(ChronoField.NANO_OF_SECOND, 0));
		
		Place place4 = new Place();
		place4.setName("Mineirao");
		place4.setSlug("teste");
		place4.setCity("Belo Horizonte");
		place4.setState("Minas Gerais");
		place4.setPrice(100.00);
		place4.setImg("https://www.guinnessworldrecords.com.br/Images/Villa-Mix-Header_tcm28-505418.jpeg");
		place4.setCreatedAt(Instant.parse("2020-06-20T19:53:07Z"));
		place4.setUpdatedAt(Instant.now().with(ChronoField.NANO_OF_SECOND, 0));
		
		Place place5 = new Place();
		place5.setName("Beira Rio");
		place5.setSlug("teste");
		place5.setCity("Porto Alegre");
		place5.setState("Rio Grande do Sul");
		place5.setPrice(700.00);
		place5.setImg("https://www.rbsdirect.com.br/imagesrc/25210335.jpg?w=1024&h=768&a=c");
		place5.setCreatedAt(Instant.parse("2022-06-20T19:53:07Z"));
		place5.setUpdatedAt(Instant.now().with(ChronoField.NANO_OF_SECOND, 0));
		
		Place place6 = new Place();
		place6.setName("Fortaleza");
		place6.setSlug("ssfsafaiufjiaufjiaufj");
		place6.setCity("Porto Alegre");
		place6.setState("Rio Grande do Sul");
		place6.setPrice(400.00);
		place6.setImg("https://a.cdn-hotels.com/gdcs/production74/d54/79c669d3-5325-4c3f-94d2-e76d7f3fabc4.jpg");
		place6.setCreatedAt(Instant.parse("2022-06-20T19:53:07Z"));
		place6.setUpdatedAt(Instant.now().with(ChronoField.NANO_OF_SECOND, 0));
		
		
		
		placeRepository.saveAll(Arrays.asList(place1, place2, place3, place4, place5, place6));
		
	}

}
