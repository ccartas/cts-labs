package ro.ase.cts.utils.state.models;

import ro.ase.cts.utils.state.interfaces.State;

public class PausedState implements State {
	private MediaPlayer mediaPlayer;
	
	public PausedState(MediaPlayer mediaPlayer) {
		this.mediaPlayer = mediaPlayer;
	}
	
	@Override
	public void action() {
		this.mediaPlayer.setIsPlaying(false);
		System.out.println("Media player is paused.");
	}

}
