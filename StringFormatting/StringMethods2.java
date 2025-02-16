public class StringMethods2 {

    public static void main(String[] args) {

        String birthDate = "25/11/2005";
        int startingIndex = birthDate.indexOf("2005");
        System.out.println("Starting Index = " + startingIndex);
        System.out.println("Birth year = " + birthDate.substring(startingIndex));

        System.out.println("Month = " + birthDate.substring(3,5));
        System.out.println("Year = " + birthDate.substring(6,10));
        System.out.println("Date = " + birthDate.substring(0,2));

        String newDate = String.join("/","25","11","2005");
        System.out.println(newDate);

        // Concat method, gives same output as join method.

        newDate = "25";
        newDate = newDate.concat("/");
        newDate = newDate.concat("11");
        newDate = newDate.concat("/");
        newDate = newDate.concat("2005");
        System.out.println(newDate);

        newDate = "25" + "/" + "11" + "/" + "2005";
        System.out.println(newDate);

        // Method Chaining

        newDate = "25".concat("/").concat("11").concat("/")
                .concat("2005");
        System.out.println(newDate);

        //replace methods

        System.out.println(newDate.replace('/','-'));

        System.out.println(newDate.replaceFirst("/","-"));
        System.out.println(newDate.replaceAll("/","---"));

         // Repeat method
         
        System.out.println("ABC\n".repeat(4));

        System.out.println("-".repeat(10));

        //Indent method
        System.out.println("ABC\n".repeat(4).indent(10));

        System.out.println("-".repeat(10));

        System.out.println("   ABC\n".repeat(4).indent(-2));

        System.out.println("-".repeat(10));

    }
}
