public class TimeConversion {
    public static void main(String[] args){

        System.out.println( " Time is " +printYearsAndDays(1000000000));

    }

    public static long printYearsAndDays( long days, long years, long remainingMinutes){

        System.out.println( " Time passed is " +years+ "yr , " +days+ "days and " +remainingMinutes+ "min.");

        return 0;
    }

    public static long printYearsAndDays( long minutes){

        if ( minutes< 0){

            System.out.println(" Invalid Value");
        } else{

            return printYearsAndDays( (minutes/ 525600)/1440, minutes/525600 , (minutes % 525600) % 1440);
        } return 0;
    }
}