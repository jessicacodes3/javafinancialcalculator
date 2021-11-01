// This Java application calculates monetary units and displays its coin coversion calculations.

import java.util.Scanner;

public class FinApp {

public static void main(String [] args){

Scanner input = new Scanner (System.in);
    
//Get amount
System.out.print("Enter amount of money: ");
double amount = input.nextDouble();
    
    int remainingAmount = (int)(amount * 100);
    
    int numberOfDollars = remainingAmount / 100;
    remainingAmount %= 100;
    
    int numberOfQuarters = remainingAmount / 25;
    remainingAmount %= 25;    
    
    int numberOfDimes = remainingAmount / 10;
    remainingAmount %= 10;   
    
    int numberOfNickels = remainingAmount / 5;
    remainingAmount %= 5;  
    
    int numberOfPennies = remainingAmount;   
    
    System.out.println("Amount " + amount + " consists of");
    
    System.out.println(" " + numberOfDollars +
            (numberOfDollars == 1 ? " dollar" : " dollars"));
    
    System.out.println(" " + numberOfQuarters +
            (numberOfQuarters == 1 ? " quarter" : " quarters"));
    
    System.out.println(" " + numberOfDimes +
             (numberOfDimes == 1 ? " dime" : " dimes"));
    
    System.out.println(" " + numberOfNickels +
             (numberOfNickels == 1 ? " nickel" : " nickels"));
    
    System.out.println(" " + numberOfPennies +
             (numberOfPennies == 1 ? " pennie" : " pennies"));
             
     }    
             }
