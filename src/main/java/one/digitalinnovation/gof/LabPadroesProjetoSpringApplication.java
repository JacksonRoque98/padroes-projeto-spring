package one.digitalinnovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;



/*
* Projeto Spring boot gerado pelo Spring Initializr
* Os seguintes modulos foram selecionados
* - Spring Data JPA
* - Spring Web
* - H2 Database
* - OpenFeign
*
* @author JacksonRoque98*/


@EnableFeignClients
@SpringBootApplication
public class LabPadroesProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabPadroesProjetoSpringApplication.class, args);
	}

}
