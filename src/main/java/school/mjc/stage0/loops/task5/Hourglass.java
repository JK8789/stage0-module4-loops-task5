package school.mjc.stage0.loops.task5;

public class Hourglass {
    public static void printHourglassOfGivenSize(int height) {
        for (int x = 0; x < height / 2; x++) {
            for (int y = 0; y < height; y++) {
                if (y < x || y >= height - x) {
                    System.out.print(" ");
                    continue;
                }
                System.out.print("8");
            }
            System.out.println();
        }
        for (int x = height / 2; x < height; x++) {
            for (int y = 0; y < height; y++) {
                if (y > height - (height - x) || y < height - x - 1) {
                    System.out.print(" ");
                    continue;
                }
                System.out.print("8");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printHourglassOfGivenSize(6);
    }
}
