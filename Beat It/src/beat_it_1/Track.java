package beat_it_1;

public class Track {
	private String trackName;
	private String trackImage;
	private String selectedMusic; // ���ý� ������ ���̶���Ʈ
	private String trackMusic; // ���� �÷��� �� ������ ����
	
	public String getTrackName() {
		return trackName;
	}
	public void setTrackName(String trackName) {
		this.trackName = trackName;
	}
	public String getTrackImage() {
		return trackImage;
	}
	public void setTrackImage(String trackImage) {
		this.trackImage = trackImage;
	}
	public String getSelectedMusic() {
		return selectedMusic;
	}
	public void setSelectedMusic(String selectedMusic) {
		this.selectedMusic = selectedMusic;
	}
	public String getTrackMusic() {
		return trackMusic;
	}
	public void setTrackMusic(String trackMusic) {
		this.trackMusic = trackMusic;
	}
	
	public Track(String trackName) {
		super();
		this.trackName = trackName;
		this.trackImage = trackName + ".jpg";
		this.selectedMusic = trackName + " Selected.mp3";
		this.trackMusic = trackName + ".mp3";
	}
	
	public Track(String trackName, String trackImage, String selectedMusic, String trackMusic, String trackButton) {
		super();
		this.trackName = trackName;
		this.trackImage = trackImage;
		this.selectedMusic = selectedMusic;
		this.trackMusic = trackMusic;
	}
	
	
}