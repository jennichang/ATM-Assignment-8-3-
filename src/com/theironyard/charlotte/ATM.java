package com.theironyard.charlotte;

import java.util.Scanner;
import java.math.*;

public class ATM {
    public static Scanner scanner = new Scanner(System.in);
    public static Client client = new Client();

    public static void main(String[] args) throws Exception {
        System.out.println("Hello.  Welcome to the ATM");

        client.enterName();
        client.enterActivity();

    }
}
