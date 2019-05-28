package ro.ase.cts.state;

public class Checkpoint {
	private CheckpointState state = new StartedState();
	
	
	public void setState(CheckpointState state) {
		this.state = state;
	}
	
	public void nextState() {
		this.state.next(this);
	}
	
	public void prevState() {
		this.state.next(this);
	}
	
	public void printStatus() {
		state.printStatus();
	}
}
