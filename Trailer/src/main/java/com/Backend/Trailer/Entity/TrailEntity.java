package com.Backend.Trailer.Entity;

import java.time.LocalDateTime;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
@Data
@Setter
@Getter
@Entity(name="Trailer")
public class TrailEntity {
	@Id
	@NotNull
	private int id;
	@Column(nullable=false,length=15)
	private String name;
	@Min(100)
	@Max(100000)
	private int price;
	
//	private LocalDateTime createdAt;
//	private LocalDateTime updatedAt;
//	@PrePersist
//	public void prepersis() {
//		this.createdAt=LocalDateTime.now();
//		this.updatedAt=LocalDateTime.now();
//	}
//	@PreUpdate
//	public void prepersist() {
//		this.updatedAt=LocalDateTime.now();
//	}
}
