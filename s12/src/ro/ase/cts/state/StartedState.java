package ro.ase.cts.state;

public class StartedState implements CheckpointState{

	@Override
	public void next(Checkpoint checkpoint) {
		// TODO Auto-generated method stub
		checkpoint.setState(new GrindingState());
	}

	@Override
	public void prev(Checkpoint checkpoint) {
		// TODO Auto-generated method stub
		System.out.println("Root state.");
	}

	@Override
	public void printStatus() {
		// TODO Auto-generated method stub
		System.out.println("You just started");
	}

}
