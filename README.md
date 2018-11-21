# Create-and-read-a-random-file
Allows user to creat data and read data about an employee
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
//import java.nio.file.*;
//import java.io.*;
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
    //Program public WriteCustomerList class, Lab 15
//Written by Alec Narkizian
//created on 7.19,2017
//Writes to a file
//writes user inputes data
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.BufferedWriter;
import java.io.Writer;
public class WriteCustomerList{
   PrintWriter outputStream = null;
   //takes in four arguments from the test class
   public String [] customer(int IdNum, String firName, String lasName, int balOwed){
   int IdNumber = IdNum;
   String firstName = firName;
   String lastnNme =lasName;
   int balanceOwed = balOwed;
   String[] list;
   list = new String[4];
   //adding the user inputed values into a list
   list[0] = Integer.toString(IdNumber);
   list[1] = firstName;
   list[2] = lastnNme;
   list[3] = Integer.toString(balanceOwed);
   Paths.get("Alec:\\Desktop\\lab14\\hello.txt");
   try {
   //Accessing the file
   outputStream = new PrintWriter(new FileOutputStream("hello.txt", true));
   outputStream.write("\n");
   outputStream.write(Integer.toString(IdNum));
   //Writing to the file 
   outputStream.write(Arrays.toString(list) + "\n");
   //You must close so that work is saved
   outputStream.close();
   }
   //exception
   catch (FileNotFoundException e) {
            e.printStackTrace();
   }
      return list;
   }
   
   }
   //Program public Test class, Lab 15
//Written by Alec Narkizian
//created on 7.10,2017
//Tests the actual class WriteCustomerList
//gets user to enter data about an employee
import java.util.Scanner;
import java.io.Serializable;
public class Test{
   public static void main(String[] args){
   WriteCustomerList start = new WriteCustomerList();
   Scanner input = new Scanner(System.in);
   int index =2;
   while (index > 1){
   //collects datat from user
      System.out.println("Enter the Customers First name");
      String firstName = input.next();
      System.out.println("Enter the Customers ID number");
      int customerId = input.nextInt();
      input.nextLine();
      System.out.println("Enter the Customers last name");   
      String lastName = input.next();
      System.out.println("Enter the Customers balance owed");
      int balancedOwed = input.nextInt();
      //calling the method is WriteCustomerList
      start.customer(customerId, firstName, lastName, balancedOwed);
      System.out.println("If you wish to continue type 1, if not type 2");
      int answer = input.nextInt();
      if (answer == 2)
         index = index - index; 
   
       }
       
   }
   }   
//Program public Test2 class
//Written by Alec Narkizian
//created on 7.19,2017
//test class for DisplaySelectedCustomer
import java.util.Scanner;
public class Test2{
   public static void main(String[] args){
   //calls the class
   DisplaySelectedCustomer start = new DisplaySelectedCustomer();
   //calls the method
   start.read();
   }
   }
