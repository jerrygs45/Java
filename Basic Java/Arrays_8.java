public class Arrays_8 {
    
    public static void main(String[] args) {
        // CREATING ARRAYS -
        int size = 4;
        int [] counts;
        double[] values;

        counts = new int[5];       // the 1st assignment makes count refer to an array of 4 integers.
        values = new double[size]; // the 2nd makes values refers to an array of double, where the number of 
                                   // elements in values depends upon the value of size.
        // you can also declare the variable and create the array in a single line of code:
    //  int [] count = new int[5];
    //  double [] values = new double[size];

        // ACCESSING ELEMENTS -

        System.out.println(counts[0]);
        System.out.println(counts[1]);
        System.out.println(counts[2]);

        counts[0] = 7;
        counts[1] = counts[0] * 2;
        counts[2]++;

        System.out.println();
        System.out.println(counts[0]);
        System.out.println(counts[1]);
        System.out.println(counts[2]);
        System.out.println();

        // One of the most common way to index an array is with a loop -
        for(int i=0;i<4;i++){
            System.out.println(counts[i]);
        }
        
       

    }
}
