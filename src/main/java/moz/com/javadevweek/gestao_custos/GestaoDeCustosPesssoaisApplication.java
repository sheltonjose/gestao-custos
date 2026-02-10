package moz.com.javadevweek.gestao_custos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class GestaoDeCustosPesssoaisApplication {

	public static void main(String[] args) {
		SpringApplication.run(GestaoDeCustosPesssoaisApplication.class, args);
	}

}
