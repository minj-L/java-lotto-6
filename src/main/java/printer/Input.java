package printer;

import message.Message;

import camp.nextstep.edu.missionutils.Console;
import util.SplitString;

import java.util.List;

public class Input {
    public static int CostOfLotto () {
        System.out.println(Message.INPUT_COST_OF_LOTTO.getMessage());
        int costOfLotto = Integer.parseInt(Console.readLine());

        return costOfLotto;
    }

    public static List<String> winNumber() {
        System.out.println(Message.INPUT_WIN_NUMBER.getMessage());
        String inputWinNumber = Console.readLine();
        List<String> winNumbers;

        try {
            winNumbers = SplitString.splitString(inputWinNumber);
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException();
        }

        return winNumbers;
    }

    public static int bonusNumber() {
        System.out.println(Message.INPUT_BONUS_NUMBER.getMessage());
        String inputBonusNumber = Console.readLine();

        return Integer.parseInt(inputBonusNumber);
    }
}
