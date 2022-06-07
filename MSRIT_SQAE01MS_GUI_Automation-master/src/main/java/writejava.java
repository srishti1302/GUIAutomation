
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Srishti
 */
public class writejava {
  public static void main(String args[]){    
         try{    
           FileWriter fw=new FileWriter("C:\\Users\\Srishti\\OneDrive\\Desktop\\output.txt");    
           fw.write("Welcome to javaTpoint.");    
           fw.close();    
          }catch(Exception e){System.out.println(e);}    
          System.out.println("Success...");    
     } 
}
