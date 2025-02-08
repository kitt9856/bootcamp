package demorestapi.demo_restapi.entity.mapper;

import org.springframework.stereotype.Component;

import demorestapi.demo_restapi.entity.UserEntity;
import demorestapi.demo_restapi.model.dto.UserDto;

@Component
public class JPHEntityMapper {

  public UserEntity map(UserDto e){
    return UserEntity.builder()
      .name(e.getName())
      .username(e.getUsername())
      .email(e.getEmail())
      .phone(e.getPhone())
      .website(e.getWebsite()).latitude(e.getAddress()
      .getGeo().getLat())
      .longitude(e.getAddress().getGeo().getLng())
      .companyname(e.getCompany().getName())
      .build();
  }
  
}
