package logic;

public class VeryVeryDummyVideochat {
	private Boolean hasAWebcam;
	
	public VeryVeryDummyVideochat(Boolean camera) {
		this.hasAWebcam = camera;
	}
	
	public void turnOnFrontalCameraSTUB() {
		if(this.hasAWebcam == true) {
			System.out.println("Web Cam Activated");
			WebcamDriver camera = new WebcamDriver();
			camera.turnOnSTUB();
		}
		else {
			System.out.println("Questo dispositivo non ha una webcam");
		}
		
	}
	
	public void sendMessageSTUB(String msg, String receiver) {
		System.out.println("Sending this message '" + msg + "' To '" + receiver + "'");
	}
	
}
