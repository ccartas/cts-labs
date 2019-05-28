package ro.ase.cts.state;

public class GrindingState implements CheckpointState{

	@Override
	public void next(Checkpoint checkpoint) {
		// TODO Auto-generated method stub
		checkpoint.setState(new CompletedState());
	}

	@Override
	public void prev(Checkpoint checkpoint) {
		// TODO Auto-generated method stub
		checkpoint.setState(new StartedState());
	}

	@Override
	public void printStatus() {
		// TODO Auto-generated method stub
		System.out.println("You are grinding");
	}
	
}
