package money;

class Franc extends Money{
    Franc(int amount){
        this.amount = amount;
    }
    Money times(int multiplier){
        // amount *= multiplier;
        return new Franc(amount * multiplier);
    }
    
    static Money franc(int amount){
        return new Franc(amount);
    }
}