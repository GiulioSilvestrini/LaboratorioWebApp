package web.pack.controllers;

import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import web.pack.models.Recensioni;
import web.pack.repositories.RecensioniRepository;

@RestController
public class RecensioniController {

    private final RecensioniRepository recensioniRepository;
    
    public RecensioniController(RecensioniRepository repository) {
		recensioniRepository = repository;
	}

    //READ
	@GetMapping("/recensioni")
	Iterable<Recensioni> getRecensioni(){
		return recensioniRepository.findAll();
	}

    @GetMapping("/recensioni/{recensioniId}")
	Optional<Recensioni> getRecensioni(@PathVariable Long recensioniId)
	{
//		Optional<recensioni> opt = recensioniRepository.findById(recensioniId);
//		
//		recensioni n = opt.orElseThrow();
		return recensioniRepository.findById(recensioniId);
		
	}

    //CREATE
	@PostMapping("/recensioni")
	Recensioni createRecensioni(@RequestBody Recensioni newRecensioni)
	{
		return recensioniRepository.save(newRecensioni);
	}

    //UPDATE
	@PutMapping("recensioni/{recensioniId}/update")
	Recensioni updateRecensioni(@PathVariable Long recensioniId, @RequestBody Recensioni recensioniDto)
	{
		//provare anche con orelsethrow
		Recensioni n = recensioniRepository.findById(recensioniId).get();
		
		n.setTitle(recensioniDto.getTitle());
		n.setContent(recensioniDto.getContent());
		
		return recensioniRepository.save(n);
	}

    //DELETE
	@DeleteMapping("recensioni/{recensioniId}/delete")
	String deleteRecensioni(@PathVariable Long recensioniId) {
		Recensioni n = recensioniRepository.findById(recensioniId).get();
		
		recensioniRepository.delete(n);
		
		return "eliminazione avvenuta";
	}

 // glie dovemo cambia nome!!
    @GetMapping("/form")
	public String getFormPage() {
		return "form"; // Assuming "form" is the name of your HTML file
	}
}