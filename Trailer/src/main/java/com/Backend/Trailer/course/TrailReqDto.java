package com.Backend.Trailer.course;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TrailReqDto {
	private int id;
	private String name;
	private int price;
}
