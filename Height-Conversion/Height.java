public class Height {
    public static void main(String[] args){

        System.out.println(" My Height in centimeters is "
                + convertToCentimeters( 5,5));

    }
    public static double convertToCentimeters( int heightInInches){

        return heightInInches * 2.54;

    }
    public static double convertToCentimeters( int heightInFeet, int rHeightInInches){

        return  convertToCentimeters(heightInFeet * 12 + rHeightInInches);


    }
}