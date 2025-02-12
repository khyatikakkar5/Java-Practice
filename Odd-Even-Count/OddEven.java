public class OddEven {
    public static void main(String... args){

        int sum = 0;
        int num = 4;
        int lastNum = 20;
        int evenCount = 0;
        int oddCount = 0;

       while(num <= lastNum){
           num++;


           if (!isEvenNumber(num)){
               oddCount++;
               continue;
           }

            System.out.println("Even number " +num);
            evenCount++;
            sum += num;
           if (evenCount >= 5) {
               break;
           }
       }

       System.out.println("Total odd numbers = " +oddCount);
       System.out.println("Total even numbers = " +evenCount);
       System.out.println("Sum of even nums is = " +sum);
    }

    public static boolean isEvenNumber(int num){
        if (num%2 == 0){
            return true;
        } else {
            return false;
        }
    }
}