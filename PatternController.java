package pattern_package;

class PatternController {
    public PatternController(){
    }

    public boolean isOdd(int n){
        return n%2 == 1? true:false;
    }

    public boolean isValidRange(int n){
        return (n > 0 && n <= 50)? true:false;
    }
}
