package vagas.vagas.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import vagas.vagas.entities.DTO.PlaceDTO;
import vagas.vagas.service.PlaceService;

@Controller
public class PaginasResource {
	
	@Autowired
	PlaceService places;
		
	
	@GetMapping("/principal")
	public ModelAndView index() {
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("Places", places.findTOP());
		return mv;
		
	}
	
	
	@GetMapping("/Places")
	public ModelAndView Places() {
		ModelAndView mv = new ModelAndView("Places/Places");
		mv.addObject("Places", places.findAll());
		return mv;
	}
	
	@GetMapping("/Cadastro")
	public ModelAndView Cadastro() {
		ModelAndView mv = new ModelAndView("Places/Cadastro");
		return mv;
	}
	
	@PostMapping("/Places")
	public String insert(PlaceDTO placeDTO) {
		placeDTO = places.insert(placeDTO);
		return "redirect:/Places";
	}
	

}
