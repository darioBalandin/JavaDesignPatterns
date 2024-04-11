package org.chain.challenge;

public interface ErrorHandler {

    void setNextHandler(ErrorHandler errorHandler);
    boolean handleError(String message,boolean handled);
}
