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
    String out="";
    if(isAlpha(s.charAt(0))){
      out=s+"hay";
    }
    else{
      out=s.substring(1,s.length())+s.charAt(0)+"ay";
    }
    return out;
  }

  public static void main(String[] args){
    pigLatinSimple(args[0]);
  }
}
