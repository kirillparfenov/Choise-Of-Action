package com.game.choice_of_action;

import com.game.choice_of_action.example.story.Start;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan({"com.game.choice_of_action"})
@EnableJpaRepositories("com.game.choice_of_action")
@SpringBootApplication(scanBasePackages = "com.game.choice_of_action")
@OpenAPIDefinition(info = @Info(title = "Choice of Action API", version = "0.1", description = "Information about end points"))
public class ChoiceOfActionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChoiceOfActionApplication.class, args);

		/*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.register(EntityManagerFactory.class);
		context.register(HumanArcherDaoImpl.class);
		context.register(HumanArcherServiceImpl.class);
		context.refresh();*/

		new Start().startMenu();
		// TODO сделать сохранение персонажа.
	}

}
