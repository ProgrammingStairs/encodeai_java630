// example showing the conept of string

import java.util.StringJoiner;
class Demo8{
    public static void main(String args[]){
      StringJoiner sj = new StringJoiner("-");
      sj.add("04");
      sj.add("02");
      sj.add("2026");
      System.out.println("Date : "+sj);
    }
}