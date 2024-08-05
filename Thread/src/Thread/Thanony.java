package Thread;

public class Thanony extends Thread {
    String name;
    public Thanony(String name) {
    	this.name=name;
    }
    
	
	public static void main(String[] args) {
		Thanony s1=new Thanony("saha") {
			public void run() {
				for (int i=0;i<=20;i++) {
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(name);
				}
			}
		};
		Thanony s2=new Thanony("devan"){
			public void run() {
				for (int i=0;i<=20;i++) {
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(name);
				}
			}
		};
		s1.start();
		s2.start();
		
	}

}
