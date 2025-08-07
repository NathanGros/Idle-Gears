package idlegears.backend.pieces;

import java.util.ArrayList;

public class Piece {
    private Float radius;
    private Float posX;
    private Float posY;
    private Float posZ;
    private Float rotation;
	private ArrayList<Piece> linkedPieces;

	public Float getRadius() {
		return radius;
	}

	public void setRadius(Float radius) {
		this.radius = radius;
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

    public void addPiece(Piece piece) {
        linkedPieces.add(piece);
    }

    public void removePiece(Piece piece) {
        linkedPieces.remove(piece);
    }
}
