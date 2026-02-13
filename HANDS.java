import java.lang.reflect.Array;
import java.util.Arrays;
public class HANDS {
    public static int[] FindHands(String[] x) {
        int[] hands = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (String number : x) {
            if (number.equals("Ace")) {
                hands[0]++;
            }
            if (number.equals("2")) {
                hands[1]++;
            }
            if (number.equals("3")) {
                hands[2]++;
            }
            if (number.equals("4")) {
                hands[3]++;
            }
            if (number.equals("5")) {
                hands[4]++;
            }
            if (number.equals("6")) {
                hands[5]++;
            }
            if (number.equals("7")) {
                hands[6]++;
            }
            if (number.equals("8")) {
                hands[7]++;
            }
            if (number.equals("9")) {
                hands[8]++;
            }
            if (number.equals("10")) {
                hands[9]++;
            }
            if (number.equals("Jack")) {
                hands[10]++;
            }
            if (number.equals("King")) {
                hands[11]++;
            }
            if (number.equals("Queen")) {
                hands[12]++;
            }
        }
        return hands;
    }

    public static void Five (int[] x, int[]y) {
        for (int num : x) {
            if (num == 5) {
                y[0]++;
            }
        }
    }

    public static void Four (int[] x, int[]y) {
        for (int num : x) {
            if (num == 4) {
                y[1]++;
            }
        }
    }

    public static void Full (int[] x, int[]y) {
        boolean is3 = false;
        boolean is2 = false;
        for (int num : x) {
            if (num == 3) {
                is3 = true;
            }
            if (num == 2) {
                is2 = true;
            }
        }
        if (is3 && is2) {
            y[2]++;
        }
    }

    public static void Three (int[] x, int[]y) {
        boolean is3 = false;
        boolean is2 = false;
        for (int num : x) {
            if (num == 3) {
                is3 = true;
            }
            if (num == 2) {
                is2 = true;
            }
        }
        if (is3 && !is2) {
            y[3]++;
        }
    }
    public static void Two (int[] x, int[]y) {
        int count = 0;
        for (int num : x) {
            if (num == 2) {
                count++;
            }
        }
        if (count == 2) {
            y[4]++;
        }
    }

    public static void One (int[] x, int[]y) {
        int count = 0;
        boolean greaterThan = false;
        for (int num : x) {
            if (num == 2) {
                count++;
            }
            if (num >= 3) {
                greaterThan = true;
            }
        }
        if (count == 1 && !greaterThan) {
            y[5]++;
        }
    }

    public static void High (int[] x, int[]y) {
        int count = 0;
        for (int num : x) {
            if (num == 1) {
                count++;
            }
        }
        if (count == 5) {
            y[6]++;
        }
    }

    public static void RankHands () {

    }
}