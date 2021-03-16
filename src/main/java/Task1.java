import java.util.Arrays;

public class Task1 {
    /*
Дан произвольный массив. Необходимо получить массив всех чисел без повторений,
которые повторяются более 2-х раз. Для решения задачи необходимо использовать
только следующий функционал:
* Переменные
* Массивы
* Условные операторы
* Циклы.

 */

    public static void main(String[] args) {

        int[] array = new int[]{1, 1, 2, 2, 3, 4, 5, 6, 6, 7};
        int[] newArray = new int[array.length];
        int newArrayLength = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                newArray[newArrayLength] = array[i];
                newArrayLength++;
            }
        }

/*        // Массив с той же длиной, но с нолями
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);
        }*/

        // создание и заполнение финального массива:
        int[] finalArray = new int[newArrayLength];

        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < finalArray.length; j++) {
                if (newArray[i] != 0) {
                    finalArray[i] = newArray[i];
                    break;
                }
            }
        }

        // вывод ячеек финального массива
        for (int i = 0; i < finalArray.length; i++) {
            System.out.print(finalArray[i] + " ");
        }

/*        int[] array = new int[]{1, 1, 2, 2, 3, 4, 4, 5, 5, 5, 6, 7, 8, 8};
        int[] newArray = new int[array.length];
        int newArrayLength = 0;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                newArray[newArrayLength] = array[i];
                newArrayLength++;
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOf(newArray, newArrayLength)));*/
    }
}