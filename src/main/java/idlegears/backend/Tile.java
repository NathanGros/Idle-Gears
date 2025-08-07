package idlegears.backend;

import static java.lang.Math.sqrt;

public class Tile {
    private Float radius;
    private Float height;
	private Float posX;
    private Float posY;
    private Float posZ;
	private Integer gridPosX;
    private Integer gridPosY;
    private Integer gridPosZ;

	public Float getRadius() {
		return radius;
	}

	public Float getHeight() {
		return height;
	}

    public Float getPosX() {
		return posX;
	}

	public Float getPosY() {
		return posY;
	}

	public Float getPosZ() {
		return posZ;
	}

    public Integer getGridPosX() {
		return gridPosX;
	}

	public Integer getGridPosY() {
		return gridPosY;
	}

	public Integer getGridPosZ() {
		return gridPosZ;
	}

    public Tile() {
        radius = (float) sqrt(1. / 3.);
        height = 0.2f;
        posX = 0.f;
        posY = 0.f;
        posZ = 0.f;
    }

    public Tile(Integer gridPosX, Integer gridPosY, Integer gridPosZ) {
        this();
        this.gridPosX = gridPosX;
        this.gridPosY = gridPosY;
        this.gridPosZ = gridPosZ;
        gridToAbsolute();
    }

    public void gridToAbsolute() {
        posX = gridPosX + 0.5f * gridPosZ;
        posY = gridPosY * 0.2f;
        posZ = gridPosZ * (float) (sqrt(3) / 2.);
    }
}
