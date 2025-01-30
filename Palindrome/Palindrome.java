public class Palindrome {
    public static void main(String[] args){
        System.out.println(isPalindrome(12321));
    }


        public static boolean isPalindrome(int number){
            int reverse = 0;
            int original = number;
            while(original != 0) {
                reverse = reverse * 10 + original % 10;
                original /= 10;
            }
            return reverse == number;
        }
}