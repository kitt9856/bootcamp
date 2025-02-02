package demorestapi.demo_restapi.service;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

import demorestapi.demo_restapi.model.dto.UserDto;

//https://jsonplaceholder.typicode.com/users
public interface  JPHService {
  @GetMapping(value="/jph/users")
  List<UserDto>  getJPHUsers();
  
  

}
