package demorestapi.demo_restapi;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.beans.factory.annotation.Autowired;
import  org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import ch.qos.logback.core.status.Status;
import demorestapi.demo_restapi.controller.impl.AnimalController;
import demorestapi.demo_restapi.model.Animal;
import demorestapi.demo_restapi.service.JPHService;

// Requires Beans
//in spring boot, one test file per test env.

@WebMvcTest (controllers=AnimalController.class)
//only test layer // For Web Layer Test, acquire Controller related 
//Beans into context  Web related Beans
//+ MockMVC Beans
public class AnimalControllerTest {
  @Autowired
  private MockMvc mockMvc; //something like postman

  @MockBean  //create fake object in collroter 
  //as test so no need real , fake is ok
  private JPHService jphService;

  

  @Test
  void testGetAllAnimals() throws Exception {
    Animal.addAnimal(new Animal(1, "Lucas"));
   // Animal.addAnimal(new Animal(2, "vicent"));

    this.mockMvc.perform(MockMvcRequestBuilders.get("v1/animals"))
    .andExpect(status().isOk())
    .andExpect(content().contentType("appllication/json"))
    .andExpect(jsonPath("$[0].id").value("1"))
    .andExpect(jsonPath("$[0].name").value("Lucas"));
   // .andExpect(MockMvcResultMatchers.jsonPath("$[0].id").value("Lucas")) 
   // .andExpect(MockMvcResultMatchers.jsonPath("$[0].name").value("Lucas")) 
   //json is 無序列,不會保證lucas是第一個
  }

  @Test
  void testGetAnmimalById() throws Exception{
    Animal.addAnimal(new Animal(1, "Lucas"));
    Animal.addAnimal(new Animal(2, "vicent"));
    this.mockMvc.perform(get("/v1/animal").param("animalId", "1"))
    .andExpect(status().isOk())
    .andExpect(content().contentType("application/json"))
    .andExpect(jsonPath("$.id").value("1"))
    .andExpect(jsonPath("$.name").value("Lucas"));
  }

  //post what return what
  @Test
  void testPostAnimal() throws Exception{
    this.mockMvc.perform(post("v1/animal")
    .content("{\"id\":1,\"Lucas\"}") //json on java   //content --json
    ) //perform() end
    .andExpect(status().isOk())
    .andExpect(content().contentType("application/json"))
    .andExpect(jsonPath("$.id").value("1"))
    .andExpect(jsonPath("$.name").value("Lucas"));

  assertEquals(1, Animal.animals[0].getId());
  assertEquals("Lucas", Animal.animals[0].getName());
  }




  }

