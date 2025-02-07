public class LastDigitChecker {
    public static void main(String[] args){
        System.out.println(hasSameLastDigit(22,33,44));
        System.out.println(hasSameLastDigit(22,32,44));
    }
    
    public static boolean hasSameLastDigit(int firstNumber, int secondNumber, int thirdNumber) {
        
        if((10 <= firstNumber) && (10 <= secondNumber) && (10 <= thirdNumber) && (firstNumber <= 1000) && (secondNumber <= 1000) && (thirdNumber <= 1000)) {
            int firstRight = firstNumber % 10;
            int secondRight = secondNumber % 10;
            int thirdRight = thirdNumber % 10;

            if((firstRight == secondRight) || (firstRight == thirdRight) || (thirdRight == secondRight)){
                return true;
            } else{
                return false;
            }
        } else {
            return false;
        }
    }
}