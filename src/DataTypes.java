public class DataTypes {
    public static long sum(int[] numbers) {
        long s = 0; // variable to accumulate the sum in!
        // below is a "foreach" loop which iterates through numbers
        for (int x : numbers) {
            s += x;
        }
        return s;
    }

//    public static void main(String[] args) {
//        System.out.println(sum(new int[]{1, 2, 3, 4, 5}));
//    }
}
