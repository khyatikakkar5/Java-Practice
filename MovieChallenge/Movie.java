public class Movie {

    private String title;

    public Movie(String title) {
        this.title = title;
    }

    public void watchMovie() {

        String instanceType = this.getClass().getSimpleName();
        System.out.println(title + " is a " + instanceType + " film");

    }

    public static Movie getMovie(String type, String title) {
        return switch (type.toUpperCase().charAt(0)) {
            case 'A' -> new Adventure(title);
            case 'C' -> new Comedy(title);
            case 'S' -> new ScienceFiction(title);
            default -> new Movie(title);
        };
    }
}


class Adventure extends Movie{

    public Adventure(String title) {
        super(title);
    }


    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Pleasant Scene",
                "Scary Music",
                "Something Bad Happens");
    }

    public void watchAdventure() {
        System.out.println("watching an Adventure!");
    }
}
class Comedy extends Movie{

    public Comedy(String title) {
        super(title);
    }


    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Funny",
                "Funnier",
                "Happy Ending");
    }

    public void watchComedy() {
        System.out.println("watching a Comedy!");
    }
}

class ScienceFiction extends Movie{

    public ScienceFiction(String title) {
        super(title);
    }


    public void watchMovie() {
        super.watchMovie();
        System.out.printf(".. %s%n".repeat(3),
                "Aliens",
                "Space",
                "Planet");
    }

    public void watchScienceFiction() {
        System.out.println("watching a Science Fiction!");
    }
}
