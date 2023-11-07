package controller;

import message.Message;
import printer.Input;
import printer.Output;

import java.util.List;

public class LottoController {
    public void runLottoSystem() {
        int costOfLotto = setCostOfLotto();
        setSliceOfLotto(costOfLotto);
    }

    private int setCostOfLotto() {
        return Input.CostOfLotto();
    }

    private void setSliceOfLotto(int costOfLotto) {
        Output.sliceOfLotto(costOfLotto);
    }
}
