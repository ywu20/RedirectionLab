import java.util.*;
public class MakeStars{
  public static void main (String[] args){
    Scanner n=new Scanner(System.in);
    while(n.hasNextLine()){
      String x = n.nextLine();
      Scanner n2=new Scanner(x);
      while (n2.hasNext()){
        String xx=n2.next();
        for(int i=0;i<xx.length();i++){
          System.out.print('*');
        }
        System.out.print(' ');
      }
      System.out.println();
    }
  }
}
