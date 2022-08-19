/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Abc implements Calculate {
    int a;
    int b;
    public static void main(String args[]){
        Abc obj=new Abc();
        obj.getValues();
        obj.calculateArea();
}

    @Override
    public void calculateArea() {
        System.out.println("Area of rectangle is"+a*b);
         }

    @Override
    public void getValues() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a");
        a= sc.nextInt();
        System.out.println("enter b");
        b= sc.nextInt();
       }
}