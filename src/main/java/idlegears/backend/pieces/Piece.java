package idlegears.backend.pieces;

import java.util.ArrayList;

public class Piece {
    protected Float radius;
    protected Float height;
    protected Float posX;
    protected Float posY;
    protected Float posZ;
    protected Float rotation;
	protected ArrayList<Piece> linkedPieces;

	public Float getRadius() {
		return radius;
	}

	public void setRadius(Float radius) {
		this.radius = radius;
	}

	public Float getHeight() {
		return height;
	}

	public void setHeight(Float height) {
		this.height = height;
	}

	public Float getPosX() {
		return posX;
	}

	public void setPosX(Float posX) {
		this.posX = posX;
	}

	public Float getPosY() {
		return posY;
	}

	public void setPosY(Float posY) {
		this.posY = posY;
	}

	public Float getPosZ() {
		return posZ;
	}

	public void setPosZ(Float posZ) {
		this.posZ = posZ;
	}

    public Float getRotation() {
		return rotation;
	}

	public void setRotation(Float rotation) {
		this.rotation = rotation;
	}

	public ArrayList<Piece> getLinkedPieces() {
		return linkedPieces;
	}

    public Piece() {
        radius = 0.5f;
        height = 0.2f;
        posX = 0.f;
        posY = 0.f;
        posZ = 0.f;
        rotation = 0.f;
        linkedPieces = new ArrayList<Piece>();
    }

    public void addLinkedPiece(Piece piece) {
        linkedPieces.add(piece);
    }

    public void removeLinkedPiece(Piece piece) {
        linkedPieces.remove(piece);
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
