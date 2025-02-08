package demorestapi.demo_restapi.entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

//Framework: jakarta

@Entity
@Table(name="Users")
@Getter
@Setter
@AllArgsConstructor
@Builder
public class UserEntity implements Serializable { //implements Serializable aim make DB no 亂碼
    //define PK
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY) //! auto_increment
    private Long id; //id is the table column name  //java would create table to DB
    private String name;  
    @Column(name="username")
    private String username;
    private String email;
    @Column(name="address_lat")
    private String latitude;
    @Column(name="address_lng")
    private String longitude;
    private String phone;
    private String website;
    @Column(name="company name")
    private String companyname;



}
