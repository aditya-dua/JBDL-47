
public class RunnableThreadMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RunnableThread r = new RunnableThread();
		
		Thread t1 = new Thread(r,"Thread -1 ");
		Thread t2 = new Thread(r,"Thread -2 ");

		t1.setDaemon(true);
		System.out.println(t1.getName());
		System.out.println(t1.isDaemon());
		
		t2.start();
		t1.start();
		
		for(int i = 0;i<10;i++) {
			System.out.println("Main ::"+i);
			
		}
	}

}
