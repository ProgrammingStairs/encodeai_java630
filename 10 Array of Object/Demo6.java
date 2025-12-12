// example showing the concept of static keyword

class Demo6{
    static int count = 1;
    Demo6(){
        count++;
    }
    public static void main(String args[]){
        new Demo6();
        new Demo6();
        new Demo6();
        new Demo6();
        new Demo6();
        System.out.println("No. of Objects created : "+Demo6.count);
    }
}