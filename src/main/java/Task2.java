public class Task2 {

    public static void main(String[] args) {

        /*
         Написать программу, которая должна выполнять транспонирование матрицы.
	Транспонирование — в линейной алгебре это операция над матрицами в результате которой матрица
	 поворачивается относительно своей главной диагонали. При этом столбцы исходной матрицы становятся
	  строками результирующей.
         */

        int[][] array = new int[][]{
                {1, 2, 3},
                {5, 6, 7},
                {8, 9, 10},
                {11, 12, 13},
                {14, 15, 16},
        };

        System.out.println("Исходная матрица:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        int[][] newArray = new int[array[0].length][array.length];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                newArray[j][i] = array[i][j];
            }
        }

        System.out.println();

        System.out.println("Транспонированная матрица:");
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
