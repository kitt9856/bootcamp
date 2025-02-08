package demorestapi.demo_restapi.controller.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demorestapi.demo_restapi.controller.JPHOperation;
import demorestapi.demo_restapi.dto.UserDTO;
import demorestapi.demo_restapi.dto.mapper.JPHMapper;
import demorestapi.demo_restapi.model.dto.UserDto;
import demorestapi.demo_restapi.service.JPHService;

@RestController
@RequestMapping(value = "/v1")
public class JPHController implements JPHOperation  { //use got json data to return 自己加工的data


//依賴注入 (dependency injection)
//Server start: compoent scan -> find annotations & create beans 
//-> during the process, create those bean without dependecy first
//-> until all required beans being created successfully -> server start complete.

//field injection
  @Autowired  //Get Bean from spring context  //or want to ensure bean
  //mainly call bean 
  private  JPHService jphService; //this object is no 狀態
  //! implicate this file must have JPHServiceHolder first

  //@Autowired
  //private String tutor; //which String?tutor or tutor2? spring can't know if no rename(name=XX)

  //! example of Qualifer
  //@Autowired
  //@Qualifier(value="tutot1") //要找tutor1
  //private String tutor;


  //第一代
  //constructor injection
 /*  public JPHController( JPHServiceHolder jphServiceHolder){
    this.jphServiceHolder = jphServiceHolder;
  } */

  @Autowired
  private JPHMapper jphMapper;

  //convert UserDto to DTO
  @Override
  public List<UserDTO> getJPHUsers(){
  //List<User> -> List<UserDto>

  //return  new JPHServiceHolder() new 1million time???
      List<UserDto> userDtos = this.jphService.getJPHUsers();
      return  userDtos.stream()
        .map(e -> this.jphMapper.map(e))
        .collect(Collectors.toList());

  }
}

//bean similar to static enum...
//bean happen before server start
//bean 不會空指針 如空server會start不到