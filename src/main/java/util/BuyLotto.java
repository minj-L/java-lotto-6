package util;

public class BuyLotto {
    public static int buyLotto (int costOfLotto) {
        int sliceOfLotto = costOfLotto / 1000;

        if (costOfLotto % 1000 != 0) {
            throw new IllegalArgumentException();
        }

        return sliceOfLotto;
    }
}
