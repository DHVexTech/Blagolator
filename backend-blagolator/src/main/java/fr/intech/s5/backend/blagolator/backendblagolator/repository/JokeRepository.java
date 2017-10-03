package fr.intech.s5.backend.blagolator.backendblagolator.repository;

import org.springframework.data.repository.CrudRepository;

import fr.intech.s5.backend.blagolator.backendblagolator.entity.Joke;

public interface JokeRepository extends CrudRepository<Joke, Long> {
	Joke findByJokeId(Long jId);
}
