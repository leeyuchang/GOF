package ch19.state;

public class Main {

	public static void main(String[] args) {
		SafeFrame frame = new SafeFrame("State Sample");
		while(true) {
			for(int hour = 0; hour < 24; hour++) {
				frame.setClock(hour);
				
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
