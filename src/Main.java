public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");

        int[] boxes = new int[3];
        boxes[0] = 1;
        boxes[1] = 2;
        boxes[2] = 3;

        double[] weights = {1.57, 7.654, 9.986};

        String[] season = {"зима", "весна", "лето", "осень" };
    }

    public static void task2() {
        System.out.println("Задача 2");

        int[] boxes = new int[3];
        boxes[0] = 1;
        boxes[1] = 2;
        boxes[2] = 3;

        double[] weights = {1.57, 7.654, 9.986};

        String[] season = {"зима", "весна", "лето", "осень" };

        for (int i = 0; i < boxes.length; i++) {
            if (i == boxes.length - 1) {
                System.out.print(boxes[i]);
                break;
            }
            System.out.print(boxes[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i < weights.length; i++) {
            if (i == weights.length - 1) {
                System.out.print(weights[i]);
                break;
            }
            System.out.print(weights[i] + ", ");
        }
        System.out.println();

        for (int i = 0; i < season.length; i++) {
            if (i == season.length - 1) {
                System.out.print(season[i]);
                break;
            }
            System.out.print(season[i] + ", ");
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");

        int[] boxes = new int[3];
        boxes[0] = 1;
        boxes[1] = 2;
        boxes[2] = 3;

        double[] weights = {1.57, 7.654, 9.986};

        String[] season = {"зима", "весна", "лето", "осень" };

        for (int i = boxes.length - 1; i >= 0; i--) {
            System.out.print(boxes[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = weights.length - 1; i >= 0; i--) {
            System.out.print(weights[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = season.length - 1; i >= 0; i--) {
            System.out.print(season[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");

        int[] boxes = new int[3];
        boxes[0] = 1;
        boxes[1] = 2;
        boxes[2] = 3;

        for (int i = 0; i < boxes.length; i++) {
            if (boxes[i] % 2 == 0) {
                System.out.print(boxes[i] + " ");
            } else {
                boxes[i] = boxes[i] + 1;
                System.out.print(boxes[i] + " ");
            }
        }
    }
}