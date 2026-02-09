Thread Synchronization : 
Thread Synchronization is the process in which multiple threads can share shared resources one by one.

Thread Synchronization can be classified as : 

    a. Mutual Exclusion 
        i. Synchronized block
        ii. Synchronized method 
        iii. Static Synchronization
    b. Co-operation of thread (Inter Thread communication)
        wait(), notify() and notifyAll() 

Here Synchronized block and Synchronized methods are used to achieve object level locking whereas static Synchronization is used to achieve class level locking. 

For achieving class level locking , we needs to make Synchronized method static

output :  [ Andrew ]

class First{
    void display(){
        sop("[")
        sop(name)
        sop("]")
    }
}

First fobj;

Thread th1,th2,th3;

    th1---> fobj;
        th2---> x;
            th3---> x;

    th2---> fobj;
        th1---> x;
            th3---> x;

    th3---> fobj;
        th2---> x;
            th1---> x;