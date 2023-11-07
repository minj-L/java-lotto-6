package printer;

import message.Message;
import util.BuyLotto;
import util.MakeLottoNumber;

public class Output {
    public static void sliceOfLotto(int sliceOfLotto) {
        System.out.println(Message.HOW_MUCH_BUY_LOTTO.getBuyNumber(sliceOfLotto));
    }

    public static void buyLists(int sliceOfLotto) {
        MakeLottoNumber.outPutLottos(MakeLottoNumber.makeLottoNumber(sliceOfLotto));
    }
}
