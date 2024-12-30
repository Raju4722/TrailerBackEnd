package com.Backend.Trailer.course;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Backend.Trailer.Entity.TrailEntity;
import com.Backend.Trailer.Entity.TrailRepository;

import lombok.RequiredArgsConstructor;

@RestController
//@RequiredArgsConstructor
@RequestMapping("/courses")
public class TrailController {
	private TrailRepository repo;

	public TrailController(TrailRepository repo) {
		this.repo = repo;
	}

	@GetMapping("/ab")
	public List<TrailEntity> getAllCourses() {
		List<TrailEntity> all = repo.findAll();
		return all;
	}
	@PostMapping
	public void Putting(@RequestBody TrailEntity ac) {
		repo.save(ac);
	}
	@GetMapping("/{id}")
	public Optional<TrailEntity> getone(@PathVariable int id) {
		Optional<TrailEntity> getid = repo.findById(id);
		return getid;
	}
	@DeleteMapping("/{id}")
	public String delete(@PathVariable int id) {
		repo.deleteById(id);
		return "redirect:courses";
		
	}
}
