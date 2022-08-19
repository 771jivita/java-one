/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author LENOVO
 */
public class MyThread extends Thread {
    @Override
    public void run(){
        System.out.println("thread is running"); 
    }
    public static void main(String args[]){
        MyThread obj=new MyThread();
        obj.start();
    }

            }
