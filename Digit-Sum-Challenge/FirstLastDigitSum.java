public class FirstLastDigitSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(28784389));
    }
    public static int sumFirstAndLastDigit(int number){
        if(number < 0){
            return -1;
        }
        int lastDigit = number % 10;
        while(number >= 10 ){

            number /= 10;

        }
        int firstDigit =  number;
        return firstDigit + lastDigit;
    }
}
