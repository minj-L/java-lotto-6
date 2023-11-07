package util;

import camp.nextstep.edu.missionutils.Randoms;
public class MakeRandomNumbers {

    private final static Integer START_NUMBER = 1;
    private final static Integer END_NUMBER = 45;
    public static int getRandomNumbers(){
        return Randoms.pickNumberInRange(START_NUMBER, END_NUMBER);
    }
}
