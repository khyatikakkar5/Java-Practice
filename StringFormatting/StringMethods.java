public class StringMethods {

    public static void main(String[] args) {

        printInformation("Hello Khyati");
        printInformation("");
        printInformation(" \t  \t");

        String s1 = "God Bless Your Soul";
        System.out.printf("index of 1sto  = %d %n", s1.indexOf('o'));
        System.out.printf("index of 3rdo  = %d %n", s1.lastIndexOf('o'));

        System.out.printf("index of 2ndo  = %d %n", s1.indexOf('o',3));
        System.out.printf("index of 2ndo  = %d %n", s1.lastIndexOf('o',6));

        String helloWorld = "Hello World";


        if (helloWorld.equals(helloWorld.toLowerCase())) {
            System.out.println("Values match exactly");
        }

        if (helloWorld.equalsIgnoreCase(helloWorld.toLowerCase())) {
            System.out.println("Values match Ignoring case");
        }

        if (helloWorld.startsWith("Hello")) {
            System.out.println("String starts with Hello");
        }

        if (helloWorld.endsWith("World")) {
            System.out.println("String ends with World");
        }

        if (helloWorld.contains("Hello")) {
            System.out.println("String contains Hello");
        }

        if (helloWorld.contentEquals("Hello World")) {
            System.out.println("Values match exactly");
        }


    }

    public static void printInformation(String string) {

        if (string.isEmpty()) {
            System.out.println("String is empty");
            return;
        }

        if (string.isBlank()) {
            System.out.println("String is blank");
        }

        System.out.printf("Length = %d %n", string.length());
        System.out.printf("Last char = %c %n", string.charAt( string.length() - 1));
    }
}