package demorestapi.demo_restapi.service.impl;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import demorestapi.demo_restapi.codewave.Scheme;
import demorestapi.demo_restapi.entity.UserEntity;
import demorestapi.demo_restapi.entity.mapper.JPHEntityMapper;
import demorestapi.demo_restapi.model.dto.UserDto;
import demorestapi.demo_restapi.repository.UserRepository;
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

  //! Hibernate generate class (implements UserRepository)
  // Create bean -> put context
  @Autowired
  private UserRepository userRepository;

  @Autowired
  private JPHEntityMapper entityMapper;

   //只要有人call this method就會改DB,save,find....
  public List<UserEntity> saveAll(List<UserEntity> userEntities){
    return  userRepository.saveAll(userEntities);
  }

  public UserEntity save(UserEntity userEntities){
    return  userRepository.save(userEntities);
  }

  //= Select * from Users;
  public List<UserEntity> findAll(){
    return  userRepository.findAll();
  }

  public UserEntity findById(Long id){
    return  userRepository.findById(id)
      .orElseThrow(() -> new RuntimeException());
  }

  


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

    //call JPH service
    UserDto[] users = this.restTemplate.getForObject(url, UserDto[].class); //is agency
    //convert from UserDto[] to List<UserEntity>
    List<UserEntity> userEntities = Arrays.asList(users).stream()
      .map(e -> entityMapper.map(e)) //XXclass.map中是用自已改的map()
      .collect(Collectors.toList());

    //insert into our Database
    this.saveAll(userEntities);
    return  Arrays.asList(users);
  }

}
//cause by --debug see error