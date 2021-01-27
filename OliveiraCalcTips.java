/*
Name: Lusemar Oliveira
Class: COP2800 - Programming in Java 
Programming Assignment #2: Calculate Tips
Due date: Thursday, January 21, 2021
Program Description: Write a program that reads the subtotal and the gratuity rate, then computes the gratuity and total. For 
example, if the user enters 10 for the subtotal and 15% for the gratuity rate the program displays $1.5 as gratuity and $11.5 as 
the total. Your program will then ask the user if they wish to pay the entire bill or split the bill between 2, 3, and 4 people. 
It will then display the amount each person in the party must pay to cover the bill. So if the above bill was split between 2 people, 
the program would then display $5.75 per person.
 */

package calculatetips; // Here is the package where the program is located.

import java.util.Scanner;

public class OliveiraCalcTips { // Here is the our class.
    public static void main(String[] args) { // Here is the main method, it's where the program executes.
        
        // Variables declared and intialized. 
        double subtotal, gratuityRate, splitPrice, gratuityValue = 0.0;
        int splitPeople, splitAnswer = 0;
                                
        // User input
        Scanner input = new Scanner(System.in);
        System.out.println("Please, Enter the Subtotal Amount: ");
        
        // Mathematic and Logical Operations.
        subtotal = input.nextDouble();
        
        // User input
        System.out.println("Please, Enter the Gratuity Rate: ");
        
        // Mathematic and Logical Operations.
        gratuityRate = input.nextDouble();
        gratuityValue = (subtotal * (gratuityRate/100));
                       
        // Information output.        
        System.out.println("The value of $" + gratuityValue + " was added to your bill and your new Subtotal is $" + (gratuityValue + subtotal) + ".\n");
        System.out.println("Would you like to split the Bill? Please answer 1 Yes or 0 No");
        splitAnswer = input.nextInt();
        
        // Mathematic and Logical Operations. 
        if(splitAnswer == 1){
            // User input
            System.out.println("Between 2, 3 or 4 people.");
            // Mathematic and Logical Operations.
            splitPeople = input.nextInt();
            // This is where the system will display the splitted amount according with the user input.
            switch(splitPeople) {
            case 2:
                System.out.println("The amount for each person in the party of 2 is $" + ((gratuityValue + subtotal)/2) + ". Thank you.");
                break;
            case 3:
                System.out.println("The amount for each person in the party of 3 is $" + ((gratuityValue + subtotal)/3) + ". Thank you.");
                break;
            case 4:
                System.out.println("The amount for each person in the party of 4 is $" + ((gratuityValue + subtotal)/4) + ". Thank you.");
                break;
            default:
                System.out.println("Incorrect Input");
            }
        }
        else
            System.out.println("Your total grant amount is $" + (gratuityValue + subtotal)+ ". Thank you.");
    }    
}
