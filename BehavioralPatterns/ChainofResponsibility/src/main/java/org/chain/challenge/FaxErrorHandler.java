package org.chain.challenge;

public class FaxErrorHandler implements ErrorHandler{
    ErrorHandler chain;

    @Override
    public void setNextHandler(ErrorHandler errorHandler) {
        this.chain = errorHandler;
    }

    @Override
    public boolean handleError(String message,boolean handled) {
        if(message.contains("Fax")){
            System.out.println("Handled by "+ FaxErrorHandler.class.getSimpleName());
            handled= true;
        }
        if(this.chain !=null){
           return this.chain.handleError(message,handled);
        }
        return handled;

    }
}
