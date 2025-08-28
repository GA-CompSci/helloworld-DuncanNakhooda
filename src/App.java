public class App {
    public static void main(String[] args) throws Exception {
        // DATA TYPES 
        int x = 5;
        char c = 'c';
        double y = 5.5;
        boolean b = false;
        int w; // declaration
        w = 66; // initialization
        int infractedStudents;
        // camelCasing
        final int CONNY = 5; // constants are all-caps

        // OPERATIONS
        System.out.println(w-3);
        w = w - 3;
        // cooler way of writing this:
        System.out.println(w);

        // COMPARISONS
        boolean boo = false;
        System.out.println(!boo != false);

        // CONDITIONAL 
        if(!boo) System.out.println("boo passed");

        // SHORT CIRCUIT
        int divisor = 0;
        if(divisor !=0 && 5/divisor > 1) System.out.println("omg");

        // ARRAYS 
        int n, m, u, i = 0; //  multi-declaration
        n = 0;
        m = 0;
        u = 0;
        int[] arr = {n, m, u, i}; // copies, not links to the values
        n = 5;
        System.out.println(arr[0]); // previously copied value
        System.out.println(n); // updated value
        arr[0] = 5; // I'd have to dop that to change the array's value
        System.out.println("The array is " + arr.length + " items long"); 

        // FUNCTIONS / METHODS
        System.out.println(addYaBoi("I do my work"));
    } // closes the main method

    public static String addYaBoi(String str){
        return str + " ya boi";

    }
} // closes the app class
