public class Main 
{
	public static void main(String[] args) {
	
	TestExtendThread tes= new TestExtendThread();
	tes.start();
	}
}

class TestExtendThread extends Thread 
{ 
    public void run()
    {
        System.out.println("Hello World from thread");
    }
}
