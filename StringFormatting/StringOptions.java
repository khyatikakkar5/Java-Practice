public class Main {

    public static void main(String[] args) {

        //Strings are immutable.
        String print = "Hello" + "World" ;
        print.concat(" and bye");

        //String Builders are mutable.
        StringBuilder printBuilder = new StringBuilder("Hello" + "World");
        printBuilder.append(" and bye");

        printInformation(print);
        printInformation(printBuilder);

        //The capacity will adjust.
        StringBuilder emptyStart = new StringBuilder();
        emptyStart.append("a".repeat(0));
        StringBuilder emptyStart32 = new StringBuilder(32);
        emptyStart32.append("a".repeat(20));

        printInformation(emptyStart);
        printInformation(emptyStart32);

        StringBuilder builderPlus = new StringBuilder("Hello" + "World");
        builderPlus.append(" and bye");

        builderPlus.deleteCharAt(16).insert(16,'g');
        System.out.println(builderPlus);

        builderPlus.replace(16,17,"y");
        System.out.println(builderPlus);

        builderPlus.reverse().setLength(3);
        System.out.println(builderPlus);
    }

    public static void printInformation(String string) {

        System.out.println("String = " + string);
        System.out.println("Length = " + string.length());
    }

    public static void printInformation(StringBuilder builder) {

        System.out.println("StringBuilder = " + builder);
        System.out.println("Length = " + builder.length());
        System.out.println("Capacity = " +builder.capacity());
    }
}
