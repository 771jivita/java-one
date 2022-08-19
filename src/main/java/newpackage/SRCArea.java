/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author LENOVO
 */
public class SRCArea implements CalculateArea {
    float pi=3.14f;
    public static void main (String args[]){
        SRCArea srcarea=new SRCArea();
        srcarea.square(1);
        srcarea.rectangle(1,2);
        srcarea.circle(23);
    }

    @Override
    public void square(int a) {
        System.out.println("area of square is"+a*a);
      }

    @Override
    public void rectangle(int a, int b) {
        System.out.println("area of rectangle is"+a*b);
        }

    @Override
    public void circle(float r) {
        System.out.println("area of circle"+ pi*r*r);
     }
   

   
}
