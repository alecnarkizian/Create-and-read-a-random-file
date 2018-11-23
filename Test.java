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
   

    
   