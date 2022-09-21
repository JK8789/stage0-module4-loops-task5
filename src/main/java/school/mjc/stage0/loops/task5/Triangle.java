package school.mjc.stage0.loops.task5;

public class Triangle {
    public static void printTriangle(int cathetusLength) {
        for (int x = 0; x < cathetusLength; x++) {
            for (int y = 0; y < cathetusLength; y++) {
                if (y <= x) {
                    System.out.print("8");
                    continue;
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printTriangle(3);
    }
}
