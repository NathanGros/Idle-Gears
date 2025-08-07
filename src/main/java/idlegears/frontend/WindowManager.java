package idlegears.frontend;

import static com.raylib.Colors.*;
import static com.raylib.Raylib.*;

import idlegears.backend.Board;

public class WindowManager {
    CameraManager cameraManager;
    ElementDrawer elementDrawer;
    InputManager inputManager;

    public WindowManager() {
        cameraManager = new CameraManager();
        elementDrawer = new ElementDrawer();
        inputManager = new InputManager();
    }

    private void loopWindow() {
        Board board = new Board();
        while (!WindowShouldClose()) {
            inputManager.checkMovement(cameraManager);
            BeginDrawing();
            ClearBackground(RAYWHITE);
            BeginMode3D(cameraManager.getCamera());
            DrawGrid(20, 1.0f); // Temporary
            elementDrawer.drawBoard(board);
            EndMode3D();
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
