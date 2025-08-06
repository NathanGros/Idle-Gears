package idlegears.frontend;

import static com.raylib.Raylib.*;
import static java.lang.Math.*;

public class CameraManager {
    private Camera3D camera;
	private Float angle;
    private Float distance;
    private Float cameraX;
    private Float cameraY;
    private Float cameraZ;
    private Float targetX;
    private Float targetY;
    private Float targetZ;
    private Float moveSpeed;

    public Camera3D getCamera() {
		return camera;
	}

    public CameraManager() {
        angle = 0.f;
        distance = 15.f;
        cameraX = distance * (float) cos(angle);
        cameraY = distance;
        cameraZ = distance * (float) sin(angle);
        targetX = 0.f;
        targetY = 0.f;
        targetZ = 0.f;
        moveSpeed = 1.f;
        camera = new Camera3D()
                ._position(new Vector3().x(cameraX).y(cameraY).z(cameraZ))
                .target(new Vector3().x(targetX).y(targetY).z(targetZ))
                .up(new Vector3().x(0).y(1).z(0))
                .fovy(distance)
                .projection(CAMERA_ORTHOGRAPHIC);
    }

    private void updateCameraPos() {
        cameraX = targetX + distance * (float) cos(angle);
        cameraY = targetY + distance;
        cameraZ = targetZ + distance * (float) sin(angle);
        camera._position().x(cameraX).y(cameraY).z(cameraZ);
        camera.target().x(targetX).y(targetY).z(targetZ);
    }

    public void rotate() {
        Float circle_sixth = (float) (Math.PI / 3.);
        angle = (angle / circle_sixth + 1) * circle_sixth;
        updateCameraPos();
    }

    public void zoomIn() {
        distance *= 1.5f;
        camera.fovy(distance);
    }

    public void zoomOut() {
        distance /= 1.5f;
        camera.fovy(distance);
    }

    public void moveUp() {
        targetX -= moveSpeed * (float) cos(angle);
        targetZ -= moveSpeed * (float) sin(angle);
        updateCameraPos();
    }

    public void moveDown() {
        targetX += moveSpeed * (float) cos(angle);
        targetZ += moveSpeed * (float) sin(angle);
        updateCameraPos();
    }

    public void moveLeft() {
        targetX -= moveSpeed * (float) sin(angle);
        targetZ += moveSpeed * (float) cos(angle);
        updateCameraPos();
    }

    public void moveRight() {
        targetX += moveSpeed * (float) sin(angle);
        targetZ -= moveSpeed * (float) cos(angle);
        updateCameraPos();
    }
}
