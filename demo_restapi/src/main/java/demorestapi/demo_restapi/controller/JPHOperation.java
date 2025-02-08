package demorestapi.demo_restapi.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import demorestapi.demo_restapi.dto.UserDTO;

//postman -> controller -> Service -> JPH
public interface  JPHOperation {
  @GetMapping(value="/jph/users")
  public List<UserDTO> getJPHUsers();
  
  
}
