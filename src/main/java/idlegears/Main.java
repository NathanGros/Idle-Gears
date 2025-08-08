package idlegears;

import idlegears.backend.Game;
import idlegears.frontend.WindowManager;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();
        WindowManager windowManager = new WindowManager(game);
        windowManager.launchWindow();
    }
}
