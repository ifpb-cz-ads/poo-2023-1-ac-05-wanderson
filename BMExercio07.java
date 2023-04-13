public class BMExercio07 {
    public static void main(String[] args) {
        int x = 180;
        int y;

        while (x != 1) {
            if (x % 2 == 0) {
                y = x / 2;
            } else {
                y = 3 * x + 1;
            }
            System.out.print(x + " -> ");
            x = y;
        }
        System.out.print(x);
    }
}
