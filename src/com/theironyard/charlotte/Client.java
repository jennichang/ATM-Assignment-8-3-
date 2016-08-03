package com.theironyard.charlotte;

/**
 * Created by jenniferchang on 8/3/16.
 */
public class Client {
    String name;
    String activity;
    int withdraw;
    int moneyLeft;


    public void enterName() throws Exception {
        System.out.println("Please enter your name.");
        String name = ATM.scanner.nextLine();
        if (name.equalsIgnoreCase("")) {
            throw new Exception("No name entered.");
        } else {
            this.name = name;
        }

        System.out.println("Hello " + this.name + "!");
    }

    public void enterActivity() throws Exception {
        System.out.println("What would you like to do today?" + System.lineSeparator() +
                "Enter (1) to check your balance" + System.lineSeparator() +
                "Enter (2) to withdraw funds" + System.lineSeparator() +
                "Enter (3) to cancel");
        String activity = ATM.scanner.nextLine();

        if (activity.equalsIgnoreCase("1")) {
            System.out.println("Your balance is $100");
        } else if (activity.equalsIgnoreCase("3")) {
            System.out.println("Thank you and please come again");
        } else if (activity.equalsIgnoreCase("2")) {
            System.out.println("How much would you like to withdraw today?");
            withdraw = ATM.scanner.nextInt();

            moneyLeft = 100 - withdraw;

            if (withdraw > 100) {
                throw new Exception("You don't have this much, sorry.");
            } else if(withdraw == 0) {
                System.out.println("Why did you come here then?");
                System.out.println(System.lineSeparator() + "You have $" + moneyLeft + " left in your account." +
                System.lineSeparator() + "Thank you and please come again.");
            } else if(withdraw % 5 != 0) { // it seems like i just need $5 because that will capture 10 and 20
                System.err.println ("Please enter in multiples of $5, $10 or $20");
                System.out.println("You have $100 left in your account." + System.lineSeparator() +
                        "Please retry your withdrawal.");
            } else {
                System.out.println("Please take your " + "$" + withdraw);
                System.out.println(System.lineSeparator() + "You have $" + moneyLeft + " left in your account." +
                System.lineSeparator() + "Thank you and please come again.");
            }
        } else {
            throw new Exception("No valid activity");
        }


    }
}
