package com.ncu.main;
//import com.ncu.main.Expense;
import java.util.*;

import com.ncu.exceptions.InvalidOptionSelectedException;

public class Menu {
    public void mainMenu(){
        Scanner s= new Scanner(System.in);
        Expense ex =new Expense(); //For calling Expense's methods
        //Switch Case menu:-
        String choice;
      // try{
            do {
                // s.nextLine();
                System.out.println("\nCommand Options: ");
                System.out.println("a: Add Expense");
                System.out.println("b: Delete Expense");
                System.out.println("c: View Expense");
                System.out.println("d: Calculate Expense");
                System.out.println("q: Quit");
                choice = s.nextLine();
              //  checkOption(choice); // Check Method call for Exception in Input
                switch (choice){
                    case "a":
                        ex.expenseAdd();
                        break;
                    case "b":
                        ex.expenseDelete();
                        break;
                    case "c":
                        ex.expenseRead();
                        break;
                    case "d":
                        ex.expenseCalculate();
                        break;
                }
            }while (!"q".equals(choice));
    s.close();
    }
    // Check Method Decleration for Exception in Input
    void checkOption(String choice) throws InvalidOptionSelectedException{
        if(!"a".equals(choice)&&!"b".equals(choice)&&!"c".equals(choice)&&!"q".equals(choice)&&!"d".equals(choice)){
         throw new InvalidOptionSelectedException("You have selcted Invalid Option");
    }
}
}
