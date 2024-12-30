package com.Backend.Trailer.course;

import java.time.LocalDateTime;

import lombok.Builder;
import lombok.Data;
@Data
@Builder
public class TrailResDto2 {
private int id;
private String name;
private int price;
private LocalDateTime createdAt;
private LocalDateTime updatedAt;
}
