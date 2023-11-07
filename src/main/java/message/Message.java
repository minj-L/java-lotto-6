package message;

public enum Message {
    INPUT_COST_OF_LOTTO("구입금액을 입력해 주세요."),
    HOW_MUCH_BUY_LOTTO("개를 구매했습니다."),
    INPUT_WIN_NUMBER("당첨 번호를 입력해 주세요."),
    INPUT_BONUS_NUMBER("보너스 번호를 입력해 주세요."),
    STATISTICS_OF_WIN_NUMBER("당첨 통계");

    private final String message;

    Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public String getButNumber(String buyNumber) {
        return String.format("%s %s", buyNumber, this.HOW_MUCH_BUY_LOTTO.getMessage());
    }
}
