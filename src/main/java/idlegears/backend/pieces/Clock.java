package idlegears.backend.pieces;

public class Clock extends Piece {
    public Clock() {
        super();
        rotation = 1.0f;
    }

    public void updateRotation() {
        if (linkedPieces.size() < 1) {
            rotation = 0.f;
            return;
        }
        Float referenceRotation = linkedPieces.get(0).getRotation();
        for (Piece piece: linkedPieces) {
            if (piece.getRotation() != referenceRotation) {
                rotation = 0.f;
                // Need Warning
                return;
            }
        }
        rotation = -1.f * referenceRotation;
    }
}
