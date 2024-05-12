package money;

class Franc extends Money{
    Franc(int amount){
        this.amount = amount;
    }

    String currency(){
        return "CHF";
    }

    Money times(int multiplier){
        // amount *= multiplier;
        return new Franc(amount * multiplier);
    }
}