package lotto;

import java.util.List;
import java.util.Map;

import static lotto.Constants.*;

public class OutputView {


    public static int getLottoCount(String purchaseAmount, int unit) {
        int lottoCount = Integer.parseInt(purchaseAmount) / unit;
        System.out.println(lottoCount + OUTPUT_COUNT_MSG);
        return lottoCount;
    }

    public static void showLottoSheets(List<Lotto> userLotto) {
        for (Lotto numbers : userLotto) {
            System.out.println(numbers.toString());
        }
    }

    public static void showWinningHistory(Map<Rank, Integer> winningHistory){
        System.out.println("당첨 통계");
        System.out.println("---");
        System.out.println(
                OUTPUT_MATCH_3 + winningHistory.get(Rank.RANK5) + OUTPUT_COUNT + "\n" +
                    OUTPUT_MATCH_4 + winningHistory.get(Rank.RANK4) + OUTPUT_COUNT + "\n" +
                    OUTPUT_MATCH_5 + winningHistory.get(Rank.RANK3) + OUTPUT_COUNT + "\n" +
                    OUTPUT_MATCH_5_BONUS + winningHistory.get(Rank.RANK2) + OUTPUT_COUNT + "\n" +
                    OUTPUT_MATCH_6 + winningHistory.get(Rank.RANK1) + OUTPUT_COUNT
        );
    }
}
