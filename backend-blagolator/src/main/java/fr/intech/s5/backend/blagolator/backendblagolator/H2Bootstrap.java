package fr.intech.s5.backend.blagolator.backendblagolator;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import fr.intech.s5.backend.blagolator.backendblagolator.entity.Joke;
import fr.intech.s5.backend.blagolator.backendblagolator.repository.JokeRepository;

@Component
public class H2Bootstrap implements CommandLineRunner {
	
	@Autowired
	JokeRepository jokeRepository;
	
	@Override
	public void run(String... arg0) throws Exception {
		System.out.println("Bootstrapping data : ");
		
		jokeRepository.save(new Joke("Enfant", "Pourquoi j'appelle mon pénis 'Vérité' ? !! Car la vérité sort toujours de la bouche des enfants"));
		jokeRepository.save(new Joke("Famille", "Quel est le point commun entre une tarte est une chatte ? !! La tarte à ta graand-mère tu peux la bouffer"));
		jokeRepository.save(new Joke("Enfant", "Quelle est la différence entre un surdoué et un pedophile ? !! Y'en a pas, ils ont tous les deux sauté la classe de CP"));
		jokeRepository.save(new Joke("Enfant", "C'est quoi la différence entre un enfant et du vin ? !! Y en a pas, les meilleurs ont entre 8 et 10 ans, et sont dans ma cave."));
		jokeRepository.save(new Joke("Autre", "C'est quoi la différence entre une pute et une pizza ? !! La pizza tu peux la commander sans champignon."));
		jokeRepository.save(new Joke("Autre", "Dans les comptes, les princesses époussent les preux chevaliers. !! Est-ce qu'on peut dire qu'elles donne leurs chattes aux forts ?"));
		jokeRepository.save(new Joke("Autre", "Qu'est-ce qui plaît à 9 personnes sur 10 ? !! Un viol collectif."));
		jokeRepository.save(new Joke("Autre", "C'est quoi la différence entre Jésus et un tableau ? !! Le tableau ça lui prend juste un clou"));
		jokeRepository.save(new Joke("Juif", "Quelle est la différence entre les juifs et une pizza ? !! Le temps de cuisson"));
		jokeRepository.save(new Joke("Juif", "Monsieur et Madame JUIF on un fils, comment s'appelle-t-il ? !! Gaston JUIF [Gaz ton JUIF]"));
		
		Iterable<Joke> itr = jokeRepository.findAll();
		
		System.out.println("Printing out data : ");
		for (Joke joke : itr)
		{
			System.out.println(joke.getDescription());
		}

	}
	
}
