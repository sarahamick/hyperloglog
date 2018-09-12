import java.util.*;

public class Main{
  public static void main(String[] args){
    try{
      Scanner scanner = new Scanner(System.in);
      while(scanner.hasNext()){
        System.out.println(Hash.hashInt(scanner.nextInt()));
      }
    }
    catch(Exception e){
      e.printStackTrace();
    }
  }

}
