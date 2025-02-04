package demorestapi.demo_restapi.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import demorestapi.demo_restapi.codewave.Scheme;
import demorestapi.demo_restapi.model.dto.UserDto;
import demorestapi.demo_restapi.service.JPHService;

// Controller (GetMapping)
// controller -> service 給controller call
@Service
public class JPHServiceHolder implements JPHService{ //人地call你 你call人地(return比人地)

  //here is no attritude 

  @Autowired
  private RestTemplate restTemplate;

 /*  @Override
  public List<UserDto> getJPHUsers(){
    UserDto[] users = new RestTemplate().getForObject("https://jsonplaceholder.typicode.com/users", UserDto[].class);

    return Arrays.asList(users);
  } */

  //annotation @value -> 
  //find the target value in the yml file. if not found, server start fail.
  @Value("${api.jph.domain}")
  private String domain;

  @Value("${api.jph.user.endpoint}")
  private String userEndpoint;

  @Override
  public List<UserDto> getJPHUsers(){
    String url = UriComponentsBuilder.newInstance()
    .scheme(Scheme.HTTPS.toLowerCase())
    .host(this.domain)
    .path(this.userEndpoint)
    .build()
    .toUriString();  //build url
    //System.out.println(url); //for debug
    //UserDto[] users = this.restTemplate.getForObject("https://".concat(domain).concat(user)users, UserDto[].class);
    UserDto[] users = this.restTemplate.getForObject(url, UserDto[].class); //is agency
    return  Arrays.asList(users);
  }

}
//cause by --debug see error