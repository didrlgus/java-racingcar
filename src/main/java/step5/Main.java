package step5;


import step5.domain.RacingGame;
import step5.view.InputView;
import step5.view.ResultView;

public class Main {
    public static void main(String[] args) {
        InputView inputView = new InputView();
        RacingGame racingGame;

        inputView.init();
        inputView.showInputCarMessage();
        String[] inputName = inputView.inputCarName();

        inputView.showInputRoundMessage();
        int round = inputView.inputRound();

        racingGame = new RacingGame(inputName, round);

        ResultView.getGameResult(racingGame);
    }
}