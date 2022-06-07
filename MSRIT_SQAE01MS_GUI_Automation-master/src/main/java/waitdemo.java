/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Srishti
 */
public class waitdemo {
    public  void main(String args[]){

System.out.println("before wait");
w();
System.out.println("affter wait");

}



public  void w(){try{wait(10);}catch(Exception e){}}
}
