public class ATMDispenseChain implements DispenseChain {
    private DispenseChain nextChain;
    public ATMDispenseChain() {
        // Initialize the chain
        this.nextChain = new Peso1000Dispenser();
        DispenseChain c2 = new Peso500Dispenser();
        DispenseChain c3 = new Peso100Dispenser();


        // Set the chain of responsibility
        nextChain.setNextChain(c2);
        c2.setNextChain(c3);
    }


    public void dispense(Currency currency) {
        nextChain.dispense(currency);
    }


    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.nextChain = nextChain;
    }
}
