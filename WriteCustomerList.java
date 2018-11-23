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
import java.nio.file.Paths;
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
   
