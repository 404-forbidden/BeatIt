package beat_it_1;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Note extends Thread {

	private Image noteImage = new ImageIcon(Main.class.getResource("../images/note.jpg")).getImage();
	private int x, y = 580 - (1000/Main.SLEEP_TIME * Main.NOTE_SPEED)*Main.REACH_TIME;
	private String noteType;
	private boolean isProceed = true;
	
	public String getNoteType() {
		return noteType;
	}
	
	public Note(String noteType) {
		if(noteType.equals("1")) {
			x = 332;
		}
		else if(noteType.equals("7")) {
			x = 436;
		}
		else if(noteType.equals("5")) {
			x = 540;
		}
		else if(noteType.equals("9")) {
			x = 744;
		}
		else if(noteType.equals("3")) {
			x = 848;
		}
		this.noteType = noteType;
	}
	
	public void screenDraw(Graphics2D g) {
		if(noteType.equals("5")) {
			g.drawImage(noteImage, x, y, null);
			g.drawImage(noteImage, x + 100, y, null);
		}
		else {
			g.drawImage(noteImage, x, y, null);
		}
	}
	
	public void drop() {
		y += Main.NOTE_SPEED;
		if(y > 620) {
			System.out.println("miss");
			close();
		}
	}
	
	public boolean isProceed() {
		return isProceed;
	}
	
	public void close() {
		isProceed = false;
	}
	
	public String judge() {
		if(y >= 613) {
			System.out.println("Late");
			close();
			return "Late";
		}
		else if(y >= 600) {
			System.out.println("Good");
			close();
			return "Good";
		}
		else if(y >= 587) {
			System.out.println("Great");
			close();
			return "Great";
		}
		else if(y >= 573) {
			System.out.println("Perfect");
			close();
			return "Perfect";
		}
		else if(y >= 565) {
			System.out.println("Great");
			close();
			return "Great";
		}
		else if(y >= 550) {
			System.out.println("Good");
			close();
			return "Good";
		}
		else if(y >= 535) {
			System.out.println("Early");
			close();
			return "Early";
		}
		return "None";
	}
	
	public int getY() {
		return y;
	}
	
	@Override
	public void run() {
		try {
			while(true) {
				drop();
				if(isProceed) {
					Thread.sleep(Main.SLEEP_TIME);
				}
				else {
					interrupt();
					break;
				}
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
}
