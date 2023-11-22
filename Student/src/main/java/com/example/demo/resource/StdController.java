package com.example.demo.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Std;
import com.example.demo.repository.StdRepository;
@RestController
public class StdController {
	@Autowired
    private StdRepository repository;
	
	@PostMapping("/addStd")
	public String saveStd(@RequestBody Std std) {
		repository.save(std);
		return "Student added :"; 
	}
	@GetMapping("/findAllStds")
	public List<Std> getStds(){
		return repository.findAll();
	}
	@GetMapping("/findAllBooks/{id}")
	public Optional<Std> getStd(@PathVariable int stdId){
		return repository.findById(stdId);
	}
	@DeleteMapping("/delete/{id}")
	public String deleteStd(@PathVariable int stdId) {
		repository.deleteById(stdId);
		return "Student deleted with id : "+stdId;
	}
}

