public class Task3 {

    public static void main(String[] args) {
        /*
    Найти точки для
			1) функции y = 2*sin(x)-4; в диапазоне [-5, 5] c шагом 0.1;
			2) функции y = 2*tg(x)-4*sin(2*x); в диапазоне [-1, 1] c шагом 0.01;
     */

        double min = -5;
        double max = 5;

        System.out.println("y = 2*sin(x)-4; в диапазоне [-5, 5] c шагом 0.1:");
        for (double x = min; x <= max; x++) {
            x = x + 0.1;
            double y = 2 * Math.sin(x) - 4;
            System.out.println("Y = " + y + "; X =" + x + ";");
        }

        double min1 = -1;
        double max1 = 1;

        System.out.println();
        System.out.println("y = 2*tg(x)-4*sin(2*x); в диапазоне [-1, 1] c шагом 0.01:");
        for (double x = min; x <= max; x++) {
            x = x + 0.1;
            double y = 2 * Math.tan(x) - 4 * Math.sin(2 * x);
            System.out.println("Y = " + y + "; X =" + x + ";");
        }
    }
}
