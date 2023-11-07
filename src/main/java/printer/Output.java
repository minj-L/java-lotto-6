package printer;

import message.Message;
import util.BuyLotto;

public class Output {
    public static void sliceOfLotto(int sliceOfLotto) {
        System.out.println(Message.HOW_MUCH_BUY_LOTTO.getBuyNumber(sliceOfLotto));
    }
}
