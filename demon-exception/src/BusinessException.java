public class BusinessException extends RuntimeException {
  private Severity code; //1,2,3,4

  public BusinessException(String message,Severity  code){
    super(message);
    this.code=code;
  }

  public int getCode(){
    return this.code;
  }


  public BusinessException(String message){ //call parent's message
    super(message);
    this.code=1;
  }
}
