package ro.ase.cts.utils.state;

import ro.ase.cts.utils.state.models.MediaPlayer;
import ro.ase.cts.utils.state.models.PlayingState;

public class Application {

	public static void main(String[] args) {
		MediaPlayer player = new MediaPlayer();
		player.triggerState();
		
		player.setBateryLevel(90);
		PlayingState playingState = new PlayingState(player);
		player.changePlayerState(playingState);
		player.triggerState();
		
		player.setBateryLevel(20);
		player.triggerState();
	}

}
