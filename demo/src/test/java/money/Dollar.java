package money;

class Dollar extends Money{
    private int amount;
    Dollar(int amount){
        this.amount = amount;
    }
    Dollar times(int multiplier){
        // amount *= multiplier;
        return new Dollar(amount * multiplier);
    }
}