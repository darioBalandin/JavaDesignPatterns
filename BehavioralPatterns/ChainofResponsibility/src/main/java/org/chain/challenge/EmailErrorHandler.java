package org.chain.challenge;

public class EmailErrorHandler implements ErrorHandler{

    ErrorHandler chain;


    @Override
    public void setNextHandler(ErrorHandler errorHandler) {
        this.chain=errorHandler;
    }

    @Override
    public boolean handleError(String message,boolean handled) {

        if(message.contains("Email")){
            System.out.println("Handled by "+ EmailErrorHandler.class.getSimpleName());
            handled= true;
        }
        if(this.chain !=null){
            return this.chain.handleError(message,handled);
        }
        return handled;

    }
}
