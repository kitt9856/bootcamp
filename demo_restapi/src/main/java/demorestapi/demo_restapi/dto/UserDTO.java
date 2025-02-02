package demorestapi.demo_restapi.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserDTO { //need to return output customer

  private Long id; //Long obj can null
  private String name;  //json 不看次序
  private String username;
  private String email;
  private String phone;
  private String website;
  @JsonProperty(value="latitude")
  private String lat;
  @JsonProperty(value="longitude")
  private String lng;
  private String companyName;

}
