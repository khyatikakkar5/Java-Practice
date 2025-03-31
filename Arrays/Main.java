public class Main {

    public static void swap(int[] one, int i, int j){
        int temp = one[i];
        one[i] = one[j];
        one[j] = temp;
    }
    public static void main(String[] args)  {

        int[] one = new int[3];
        one[0] = 0;
        one[1] = 1;
        one[2] = 2;

//        int[] two = one;
//        two[2] = 500;

        swap(one, 0,2);


        for(int i = 0; i< one.length; i++){
            System.out.println(one[i]);
        }

//        for(int i = 0; i< one.length; i++){
//            System.out.println(two[i]);
//        }




    }
}
