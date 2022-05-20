package study0520;

public class ex03 {
    public static void main(String[] args) {
        int[][] array = new int[2][5];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i + j;
            }
        }
        int target = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i][target]);
            target = target + 2;
        }
    }
}
