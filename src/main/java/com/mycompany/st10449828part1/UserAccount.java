/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.st10449828part1;

import java.util.Scanner;

/**
 
 * @author Bless
 */
public class UserAccount {

    public static void main(String[] args) {
           //Class instance creation
        login infor = new login();

        
             //creating a scannner
        Scanner sc = new Scanner(System.in);
        
        //requesting user to enter name, lastname
        System.out.println("Enter your name:");
       
        infor.setName(sc.next());
        
        System.out.println("Enter your lastname:");
       
        infor.setsurname(sc.next());
        
        
        //creating username and password
        System.out.println("Create a username not longer than 5 characters and contains an underscore");
      
        infor.setUsername(sc.next());
        
        
       System.out.println("Create a password longer than 7 characters");
    
       infor.setPassword(sc.next());
       
         //Proccess of verifying conditions for registration
       if(infor.checkUserName(infor.getUsername()) && infor.checkPasswordComplexity(infor.getPassword()) ){
           
        //callinng the registerUser method
        String register;
                register= infor.registerUser(infor.getUsername(), infor.getPassword());
        System.out.println(register);
        
}
       
       
       //login to account
       if(infor.getUsername().contains("_") && infor.getUsername().length() <= 5 && infor.checkPasswordComplexity(infor.getPassword())){
       //prompting user to enter username and password
       System.out.println("Enter your username:");
      
       infor.setfinalUsername(sc.next());
       
       System.out.println("Enter your password:");
        
       infor.setLoginPassword(sc.next());
       
       //Checking if the entered username and password match the stored credentials.
       if(infor.loginUser(infor.getfinalUsername(), infor.getfinalPassword(), infor.getUsername() , infor.getPassword())){
                 
      
           //calling loginstatus method
           String status = infor.returnLoginStatus(infor.getfinalUsername(), infor.getfinalPassword() ,infor.getUsername() ,infor.getPassword() );
           System.out.println(status);
       }
       else{
            //calling loginstatus method
           String status = infor.returnLoginStatus(infor.getfinalUsername(), infor.getfinalPassword(),infor.getUsername() , infor.getPassword());
           System.out.println(status);
       }
       
       }
       else{
            String register;
                register= infor.registerUser(infor.getUsername(), infor.getPassword());
        System.out.println(register);
       }
    }
}
