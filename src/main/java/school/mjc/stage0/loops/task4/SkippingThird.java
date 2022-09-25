package school.mjc.stage0.loops.task4;

public class SkippingThird {
    public void printUntilButThird(int lastPrinted) {

        int c = 0;

        for (int i = 1; i <= lastPrinted; i++) {

            if (c == 2) {
                c = 0;
                continue;
            }
            c++;
            System.out.println(i);


        }
    }
}
