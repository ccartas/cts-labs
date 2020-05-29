package ro.ase.cts.utils.state.models;

import ro.ase.cts.utils.state.interfaces.State;

public class PlayingState implements State {
	private MediaPlayer mediaPlayer;
	
	public PlayingState(MediaPlayer mediaPlayer) {
		this.mediaPlayer = mediaPlayer;
	}
	
	@Override
	public void action() {
		if(this.mediaPlayer.getBateryLevel() > 20) {
			this.mediaPlayer.setIsPlaying(true);
			System.out.println("Music is playing");
		} else {
			this.mediaPlayer.changePlayerState(new PausedState(this.mediaPlayer));
			this.mediaPlayer.triggerState();
		}
	}

}
