package org.isetn;

import java.util.Date;

import org.isetn.controllers.UserRepository;
import org.isetn.entity.Classe;
import org.isetn.entity.Etudiant;
import org.isetn.entity.Formation;
import org.isetn.entity.User;
import org.isetn.repos.ClasseRepository;
import org.isetn.repos.EtudiantRepository;
import org.isetn.repos.FormationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class ScolA7Application implements CommandLineRunner {
	@Autowired
	private FormationRepository formationRepository;

	@Autowired
	private ClasseRepository classeRepository;

	@Autowired
	private EtudiantRepository etudiantRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;

	public static void main(String[] args) {
		SpringApplication.run(ScolA7Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// Etudiant et = new Etudiant(null, "Ali", "Ben Ali", new Date());
		// etudiantRepository.save(et);
		// ou
		Formation f1 = formationRepository.save(new Formation(null, "Oracle", 100, null));
		Formation f2 = formationRepository.save(new Formation(null, "J2EE", 10, null));
		Formation f3 = formationRepository.save(new Formation(null, "Angular", 120, null));

		Classe c1 = classeRepository.save(new Classe(null, "DSI23", 27, null));
		Classe c2 = classeRepository.save(new Classe(null, "DSI22", 25, null));
		Classe c3 = classeRepository.save(new Classe(null, "DSI21", 20, null));

		User u1 = userRepository.save(new User(null, "admin@gmail.com", "admin"));

		etudiantRepository.save(new Etudiant(null, "Ali", "Ben Ali", new Date(), f1, c1));
		etudiantRepository.save(new Etudiant(null, "Mohamed", "Ben Mohamed", new Date(), f1, c1));
		etudiantRepository.save(new Etudiant(null, "Amin", "Ben Mahmoud", new Date(), f2, c1));
		etudiantRepository.save(new Etudiant(null, "Samia", "Ben Ahmed", new Date(), f3, c1));
		etudiantRepository.save(new Etudiant(null, "Foulen", "Ben Foulen1", new Date(), f3, c2));
		etudiantRepository.save(new Etudiant(null, "Foulen", "Ben Foulen2", new Date(), f3, c3));
	}
}
