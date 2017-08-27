/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

import java.util.Scanner;

/**
 *
 * @author ueda
 */
public class Student {

  public static void menuConsole(){
      System.out.println("=============Menu Console=============");
      System.out.println("1. Show list student");
      System.out.println("2. Add new student");
      System.out.println("3. Set student");
      System.out.println("4. Delete student");
      System.out.println("5. Exit");
      System.out.println("--------------------------------------");
      System.out.println("Please enter number you want:");
      Scanner scanner=new Scanner(System.in);
      int select=scanner.nextInt();
      switch(select){
          case 1:
              System.out.println("You have chosen: \"Show list tudent\"");
              break;
          case 2:
              System.out.println("You have chosen: \"Add new student\"");
              break;
          case 3:
              System.out.println("You have chosen: \"Set student\"");
              break;
          case 4:
              System.out.println("You have chosen: \"Delete student\"");
              break;
          case 5:
              System.out.println("");
              break;
          case 6:
              System.out.println("Number Invalid");
              
      }
  }
    
    
    public static void main(String[] args) {
        menuConsole();
        
    }
    
}
