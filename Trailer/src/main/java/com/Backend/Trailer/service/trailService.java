package com.Backend.Trailer.service;

import java.util.List;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

import com.Backend.Trailer.Entity.TrailEntity;
import com.Backend.Trailer.Entity.TrailRepository;
import com.Backend.Trailer.Mapper.Mapping1;
import com.Backend.Trailer.course.TrailReqDto;
import com.Backend.Trailer.course.TrailResDto2;

@Service
public class trailService {
	private TrailRepository repo;
	public trailService(TrailRepository repo) {
		super();
		this.repo = repo;
	}
//
   private  final static Mapping1 mapper=Mapping1.INSTANCE;
//	PersonMapper.INSTANCE.personToPersonDTO(person)
	

	public List<TrailResDto2> findingAll() {
		List<TrailEntity> all1 = repo.findAll();
		
		return all1.stream().map(mapper::toDto).toList();
	}

	public void saves(TrailReqDto abc) {
      TrailEntity entity = mapper.toEntity(abc);
      repo.save(entity);
	}

}
