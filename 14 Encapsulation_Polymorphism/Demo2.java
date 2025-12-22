// example showing the concept of getter and setter methods along with encapsulation

class Demo{
    private int num;
    // setter method
    public void setNum(int num){
        this.num=num;
    }
    // getter method
    public int getNum(){
        return num;
    }
}
class Demo2{
    public static void main(String args[]){
        Demo obj = new Demo();
        obj.setNum(100);
        System.out.println("Number : "+obj.getNum());
    }
}


