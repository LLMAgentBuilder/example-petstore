package io.github.llmagentbuilder.example.csvprocessor;

import io.github.llmagentbuilder.tool.petstore.ApiClient;
import io.github.llmagentbuilder.tool.petstore.api.PetApi;
import io.github.llmagentbuilder.tool.petstore.api.PetApiAgentToolConfiguration;
import io.github.llmagentbuilder.tool.petstore.api.StoreApi;
import io.github.llmagentbuilder.tool.petstore.api.StoreApiAgentToolConfiguration;
import io.github.llmagentbuilder.tool.petstore.api.UserApi;
import io.github.llmagentbuilder.tool.petstore.api.UserApiAgentToolConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({PetApiAgentToolConfiguration.class,
    StoreApiAgentToolConfiguration.class, UserApiAgentToolConfiguration.class})
public class AppConfiguration {

  @Bean
  public ApiClient apiClient() {
    ApiClient apiClient = new ApiClient();
    apiClient.updateBaseUri("http://localhost:8082/api/v3");
    return apiClient;
  }

  @Bean
  public PetApi petApi(ApiClient apiClient) {
    return new PetApi(apiClient);
  }

  @Bean
  public StoreApi storeApi(ApiClient apiClient) {
    return new StoreApi(apiClient);
  }

  @Bean
  public UserApi userApi(ApiClient apiClient) {
    return new UserApi(apiClient);
  }
}
