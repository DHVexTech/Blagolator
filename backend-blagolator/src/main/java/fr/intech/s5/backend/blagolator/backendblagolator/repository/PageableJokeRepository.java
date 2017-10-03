package fr.intech.s5.backend.blagolator.backendblagolator.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import fr.intech.s5.backend.blagolator.backendblagolator.entity.Joke;

public interface PageableJokeRepository extends PagingAndSortingRepository<Joke, Long> {
	
	Page<Joke> findByJokeId(Long jId, Pageable jPage);

	@Query("select j from Joke j where j.category LIKE :category")
	public Page<Joke> findByCategory(@Param("category") String category, Pageable pageable);
	
}
