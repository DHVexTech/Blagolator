package fr.intech.s5.backend.blagolator.backendblagolator.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="Joke")
public class Joke {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long jokeId;
	
	@NotNull
	private String category;
	
	@NotNull
	private String description;

	public Long getJokeId() {
		return jokeId;
	}

	public void setJokeId(Long jokeId) {
		this.jokeId = jokeId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Joke(Long jokeId, String category, String description) {
		super();
		this.jokeId = jokeId;
		this.category = category;
		this.description = description;
	}

	public Joke(String category, String description) {
		super();
		this.category = category;
		this.description = description;
	}

	public Joke() {
		super();
	}
	
	
}
