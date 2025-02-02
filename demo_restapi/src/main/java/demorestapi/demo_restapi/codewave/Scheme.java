package demorestapi.demo_restapi.codewave;

public enum  Scheme {
  HTTP,HTTPS,;

  public String toLowerCase(){
    return this.name().toLowerCase();
  }
  
}
