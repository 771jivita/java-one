/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author LENOVO
 */
public class SquareShapeInterface implements ShapeInterface{
  
  
        public static void main(String args[]){
       SquareShapeInterface squareInterface =new SquareShapeInterface();
       try{
       squareInterface.getSide();}
       catch(Exception exception){
           System.out.print("in exception");
       }
}

    @Override
    public void getSide() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void draw() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}