public class Task1_1 {
    public static void main(String[] args) {
        int[] array = new int[]{1, 2, 2, 3, 4, 5, 5};
        int[] newArray;
        int lengthOfNewArray = 0;
        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && i != j) {
                    count++;
                    flag = false;
                    break;
                }
            }
            if (count == 0) {
                lengthOfNewArray++;
                System.out.print(array[i] + " ");
                newArray = new int[lengthOfNewArray];
                for (int j = 0; j < newArray.length; j++) {
                    newArray[j] = array[i];
                    break;
                }
            }
        }

        if (flag) {

        }
    }
}
