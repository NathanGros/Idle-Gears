package idlegears.frontend;

import static com.raylib.Raylib.*;

public class InputManager {
    public InputManager() {
    }

    public void checkMovement(CameraManager cameraManager) {
        if (IsKeyPressed(KEY_SPACE)) {
            cameraManager.rotate();
        }
        if (GetMouseWheelMove() == -1) {
            cameraManager.zoomOut();
        }
        if (GetMouseWheelMove() == 1) {
            cameraManager.zoomIn();
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
    }
}
