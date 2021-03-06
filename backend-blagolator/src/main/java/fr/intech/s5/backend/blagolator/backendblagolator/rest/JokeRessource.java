package fr.intech.s5.backend.blagolator.backendblagolator.rest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
//import org.springframework.core.convert.ConversionService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import fr.intech.s5.backend.blagolator.backendblagolator.repository.JokeRepository;
import fr.intech.s5.backend.blagolator.backendblagolator.util.BackendConstantes;
import fr.intech.s5.backend.blagolator.backendblagolator.request.JokeRequest;
import fr.intech.s5.backend.blagolator.backendblagolator.request.JokeResponse;
import fr.intech.s5.backend.blagolator.backendblagolator.entity.Joke;
import fr.intech.s5.backend.blagolator.backendblagolator.repository.JokeRepository;
import fr.intech.s5.backend.blagolator.backendblagolator.repository.PageableJokeRepository;
import fr.intech.s5.backend.blagolator.backendblagolator.converter.JokeToJokeResponse;

@RestController
@RequestMapping(BackendConstantes.JOKE)
public class JokeRessource {
	@Autowired
	private PageableJokeRepository pageableJokeRepository;
	
	@Autowired
	private JokeRepository jokeRepository;
		
	@Autowired
	private ConversionService conversionService;
	
	@RequestMapping(path="", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)	
	public Page<JokeResponse> getJokes(Pageable pageable)
	{
		Page<Joke> JokeList = pageableJokeRepository.findAll(pageable);
		return JokeList.map(new JokeToJokeResponse());
	}
	
	@RequestMapping(path="/{category}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public Page<JokeResponse> getJokeByCategory(@PathVariable String category, Pageable pageable)
	{
		Page<Joke> JokeList = pageableJokeRepository.findByCategory(category, pageable);
		Math.random();
		return JokeList.map(new JokeToJokeResponse());
	}
	
	@RequestMapping(path="/create", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<JokeResponse> createJoke(@RequestBody JokeRequest jokeRequest)
	{
		Joke joke = conversionService.convert(jokeRequest, Joke.class);
		jokeRepository.save(joke);
		JokeResponse jokeResponse = conversionService.convert(joke, JokeResponse.class);
		return new ResponseEntity<> (jokeResponse, HttpStatus.CREATED);
	}

}
