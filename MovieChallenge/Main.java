import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Movie movie = Movie.getMovie("S","Star Wars");
//        movie.watchMovie();

        Scanner s = new Scanner(System.in);
        while( true) {
            System.out.print("Enter Type (A for Adventure, C for Comedy, S for Science Fiction, or Q to Quit): ");
            String type = s.nextLine();
            if ("Qq".contains(type)) {
                break;
            }
            System.out.print("Enter Movie Title: ");
            String title = s.nextLine();
            if ("Qq".contains(title)) {
                break;
            }
            Movie movie = Movie.getMovie(type,title);
            movie.watchMovie();

        }
    }
}
