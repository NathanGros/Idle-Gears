package idlegears.backend.pieces;

public class Crank extends Piece {
    public Crank() {
        super();
        height = 0.1f;
    }

    public void clickAction() {
        if (Math.abs(rotation) < 1.0f) {
            rotation = 1.0f;
        }
    }
}
