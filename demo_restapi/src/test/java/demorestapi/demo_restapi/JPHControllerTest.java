package demorestapi.demo_restapi;

import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import org.springframework.test.web.servlet.MockMvc;
import demorestapi.demo_restapi.controller.impl.JPHController;
import demorestapi.demo_restapi.model.dto.UserDto;
import demorestapi.demo_restapi.model.dto.UserDto.Company;
import demorestapi.demo_restapi.service.JPHService;

@WebMvcTest(controllers= JPHController.class)
public class JPHControllerTest {
  //assumption
  //! mock List<UserDto>

  //要test 有無做多野/多第2個野
  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private JPHService jphService;


  @Test
  void testGetJPHUsers() throws Exception{
    //assumption
    //! mock List<UserDto>
    UserDto userDto = UserDto.builder()
      .id(1L)
      .name("Lucas")
      .email("lucas@gmail.com")
      .phone("12345678")
      .website("lusas.com")
      .address(new UserDto.Address("1","2","3","4", 
      new UserDto.Address.GEO("99","-99")))
      .company(new Company("1","2","3"))
      .build();
    List<UserDto> mockUserDtos = new ArrayList<>();
    mockUserDtos.add(userDto);

    Mockito.when(jphService.getJPHUsers()).thenReturn(mockUserDtos);
    //test
    this.mockMvc.perform(get("v1/jph/users"))
      .andExpect(status().isOk())
      .andExpect(content().contentType("application/json"))
      .andExpect(jsonPath("$[0].latitude").value("99")) //! rename attribute in contoller
      .andExpect(jsonPath("$[0].longitude").value("-99")); //! rename attribute in controller

    //! verify if the mocked method being called 1 time only
    verify(jphService, times(1)).getJPHUsers(); //是否call了一次? => ture,
    //if 2time => false

    //unit test 不會理人地有沒有call / 成功call 你
      
  }

//mock 可以mock一個autowired的class

//webmvc --only web bean
//.parma can try
//spring no need injectmock

//ioc 由無spring to 有spring  , java 自已要new object, now(spring) no need new
//DI -- autowried
 //!spring 會ensure the object is not null , but java can't 
//!if use autowried, no need add constructor injection
}
