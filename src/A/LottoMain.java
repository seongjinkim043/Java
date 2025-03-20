package A;

public class LottoMain {
    public static void main(String[] args) {
        LottoGame game = new LottoGame();
        if (game.inputUserNumbers()) {
            game.play();
        }
    }
}
