public class Main 
{
	public static void main(String[] args) {
	
	TestExtendThread tes= new TestExtendThread();
	Thread t = new Thread (tes);
	t.start();
	}
}

class TestExtendThread implements Runnable
{ 
    public void run()
    {
        System.out.println("Hello World from thread via runnabke");
    }
}
