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

    public void Five (int[] x, int[]y) {
        for (int num : x) {
            if (num == 5) {
                y[0]++;
            }
        }
    }

    public void Four (int[] x, int[]y) {
        for (int num : x) {
            if (num == 4) {
                y[1]++;
            }
        }
    }

    public void Full (int[] x, int[]y) {
        for (int num : x) {
            if (num == 5) {
                y[0]++;
            }
        }
    }

    public void Three (int[] x, int[]y) {
        for (int num : x) {
            if (num == 5) {
                y[0]++;
            }
        }
    }
    public void Two (int[] x, int[]y) {
        for (int num : x) {
            if (num == 5) {
                y[0]++;
            }
        }
    }
}

