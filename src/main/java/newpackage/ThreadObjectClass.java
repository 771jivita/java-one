/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author LENOVO
 */
public class ThreadObjectClass  {
    public static void main(String args[]) throws InterruptedException{
        ThreadClass1 obj1=new ThreadClass1();
        ThreadClass2 obj2=new ThreadClass2();
        Thread thread1=new Thread(obj1);
        Thread thread2=new Thread(obj2);
        thread1.start();
        Thread.sleep(20000);
        thread2.start();
     
}
}