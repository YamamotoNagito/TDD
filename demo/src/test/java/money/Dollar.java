package money;

class Dollar extends Money{
    Dollar(int amount){
        this.amount = amount;
    }

    String currency(){
        return "USD";
    }

    Money times(int multiplier){
        // amount *= multiplier;
        return new Dollar(amount * multiplier);
    }
}