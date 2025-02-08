package demorestapi.demo_restapi.dto.mapper;

import org.springframework.stereotype.Component;

import demorestapi.demo_restapi.dto.UserDTO;
import demorestapi.demo_restapi.model.dto.UserDto;

//! similar to @contoller/@service, when server start, create Spring Bean into context
@Component //bean
public class JPHMapper { //no state as no attritude
 
  

  public UserDTO map(UserDto e){
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
  }

}


//warning just version suggestion
