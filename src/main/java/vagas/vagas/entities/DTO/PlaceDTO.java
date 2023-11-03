package vagas.vagas.entities.DTO;

import java.time.Instant;
import java.util.Objects;

import vagas.vagas.entities.Place;

public class PlaceDTO {
	
	private Long id;
	private String name;
	private String slug;
	private String city;
	private String state;
	private Double price;
	private String img;
	private Instant createdAt;
	private Instant updatedAt;
	
	
	public PlaceDTO() {
		
	}


	public PlaceDTO(Long id, String name, String slug, String city, String state, Double price, String img, Instant createdAt,
			Instant updatedAt) {
		this.id = id;
		this.name = name;
		this.slug = slug;
		this.city = city;
		this.state = state;
		this.price = price;
		this.img = img;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
	}
	
	public PlaceDTO (Place place) {
		id = place.getId();
		name= place.getName();
		slug = place.getSlug();
		city = place.getCity();
		state = place.getState();
		price = place.getPrice();
		img = place.getImg();
		createdAt = place.getCreatedAt();
		updatedAt = place.getUpdatedAt();
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getSlug() {
		return slug;
	}


	public void setSlug(String slug) {
		this.slug = slug;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}
	
	
	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	public String getImg() {
		return img;
	}


	public void setImg(String img) {
		this.img = img;
	}


	public Instant getCreatedAt() {
		return createdAt;
	}


	public void setCreatedAt(Instant createdAt) {
		this.createdAt = createdAt;
	}


	public Instant getUpdatedAt() {
		return updatedAt;
	}


	public void setUpdatedAt(Instant updatedAt) {
		this.updatedAt = updatedAt;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PlaceDTO other = (PlaceDTO) obj;
		return Objects.equals(id, other.id);
	}


	@Override
	public String toString() {
		return "PlaceDTO [id: " + id +
				", name: " + name +
				", slug: " + slug + 
				", city: " + city + 
				", state: " + state +
				", createdAt: " + createdAt +
				", updatedAt: " + updatedAt +
				"]";
	}
	
	

}
