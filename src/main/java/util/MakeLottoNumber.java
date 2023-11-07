package util;

import java.util.ArrayList;
import java.util.Collections;

public class MakeLottoNumber {

    private static final Integer MAX_BASIC_LOTTO_NUMBER = 6;
    public static ArrayList<ArrayList<Integer>> makeLottoNumber(int sliceOfLotto){
        ArrayList<ArrayList<Integer>> lottos = new ArrayList<>();

        for (int lotto = 0; lotto < sliceOfLotto; lotto++) {
            ArrayList<Integer> lottoNumbers = new ArrayList<>();

            for (int lottoNum = 0; lottoNum < MAX_BASIC_LOTTO_NUMBER; lottoNum++) {
                int randomLottoNumber = MakeRandomNumbers.getRandomNumbers();
                lottoNumbers.add(randomLottoNumber);
            }
            lottos.add(lottoNumbers);
        }

        return lottos;
    }

    public static void outPutLottos(ArrayList<ArrayList<Integer>> lottos) {
        for (ArrayList<Integer> lotto : lottos) {
            Collections.sort(lotto);
            System.out.println(lotto);
        }
    }
}
