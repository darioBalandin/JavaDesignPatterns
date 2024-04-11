package org.chain.example;

public interface DispenseChain {

    void setNextChain(DispenseChain dispenseChain);

    void dispense(Currency currency);
}

class Dollar50Dispenser implements DispenseChain {

    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;

    }

    @Override
    public void dispense(Currency currency) {


        if (currency.getAmount() >= 50) {
            int num = currency.getAmount() / 50;
            int remainder = currency.getAmount() % 50;

            System.out.println("Dispensing " + num + " 50$ bill");
            currency.setAmount(remainder);
        }
        if (this.chain != null) {
            this.chain.dispense(currency);
        }

    }
}

class Dollar20Dispenser implements DispenseChain {

    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;

    }

    @Override
    public void dispense(Currency currency) {

        if (currency.getAmount() >= 20) {
            int num = currency.getAmount() / 20;
            int remainder = currency.getAmount() % 20;

            System.out.println("Dispensing " + num + " 20$ bill");
            currency.setAmount(remainder);
        }
        if (this.chain != null) {
            this.chain.dispense(currency);
        }


    }
}

class Dollar10Dispenser implements DispenseChain {

    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;

    }

    @Override
    public void dispense(Currency currency) {
        if (currency.getAmount() >= 10) {
            int num = currency.getAmount() / 10;
            int remainder = currency.getAmount() % 10;

            System.out.println("Dispensing " + num + " 10$ bill");
            currency.setAmount(remainder);
        }
        if (this.chain != null) {
            this.chain.dispense(currency);
        }

    }
}


