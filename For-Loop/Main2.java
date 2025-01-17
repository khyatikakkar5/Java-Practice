public class Main2 {
    public static void main(String[] args){

        for ( double i = 7.5; i <= 10.0 ; i += 0.25){
            if ( i > 8.5){
                break;
            }
            System.out.println(" 100 dollars at " +i+ "% rate = $" +calculateInterest(100, i));
        }
    }
    public static double calculateInterest( double amount,double i){

        return ( amount * ( i / 100));
    }
}