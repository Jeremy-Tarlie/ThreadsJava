package Threads;

public class MonRunnable implements Runnable {
	private String name;
	
	public MonRunnable(String name) {
		this.name = name;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(name+" : Étape "+i);
			try {
				// FAites dormir le thread pendant un certain temps pour somuler un travail
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				System.out.println(name + " a été interrompu.");
			}
		}
	}
}
