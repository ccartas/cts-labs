package ro.ase.cts.utils.memento;

public class Application {

	public static void main(String[] args) {
		MediaPlayer player = new MediaPlayer();
		MediaPlayerCaretaker careTaker = new MediaPlayerCaretaker();
		
		player.start(careTaker.getState());
		
		player.setSongName("Drake - Nonstop");
		player.setTimer("2:13");
		
		careTaker.addMemento(player.exit());
		
		player.start(careTaker.getState());
	}

}
