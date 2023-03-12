package inter.thread.communication;

public class T2 implements Runnable{

	Chat chat;
	String [] str= {"Hello,", "I am good, wau?","Thanks"};
	
	public T2(Chat chat) {
		// TODO Auto-generated constructor stub
		super();
		this.chat=chat;
		new Thread(this, "Answer Thread").start();
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i =0;i<str.length;i++) {
			chat.answer(str[i]);
		}
	}

	
}
