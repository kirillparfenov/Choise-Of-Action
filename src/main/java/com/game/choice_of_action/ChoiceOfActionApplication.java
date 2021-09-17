package com.game.choice_of_action;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "Choice of Action API", version = "0.1", description = "Information about end points"))
public class ChoiceOfActionApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChoiceOfActionApplication.class, args);
	}

}
