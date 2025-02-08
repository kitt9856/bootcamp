package demorestapi.demo_restapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import demorestapi.demo_restapi.entity.UserEntity;
import demorestapi.demo_restapi.repository.UserRepository;
import demorestapi.demo_restapi.service.UserService;

@Service
public class UserServiceHolder implements UserService {
  
  @Autowired
  private UserRepository userRepository;

  @Override
  public UserEntity save(UserEntity userEntity){
    return  userRepository.save(userEntity);
  }

}
//峰值 綬沖