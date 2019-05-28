package ro.ase.cts.state;

public interface CheckpointState {
	void next(Checkpoint checkpoint);
	void prev(Checkpoint checkpoint);
	void printStatus();
}
