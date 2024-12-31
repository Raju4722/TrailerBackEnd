package com.Backend.Trailer.Entity;

import java.time.LocalDateTime;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import jakarta.annotation.Nullable;
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
	
	private int id;
	@Column(nullable = false)
	private String name;
    @Min(100)
    @Max(10000000)
	private int price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
	
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;
	

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
	@PrePersist
	public void prepersis() {
		this.createdAt=LocalDateTime.now();
		this.updatedAt=LocalDateTime.now();
	}
	@PreUpdate
	public void prepersist() {
		this.updatedAt=LocalDateTime.now();
	}

	@Override
	public String toString() {
		return "TrailEntity [id=" + id + ", name=" + name + ", price=" + price + ", createdAt=" + createdAt
				+ ", updatedAt=" + updatedAt + "]";
	}
}
