package lotto;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static lotto.Constants.*;

public class Application {

    public static void main(String[] args) {
        String purchaseAmount = InputView.getPurchaseAmount();

        int lottoCount = OutputView.getLottoCount(purchaseAmount, UNIT);
        List<Lotto> userLotto = publishLotto(lottoCount);
        OutputView.showLottoSheets(userLotto);

        List<Integer> winningNumbers = InputView.getWinningNumber();
        String bonusNumber = InputView.getBonusNumber();
    }

    private static List<Lotto> publishLotto(int lottoCount) {
        List<Lotto> userLotto = new ArrayList<>();
        for (int count = 0; count < lottoCount; count++) {
            userLotto.add(createLotto());
        }
        return userLotto;
    }

    private static Lotto createLotto() {
        List<Integer> numbers = Randoms.pickUniqueNumbersInRange(START_NUM, END_NUM, COUNT_NUM);
        Collections.sort(numbers);
        Lotto lotto = new Lotto(numbers);
        return lotto;
    }
}
