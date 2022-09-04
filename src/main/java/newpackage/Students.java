/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package newpackage;
import java.util.HashMap;

/**
 *
 * @author LENOVO
 */
public class Students {
    public static void main(String args[])
    {
        HashMap<String,String>students=new HashMap<>();
        students.put("name","jivita");
        students.put("class","java");
        students.put("rollno","1");
        System.out.println("value at name"+students.get("name"));
        for(String i:students.keySet())
        {
            System.out.println(i);
        }
        for(String s: students.values())
        {
            System.out.println(s);
        }
    }
            }
