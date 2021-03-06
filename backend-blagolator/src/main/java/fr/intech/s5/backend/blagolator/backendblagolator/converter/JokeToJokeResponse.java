package fr.intech.s5.backend.blagolator.backendblagolator.converter;

import org.springframework.core.convert.converter.Converter;

import fr.intech.s5.backend.blagolator.backendblagolator.entity.Joke;
import fr.intech.s5.backend.blagolator.backendblagolator.request.JokeResponse;
import fr.intech.s5.backend.blagolator.backendblagolator.util.BackendConstantes;

public class JokeToJokeResponse implements Converter<Joke, JokeResponse> {
	@Override
	public JokeResponse convert(Joke joke) {
		JokeResponse jokeResponse = new JokeResponse();
		jokeResponse.setJokeId(joke.getJokeId());
		jokeResponse.setCategory(joke.getCategory());
		jokeResponse.setDescription(joke.getDescription());
		jokeResponse.setUri(BackendConstantes.JOKE + "/" + joke.getJokeId());
		
		return jokeResponse;
		
		
	}
}
