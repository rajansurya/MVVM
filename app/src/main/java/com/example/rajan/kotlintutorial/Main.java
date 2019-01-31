package com.example.rajan.kotlintutorial;

/**
 * Created by RAJAN on 1/29/2019.
 */

public class Main extends BBx implements AAx{
    @Override
    public void S() {
        System.out.println("SSSSS");
    }
    public static void main(String[] ar){
     Main sssd=   new Main();
     sssd.S();
     BBx bb=new Main();
     bb.S();
     BBx sd=new BBx();
     sd.S();
    }
}
interface AAx{
   void S();
}
class BBx{
    void S(){
        System.out.println("BB");
    }
}
