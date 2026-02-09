// example showing the conept of string buffer

class Demo11{
    public static void main(String args[]){
    //   StringBuffer sb = new StringBuffer("Hello ");
      StringBuilder sb = new StringBuilder("Hello ");
      sb.append("Andrew anderson");
      System.out.println("append : "+sb);

      sb.replace(6,12,"Peter");
      System.out.println("replace : "+sb);
  
      sb.delete(6,11);
      System.out.println("delete : "+sb);

      sb.insert(6,"Mathew");
      System.out.println("insert : "+sb);

      sb.reverse();
      System.out.println("reverse : "+sb);

    } 
}