public class Time {
    public static void main(String[] args){

        System.out.println(" Time passed in seconds is " +TimeConversion(56789));
    }
    public static int TimeConversion( int hours, int rSeconds  ,int rMinutes){

        System.out.println("Total Time passed is " +hours+ "hr " +rMinutes+ "min and " +rSeconds+ "sec");

        return 0;
    }
    public static int TimeConversion( int seconds){

        if( seconds< 0 ){
            System.out.println("Invalid value for seconds");
        } else {

            return  TimeConversion( seconds / 3600,(seconds % 3600)% 60 ,(seconds % 3600) / 60 )  ;

        } return 0;
    }

}
