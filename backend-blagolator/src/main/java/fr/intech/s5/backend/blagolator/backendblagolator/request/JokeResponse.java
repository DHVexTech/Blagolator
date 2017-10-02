package fr.intech.s5.backend.blagolator.backendblagolator.request;

public class JokeResponse {
	private Long jokeId;
	private String category;
	private String description;
	private String Uri;
	
	public String getUri() {
		return Uri;
	}
	public void setUri(String uri) {
		Uri = uri;
	}
	public JokeResponse(Long jokeId, String category, String description) {
		super();
		this.jokeId = jokeId;
		this.category = category;
		this.description = description;
	}
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
	public JokeResponse() {
		super();
	}
	public JokeResponse(String category, String description) {
		super();
		this.category = category;
		this.description = description;
	}
}
