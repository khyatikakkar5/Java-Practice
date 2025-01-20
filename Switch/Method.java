public class Method {
    public static void main(String[] args) {

        String month = "APRIo";
        System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }
    public static String getQuarter(String month) {
        return switch (month) {
            case "JANUARY", "FEBRUARY", "MARCH" -> { yield "1st";}
            case "APRIL", "MAY", "JUNE" -> " 2nd";
            case " JULY", "AUGUST", "SEPTEMBER" -> "3rd";
            case "OCTOBER", "NOVEMBER", "DECEMBER" -> " 4th";
            default -> {
                String badResponse = month+ " is bad";
                yield badResponse;
            }
        };
    }
}