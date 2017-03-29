public class CellContent{
	
	private boolean BombPlacement;
	private boolean BombTriggered;
	private boolean HasFlag;
	private boolean FalseFlag;
	private int value;
	
	public CellContent(){
		BombPlacement = false;
		BombTriggered = false;
		HasFlag = false;
		FalseFlag = false;
	}
	
	public CellContent(boolean BombPlacement){
		this.BombPlacement = BombPlacement;
		BombTriggered = false;
		HasFlag = false;
		FalseFlag = false;
	}
	
	public CellContent(int value){
		this.value = value;
		BombPlacement = false;
		BombTriggered = false;
		HasFlag = false;
		FalseFlag = false;
	}
	
	//getters and setters for each of the five class variables
	public void setFalseFlag(boolean FalseFlag) {
		this.FalseFlag = FalseFlag;
	}

	public void setOpened(boolean BombTriggered) {
		this.BombTriggered = BombTriggered;
	}

	public void setFlagged(boolean HasFlag) {
		this.HasFlag = HasFlag;
	}

	public void setBombPlacment(boolean BombPlacement){
		this.BombPlacement = BombPlacement;
	}
	
	public void setValue(int newValue){
		value = newValue;
	}
	
	public boolean getBombPlacement(){
		return BombPlacement;
	}
	
	public boolean BombTriggered() {
		return BombTriggered;
	}

	public boolean HasFlag() {
		return HasFlag;
	}

	public boolean FalseFlag() {
		return FalseFlag;
	}

	public int getValue(){
		return value;
	}
}