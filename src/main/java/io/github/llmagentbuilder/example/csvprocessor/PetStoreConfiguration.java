package io.github.llmagentbuilder.example.csvprocessor;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "petstore")
public record PetStoreConfiguration(String baseUrl) {

}
