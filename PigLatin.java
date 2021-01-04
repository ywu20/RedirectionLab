import java.util.*;
public class PigLatin{
  public static boolean isAlpha(char c){
    char[] alpha = {'a','e','i','o','u'};
    for(int i=0;i<alpha.length;i++){
      if(c==alpha[i]){
        return true;
      }
    }
    return false;
  }
  public static String pigLatinSimple(String s){
    if(isAlpha(s.charAt(0))){
      System.out.println("true");
    }
    return "hi";
  }

  public static void main(String[] args){
    pigLatinSimple(args[0]);
  }
}
