public class BusinessException extends RuntimeException {
  private Severity severity; //1,2,3,4

  public BusinessException(String message,Severity  severity){
    super(message);
    this.severity=severity;
  }

  public Severity getCode(){
    return this.severity;
  }


  public BusinessException(String message){ //call parent's message
    super(message);
    //this.severity=1;
    this.severity = Severity.LOW;
  }
}
