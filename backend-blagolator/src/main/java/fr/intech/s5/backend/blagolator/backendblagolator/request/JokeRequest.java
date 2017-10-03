package fr.intech.s5.backend.blagolator.backendblagolator.request;

public class JokeRequest {
	public JokeRequest() {
		super();
	}
	public JokeRequest(String category, String description) {
		super();
		this.category = category;
		this.description = description;
	}
	public JokeRequest(String category, String description, Long jokeId) {
		super();
		this.category = category;
		this.description = description;
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
	public Long getJokeId() {
		return jokeId;
	}
	public void setJokeId(Long jokeId) {
		this.jokeId = jokeId;
	}
	private String category;
	private String description;
	private Long jokeId;
	
}
