package controller;

import message.Message;
import printer.Input;
import printer.Output;
import util.BuyLotto;

import java.util.List;

public class LottoController {
    public void runLottoSystem() {
        int costOfLotto = setCostOfLotto();
        int sliceOfLotto = BuyLotto.buyLotto(costOfLotto);
        setSliceOfLotto(costOfLotto);
        setLottoLists(sliceOfLotto);
    }

    private int setCostOfLotto() {
        return Input.CostOfLotto();
    }

    private void setSliceOfLotto(int costOfLotto) {
        Output.sliceOfLotto(costOfLotto);
    }

    private void setLottoLists(int sliceOfLotto) {
        Output.buyLists(sliceOfLotto);
    }
}
