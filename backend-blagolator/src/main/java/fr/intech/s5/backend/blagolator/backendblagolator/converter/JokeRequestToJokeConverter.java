package fr.intech.s5.backend.blagolator.backendblagolator.converter;

import org.springframework.core.convert.converter.Converter;

import fr.intech.s5.backend.blagolator.backendblagolator.entity.Joke;
import fr.intech.s5.backend.blagolator.backendblagolator.request.JokeRequest;

public class JokeRequestToJokeConverter implements Converter<JokeRequest, Joke> {

	@Override
	public Joke convert(JokeRequest jokeRequest)
	{
		Joke joke = new Joke();
		joke.setCategory(jokeRequest.getCategory());
		joke.setDescription(jokeRequest.getDescription());
		if (null != jokeRequest.getJokeId())
			joke.setJokeId(jokeRequest.getJokeId());
		return joke;
	}
}
