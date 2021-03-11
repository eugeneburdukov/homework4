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
        // Показать значения, которые не повторяются, вывод будет: 3 6 7
        int[] array = new int[]{1, 1, 2, 2, 3, 4, 4, 5, 5, 5, 6, 7, 8, 8};
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j) {
                    count++;
                    break;
                }
            }
            if (count == 0) {
                System.out.print(array[i] + " ");
            }
        }

        // Показать уникальные значения, вывод будет: 1 2 3 4 5 6
//        int[] array = new int[]{1, 1, 2, 2, 3, 4, 4, 5, 5, 5, 6};
//        for (int i = 0; i < array.length; i++) {
//            boolean flag = true;
//            for (int j = i + 1; j < array.length; j++) {
//                if (array[i] == array[j]) {
//                    flag = false;
//                    break;
//                }
//            }
//            if (flag) {
//                System.out.print(array[i] + " ");
//            }
//        }

    }
}