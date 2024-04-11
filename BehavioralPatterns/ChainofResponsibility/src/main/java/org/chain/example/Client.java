package org.chain.example;


import java.util.*;

public class Client {

    private DispenseChain chain;

    public Client() {
        this.chain = new Dollar50Dispenser();
        DispenseChain c2 = new Dollar20Dispenser();
        DispenseChain c3 = new Dollar10Dispenser();
        this.chain.setNextChain(c2);
        c2.setNextChain(c3);
    }


    public static void main(String[] args) {


        Client atmDispenser = new Client();

        while (true) {
            int amount = 0;
            System.out.println("Enter amount to dispense");
            Scanner input = new Scanner(System.in);

            amount = input.nextInt();

            if(amount % 10 != 0){
                System.out.println("Amount should be multiple of 10s");
                return;
            }

            atmDispenser.chain.dispense(new Currency(amount));
        }
    }
}
