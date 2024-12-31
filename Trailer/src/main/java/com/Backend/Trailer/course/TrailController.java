package com.Backend.Trailer.course;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Backend.Trailer.Entity.TrailEntity;
import com.Backend.Trailer.Entity.TrailRepository;
import com.Backend.Trailer.service.trailService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/courses")
//@RequiredArgsConstructor
public class TrailController {
	private trailService repo;
	public TrailController() {}
	public TrailController(trailService repo) {
		this.repo = repo;
	}
  
	

	@GetMapping
	public  	ResponseEntity<List<TrailResDto2>> getAllCourses() {
		List<TrailResDto2> all = repo.findingAll();
		return ResponseEntity.ok(all);
	}
	@PostMapping
	public String Putting(@RequestBody TrailReqDto abc) {
		
	repo.saves(abc);
	return "redirect:courses";
	}
//	@GetMapping("/{id}")
//	public Optional<TrailEntity> getone(@PathVariable int id) {
//		Optional<TrailEntity> getid = repo.findById(id);
//		return getid;
//	}
//	@DeleteMapping("/{id}")
//	public String delete(@PathVariable int id) {
//		repo.deleteById(id);
//		return "redirect:courses";
//		
//	}
}
