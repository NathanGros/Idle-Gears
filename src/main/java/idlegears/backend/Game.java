package idlegears.backend;

public class Game {
    private Float gameSpeed;
    private Integer ticks;
	private Board board;

	public Float getGameSpeed() {
		return gameSpeed;
	}

	public void setGameSpeed(Float gameSpeed) {
		this.gameSpeed = gameSpeed;
	}

    public Board getBoard() {
		return board;
	}

    public Integer getTicks() {
		return ticks;
	}

	public void setTicks(Integer ticks) {
		this.ticks = ticks;
	}

	public Game() {
        gameSpeed = 1.f;
        ticks = 0;
        board = new Board();
    }

    public void updateGameSpeed() {
        gameSpeed = board.computeGameSpeed();
    }
}
