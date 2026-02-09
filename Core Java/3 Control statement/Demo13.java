// example showing the concept of switch control statement
class Demo13{
    public static void main(String args[]){
        int num=10,i=1;
        switch(i++){ // i=1
            case -3 : --num;
                        break;
            case 2 : num--;
            case 1 : num--; // 10---> 9
            case -2 : ++num; // 10
            default : System.out.println("num : "+num--); // 10 ----> 9
                        break;
        }        
   }
}