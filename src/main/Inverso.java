import java.util.Arrays;

public class Inverso {
    public static int[] alReves(int[] normal) {
        int[] inverso = new int[normal.length];

        for (int i = 0; i < normal.length; i++) {
            inverso[normal.length - i - 1] = normal[i];
        } return inverso;
    }

    public static void main(String[] args) {
        int[] normal = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(alReves(normal)));
    }
}
