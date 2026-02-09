// example showing the conept of string tokenizer

import java.util.StringTokenizer;
class Demo9{
    public static void main(String args[]){
      String str = "Hello User How Are You ?";  
      StringTokenizer st = new StringTokenizer(str," ");
      while(st.hasMoreTokens()){
          System.out.println(st.nextToken());
      }
    }
}