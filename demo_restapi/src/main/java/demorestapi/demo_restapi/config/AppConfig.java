package demorestapi.demo_restapi.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

//for @Configuration, we create lots of beans under this class
@Configuration
public class AppConfig {
  //before server start, create one single RestTemplate object,
  //put it into spring content
  @Bean
  RestTemplate restTemplate(){ //as to spring call, so no need use public or private
    return new RestTemplate();
  }


/* 
  @Bean
  BigDecimal bigDecimal
 */
  
}
