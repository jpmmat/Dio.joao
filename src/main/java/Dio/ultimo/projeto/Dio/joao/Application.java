package Dio.ultimo.projeto.Dio.joao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
/*Projeto para desenvolvimento e aprofundamento
 * de conhecimento
 *  - Spring DataJPA
 *  - Spring web
 *  - OpenFeign
 * 
 * @Joao
 */
@SpringBootApplication
@EnableFeignClients
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
