public class EnhancedChallenge {
    public static void main(String[] args){
        printWeekDay(0);
        printWeekDay(1);
        printWeekDay(2);
        printWeekDay(3);
        printWeekDay(4);
        printWeekDay(5);
        printWeekDay(6);
    }
    public static void printDayOfWeek(int day){
        String dayOfWeek  = switch(day){
            case 0 -> { yield "Sunday";}
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            default -> " Invalid Day";
        };
        System.out.println( day + " stands for " +dayOfWeek);
    }
    public static void printWeekDay( int day){

        String dayOfWeek = " Invalid Day";
        if (day == 0){
            System.out.println("Sunday");
        } else if ( day == 1){
            System.out.println("Monday");
        } else if ( day == 2){
            System.out.println("Tuesday");
        } else if (day == 3) {
            System.out.println("Wednesday");
        } else if ( day == 4) {
            System.out.println("Thursday");
        } else if ( day == 5){
            System.out.println("Friday");
        } else if ( day == 6){
            System.out.println("Saturday");
        }
        System.out.println(day + " stands for " + dayOfWeek);

        }

}