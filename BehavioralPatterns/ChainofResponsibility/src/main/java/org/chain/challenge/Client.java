package org.chain.challenge;

public class Client {

    ErrorHandler chain;

    public Client() {
        this.chain = new FaxErrorHandler();
        ErrorHandler em= new EmailErrorHandler();
        this.chain.setNextHandler(em);
    }


    public static void main(String[] args) {
        Client client= new Client();


        boolean handled = client.chain.handleError("EmailFax", false);
        System.out.println(handled);
    }
}
