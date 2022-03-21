package proxy;

public class ProxySound implements Sound {
	
	private RealSound realSound;
	private String fileName;

	public ProxySound(String fileName) {
		this.fileName = fileName;
	}

	@Override
	public void play() {
		
		// If something is not ok return and don't give access
		
		if(this.realSound == null) {
			this.realSound = new RealSound(this.fileName);
		}
		
		this.realSound.play();

	}

}
