package web.pack.controllers;

import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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

}