package com.unaj.ajsw.tp;

import com.unaj.ajsw.tp.model.Usuario;
import com.unaj.ajsw.tp.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TpApplication implements CommandLineRunner {

private final UsuarioRepository userRepository;
@Autowired
public TpApplication(UsuarioRepository userRepository){
	this.userRepository=userRepository;

}
	public static void main(String[] args) {
		SpringApplication.run(TpApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	if(userRepository.findAll().isEmpty()){
		userRepository.save(new Usuario("Pablo","Vazquez"));
		userRepository.save(new Usuario("Pablo","Vasques"));
		};
	for (Usuario user : userRepository.findAll()){
		System.out.println(user);
	}
	}
}
