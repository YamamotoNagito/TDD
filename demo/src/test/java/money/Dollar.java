package money;

class Dollar extends Money{
    Dollar(int amount){
        this.amount = amount;
    }
    Money times(int multiplier){
        // amount *= multiplier;
        return new Dollar(amount * multiplier);
    }
}