// example showing the concept of jump statement (break statement)

class Demo13{
    public static void main(String args[]){
       for(int i = 1;i<=3;i++){ // outer loop
        System.out.println("i : "+i);
            for(int j=1;j<=3;j++){ // inner loop
                if(i==2 && j==2)
                    break;
                System.out.println("\tj : "+j);
            }
       } 
    }
}