public class SharedDigit {
    public static void main(String[] args){
        System.out.println(hasSharedDigit(93,24));
    }

        public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
            if((10 <= firstNumber) && (10 <= secondNumber ) && ( firstNumber <= 99) && ( secondNumber <= 99)){
                int firstLeft = firstNumber / 10;
                int firstRight = firstNumber % 10;
                int secondLeft = secondNumber / 10;
                int secondRight = secondNumber % 10;

                if((firstLeft == secondRight) || (firstLeft == secondLeft) || (firstRight == secondRight) || (firstRight == secondLeft)  ) {
                    return true;
                }
                 else {
                    return false;
                }
            }else {
                return  false;
            }
        }

}