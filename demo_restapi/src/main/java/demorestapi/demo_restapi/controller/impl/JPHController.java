package demorestapi.demo_restapi.controller.impl;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demorestapi.demo_restapi.controller.JPHOperation;
import demorestapi.demo_restapi.dto.UserDTO;
import demorestapi.demo_restapi.model.dto.UserDto;
import demorestapi.demo_restapi.service.JPHService;
import demorestapi.demo_restapi.service.impl.JPHServiceHolder;

@RestController
@RequestMapping(value = "/v1")
public class JPHController implements JPHOperation  { //use got json data to return 自己加工的data


//依賴注入 (dependency injection)
//Server start: compoent scan -> find annotations & create beans 
//-> during the process, create those bean without dependecy first
//-> until all required beans being created successfully -> server start complete.

//field injection
  @Autowired  //Get Bean from spring context  //or want to ensure bean
  private  JPHService jphService; //this object is no 狀態
  //! implicate this file must have JPHServiceHolder first

  //@Autowired
  //private String tutor; //which String?tutor or tutor2? spring can't know if no rename(name=XX)

  @Autowired
  @Qualifier(value="tutot1") //要找tutor1
  private String tutor;


  //第一代
  //constructor injection
 /*  public JPHController( JPHServiceHolder jphServiceHolder){
    this.jphServiceHolder = jphServiceHolder;
  } */

  @Override
  public List<UserDTO> getJPHUsers(){
  //List<User> -> List<UserDto>

  //return  new JPHServiceHolder() new 1million time???
      return this.jphService.getJPHUsers().stream()
        .map(  e -> {
          return UserDTO.builder()
          .id(e.getId())
          .name(e.getName())
          .username(e.getUsername())
          .email(e.getEmail())
          .phone(e.getPhone())
          .website(e.getWebsite())
          .lat(e.getAddress().getGeo().getLat())
          .lng(e.getAddress().getGeo().getLng())
          .companyName(e.getCompany().getName())
          .build();
        }).collect(Collectors.toList());
  }
}

//bean similar to static enum...
//bean happen before server start
//bean 不會空指針 如空server會start不到