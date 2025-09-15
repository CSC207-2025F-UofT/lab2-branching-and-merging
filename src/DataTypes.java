public class DataTypes {
    public static long sum(int[] numbers) {
        // below is a "foreach" loop which iterates through numbers
        long s = 0L;
        for (int x : numbers) {
            s += x;
        }
        return s;
    }
}
