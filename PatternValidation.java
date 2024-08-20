package pattern_package;

class PatternValidator {
    public PatternValidator(){
    }

    public boolean isOdd(int n){
        return n%2 == 1;
    }

    public boolean isValidRange(int n){
        return (n > 0 && n <= 50);
    }
}
