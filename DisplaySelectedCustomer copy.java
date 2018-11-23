//Program public DisplaySelectedCustomer class, Lab 15
//Written by Alec Narkizian
//created on 7.19,2017
//Checks the file hello.txt
//checks to see if ID is in file 
//if found prints the info with the ID
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.nio.file.*;
import java.io.*;
import java.io.FileOutputStream;
public class DisplaySelectedCustomer{
   public void read(){
   //the path to the file
   Paths.get("Alec:\\Desktop\\lab14\\hello.txt");
   String fileName = "hello.txt";
      Scanner input = new Scanner(System.in);
      //gets the user to specify the ID they want to look up
      System.out.println("Enter the employees number you wish to see");
      String answer = input.next();
      answer =answer + "[" + answer;
      int i = 0;
    try{
    
      while (1 > i){
         Paths.get("Alec:\\Desktop\\lab15\\hello.txt");
         File file = new File(fileName);
         Scanner scanner = new Scanner(file);
         while (scanner.hasNextLine()) {
         //checks the file to see if the ID is in there 
            String line = scanner.nextLine();
            if(line.contains(answer)){ 
            //prints if it does
            System.out.println("ID, Name, LastName, balance owed");
               System.out.println(line);
                i = ++i;

                        }
                        }
                  }
      }
    catch (FileNotFoundException e) 
      {
      //exeption
         System.out.println("Record File not found");
         }
        }

      
    }