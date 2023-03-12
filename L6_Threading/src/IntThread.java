
public class IntThread extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		//super.run();
		
		for(int i = 0;i<10;i++) {
			System.out.println("Int Thread ::"+i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
