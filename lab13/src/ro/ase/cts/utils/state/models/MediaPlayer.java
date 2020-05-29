package ro.ase.cts.utils.state.models;

import ro.ase.cts.utils.state.interfaces.State;

public class MediaPlayer {
	private State state;
	
	private boolean isPlaying; // stare propriu-zisa a contextului
	private int bateryLevel; // stare propriu-zisa a contextului
	
	public MediaPlayer() {
		this.state = new PausedState(this);
	}
	
	public void setIsPlaying(boolean isPlaying) {
		this.isPlaying = isPlaying;
	}
	public void setBateryLevel(int bateryLevel) {
		this.bateryLevel = bateryLevel;
	}
	
	public boolean getIsPlaying() {
		return this.isPlaying;
	}
	public int getBateryLevel() {
		return this.bateryLevel;
	}
	
	// setStare(stare: Stare): void
	public void changePlayerState(State state) {
		this.state = state;
	}
	
	// request
	public void triggerState() {
		this.state.action();
	}
}
