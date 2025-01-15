public class DigitSum {
    public static void main(String[] args){
        System.out.println("The sum of the digits in 1634 is = " +sumDigits(1634));
    }
    public static int sumDigits(int num){
        if ( num < 0){
            return -1;
        }
        int sum = 0;

        while (num > 9) {
            sum += (num % 10);
            num = num/10;

        }
        sum += num;
        return sum;
    }
}