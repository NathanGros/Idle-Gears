package idlegears.frontend;

import static com.raylib.Colors.*;
import static com.raylib.Raylib.*;

public class WindowManager {
    public WindowManager() {
    }

    private void loopWindow(CameraManager cameraManager) {
        while (!WindowShouldClose()) {
            if (IsKeyPressed(KEY_SPACE)) {
                cameraManager.rotate();
            }
            if (GetMouseWheelMove() == -1) {
                cameraManager.zoomIn();
            }
            if (GetMouseWheelMove() == 1) {
                cameraManager.zoomOut();
            }
            if (IsKeyDown(KEY_W)) {
                cameraManager.moveUp();
            }
            if (IsKeyDown(KEY_S)) {
                cameraManager.moveDown();
            }
            if (IsKeyDown(KEY_A)) {
                cameraManager.moveLeft();
            }
            if (IsKeyDown(KEY_D)) {
                cameraManager.moveRight();
            }
            BeginDrawing();
            ClearBackground(RAYWHITE);
            BeginMode3D(cameraManager.getCamera());
            DrawGrid(20, 1.0f);
            DrawCube(new Vector3().x(1).y(0).z(1), 1.f, 1.f, 1.f, RED);
            DrawCubeWires(new Vector3().x(1).y(0).z(1), 1.f, 1.f, 1.f, RAYWHITE);
            DrawCube(new Vector3().x(-1).y(0).z(-1), 1.f, 1.f, 1.f, BLUE);
            DrawCubeWires(new Vector3().x(-1).y(0).z(-1), 1.f, 1.f, 1.f, RAYWHITE);
            EndMode3D();
            EndDrawing();
        }
        CloseWindow();
    }

    public void launchWindow() {
        SetConfigFlags(FLAG_WINDOW_RESIZABLE);
        SetConfigFlags(FLAG_MSAA_4X_HINT);
        InitWindow(800, 450, "Idle Gears");
        SetTargetFPS(60);
        CameraManager cameraManager = new CameraManager();
        loopWindow(cameraManager);
    }
}
