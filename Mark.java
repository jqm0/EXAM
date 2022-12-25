package firstTask;

public class Mark {
	private int markMath ;
	private int physics ;
public Mark() {
		
		this.markMath = 60;
		this.physics = 70;
	}
	public int getMathMark() {
		return markMath ;
	}

	public void setMathMark(int mark) {
		this.markMath  = mark;
	}

	public int getPhysics() {
		return physics;
	}

	public void setPhysics(int physics) {
		this.physics = physics;
	}
	
}
