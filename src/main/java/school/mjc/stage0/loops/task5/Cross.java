package school.mjc.stage0.loops.task5;

public class Cross {
    public static void printCross(int sideLength) {
        for (int x = 0; x < sideLength; x++) {
            for (int y = 0; y < sideLength; y++) {
                if (x == sideLength / 2 || y == sideLength / 2) {
                    System.out.print("8");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printCross(7);
    }
}
