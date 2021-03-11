public class Task2 {

    public static void main(String[] args) {
        /*
    Найти точки для
			1) функции y = 2*sin(x)-4; в диапазоне [-5, 5] c шагом 0.1;
			2) функции y = 2*tg(x)-4*sin(2*x); в диапазоне [-1, 1] c шагом 0.01;
     */

        // [-7, 20]
        int min = -5;
        int max = 5;

        for (int x = min; x <= max; x++) {
            double y = 2 * Math.sin(x) - 4;
            System.out.println("Y = " + y + "; X =" + x + ";");
        }
    }
}
