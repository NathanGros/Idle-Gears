package idlegears.frontend;

import static com.raylib.Colors.*;
import static com.raylib.Raylib.*;

import idlegears.backend.Game;

public class WindowManager {
    CameraManager cameraManager;
    ElementDrawer elementDrawer;
    InputManager inputManager;
    Game game;

    public WindowManager(Game game) {
        cameraManager = new CameraManager();
        elementDrawer = new ElementDrawer();
        inputManager = new InputManager();
        this.game = game;
    }

    private void loopWindow() {
        while (!WindowShouldClose()) {
            inputManager.checkMovement(cameraManager);
            game.updateGameSpeed();
            BeginDrawing();
            ClearBackground(RAYWHITE);
            BeginMode3D(cameraManager.getCamera());
            DrawGrid(20, 1.0f); // Temporary
            elementDrawer.drawBoard(game.getBoard());
            EndMode3D();
            elementDrawer.drawGameSpeed(game.getGameSpeed());
            EndDrawing();
        }
        CloseWindow();
    }

    public void launchWindow() {
        SetConfigFlags(FLAG_WINDOW_RESIZABLE);
        SetConfigFlags(FLAG_FULLSCREEN_MODE);
        SetConfigFlags(FLAG_MSAA_4X_HINT);
        InitWindow(800, 450, "Idle Gears");
        SetTargetFPS(60);
        loopWindow();
    }
}
