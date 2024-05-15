package io.github.llmagentbuilder.example.csvprocessor;

import io.github.llmagentbuilder.spring.agentcontroller.AgentControllerConfiguration;
import io.github.llmagentbuilder.spring.dev.AgentDevConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import({AgentDevConfiguration.class, AgentControllerConfiguration.class})
public class PetStoreApplication {

  public static void main(String[] args) {
    SpringApplication.run(PetStoreApplication.class, args);
  }
}
