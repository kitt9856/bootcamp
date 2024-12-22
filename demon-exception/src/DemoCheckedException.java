
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class DemoCheckedException {

  public static void main(String[] args) {
    Path filePath = Paths.get("someFile,txt");
    //Checked Exception: Compile fail
    // So , you have to "handle" (try-catch) this exception, so that you can compile the program
    List<String> lines = null;
    try {
      lines= Files.readAllLines(filePath); //readAllLInes()迫你try-catch
    } catch (IOException e) {  //IO = input output
      System.out.println("File is not found.Please check the file name.");
    }
    System.out.println(lines);

    //Custom Checked Exception
    int result = 0;
    try {
      result = calculate(-1, 9);//throw checked exception, so we have to try-catch

    } catch (BusinessException e) {
      result = -1;
      System.out.println(e.getMessage()); //x and y should...
    }
  }

  public static int calculate(int x, int y) throws BusinessException { //forward Exception to caller
    if(x < 0 || y < 0)
      throw new BusinessException("calculate(): x and y should be >= 0 .", Severity.HIGH);
    return x + y;
  }

  //login DB concept or file not found case
  
}
