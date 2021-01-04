import java.util.*;
public class PigLatin{
  public static boolean isSpecial(String c, String[] arr){
    for(int i=0;i<arr.length;i++){
      if(c.equals(arr[i])){
        return true;
      }
    }
    return false;
  }
  public static String pigLatinSimple(String s){
    String out="";
    String[] alpha = {"a","e","i","o","u"};
    if(isSpecial(s.substring(0,1),alpha)){
      out=s+"hay";
    }
    else{
      out=s.substring(1,s.length())+s.charAt(0)+"ay";
    }
    return out;
  }

  public static String pigLatin(String s){
    String[] digraph= {"bl", "br", "ch", "ck", "cl", "cr", "dr", "fl", "fr", "gh", "gl", "gr", "ng", "ph", "pl", "pr", "qu", "sc", "sh", "sk", "sl", "sm", "sn", "sp", "st", "sw", "th", "tr", "tw", "wh", "wr"};
    String out="";
    if(isSpecial(s.substring(0,2),digraph)){
      out=s.substring(2,s.length())+s.substring(0,2)+"ay";
    }
    else{
      out=pigLatinSimple(s);
    }
    return out;
  }

public static String pigLatinBest(String s){
  String out="";
  if(! Character.isLetter(s.charAt(0))){
    out=s;
  }
  else if (! Character.isLetter(s.charAt(s.length()-1))){
    out=pigLatin(s.substring(0,s.length()-1))+s.charAt(s.length()-1);
  }
  else{
    out=pigLatin(s);
  }
  return out;
}
  public static void main(String[] args){
    //System.out.println(pigLatinSimple(args[0]));
    //System.out.println(pigLatin(args[0]));
    System.out.println(pigLatinBest(args[0]));
  }
}
