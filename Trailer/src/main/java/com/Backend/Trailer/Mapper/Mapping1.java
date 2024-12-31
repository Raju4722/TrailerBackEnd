package com.Backend.Trailer.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.Backend.Trailer.Entity.TrailEntity;
import com.Backend.Trailer.course.TrailReqDto;
import com.Backend.Trailer.course.TrailResDto2;

@Mapper
public interface Mapping1 {
	Mapping1 INSTANCE = Mappers.getMapper(Mapping1.class);
	@Mapping(target="id" ,source="id" )
	@Mapping(target="name", source="name" )
	@Mapping(target="price" ,source="price" )
	@Mapping(target="createdAt", source="createdAt" )
	@Mapping(target="updatedAt", source="updatedAt" )
	TrailResDto2 toDto(TrailEntity trailentity);
	
	@Mapping(target="id",source="id")
	@Mapping(target="name",source=" name")
	@Mapping(target="price ",source=" price")
	TrailEntity toEntity(TrailReqDto trail);
}
