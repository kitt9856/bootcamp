package demorestapi.demo_restapi.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

//design for connecting with service provider (call other service)
@Getter  //json only getter just ok
@Builder //for testing, not must
public class UserDto { //get from user/fronend

    private Long id; //Long obj can null
    private String name;  //json 不看次序
    private String username;
    private String email;
    private Address address;
    private String phone;
    private String website;
    private Company company;

    @Getter
    @AllArgsConstructor
    public static class Company {
        private String name;
        private String catchPhrase;
        @JsonProperty(value = "bs") //bs --orginal income json value
        private String business; //=> getBusiness
    }

    @Getter
    @AllArgsConstructor
    public static class Address {

        private String street;
        private String suite;
        private String city;
        private String zipcode;
        private GEO geo;

        @Getter
        @AllArgsConstructor
        public static class GEO {
            private String lat;
            private String lng;

        }
    }

}
