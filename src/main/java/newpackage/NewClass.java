/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class NewClass {
    public static void main(String args[]){
        File file = new File("javaaaa.txt");
        try{
            if(!file.exists()){         //(file.exists()==false)
            file.createNewFile();
            }
            else
            {
              Scanner sc=new Scanner(file);
        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
            }
        }catch(IOException ex){
        }
      
        }
    }

