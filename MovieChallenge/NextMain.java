public class NextMain {

    public static void main(String[] args) {

        Movie movie = Movie.getMovie("A","Okkay");
        movie.watchMovie();

        //casting
        Adventure okay = (Adventure) Movie.getMovie("A","Okkay");
        okay.watchMovie();

        Object comedy = movie.getMovie("C","Air");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchComedy();

        var air = Movie.getMovie("C","Air");
        air.watchMovie();

        var plane = new Comedy("Air");
        plane.watchComedy();

        Object unknown = Movie.getMovie("C", "Air");
        if (unknown instanceof Comedy) {
            ((Comedy) unknown).watchComedy();
        } else if (unknown instanceof Adventure) {
            ((Adventure) unknown).watchAdventure();
        } else if(unknown instanceof ScienceFiction sf) {
            sf.watchScienceFiction();
        }
    }
}