package beat_it_1;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyListener extends KeyAdapter {
	
	@Override
	public void keyPressed(KeyEvent e) {
		if(BeatIt.game == null) {
			return;
		}
		
		if(e.getKeyCode() == KeyEvent.VK_NUMPAD1) {
			BeatIt.game.press1();
		}
		else if(e.getKeyCode() == KeyEvent.VK_NUMPAD7) {
			BeatIt.game.press7();
		}
		else if(e.getKeyCode() == KeyEvent.VK_NUMPAD5) {
			BeatIt.game.press5();
		}
		else if(e.getKeyCode() == KeyEvent.VK_NUMPAD9) {
			BeatIt.game.press9();
		}
		else if(e.getKeyCode() == KeyEvent.VK_NUMPAD3) {
			BeatIt.game.press3();
		}
	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		if(BeatIt.game == null) {
			return;
		}
		
		if(e.getKeyCode() == KeyEvent.VK_NUMPAD1) {
			BeatIt.game.release1();
		}
		else if(e.getKeyCode() == KeyEvent.VK_NUMPAD7) {
			BeatIt.game.release7();
		}
		else if(e.getKeyCode() == KeyEvent.VK_NUMPAD5) {
			BeatIt.game.release5();
		}
		else if(e.getKeyCode() == KeyEvent.VK_NUMPAD9) {
			BeatIt.game.release9();
		}
		else if(e.getKeyCode() == KeyEvent.VK_NUMPAD3) {
			BeatIt.game.release3();
		}
	}
}
