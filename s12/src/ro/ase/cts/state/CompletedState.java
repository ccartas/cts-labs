package ro.ase.cts.state;

public class CompletedState implements CheckpointState{

	@Override
	public void next(Checkpoint checkpoint) {
		// TODO Auto-generated method stub
		System.out.println("The mission is completed");
	}

	@Override
	public void prev(Checkpoint checkpoint) {
		// TODO Auto-generated method stub
		checkpoint.setState(new GrindingState());
	}

	@Override
	public void printStatus() {
		// TODO Auto-generated method stub
		System.out.println("The mission is completed");
	}
	
	

}
