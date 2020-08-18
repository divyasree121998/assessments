



	class Hare implements Runnable
	{

	@Override
	public void run() {

	for(int i=1;i<=100;i++)
	{
	System.out.println("Hare "+i);

	try {
	Thread.sleep(100);
	} catch (InterruptedException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
	}

	if(i==90)
	{
	try {
	Thread.sleep(5000);
	} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
	}
	}
	}
	}

	}



	class Tortoise implements Runnable
	{

	@Override
	public void run() {

	for(int i=1;i<=100;i++)
	{
	System.out.println("Tortoise "+i);

	try {
	Thread.sleep(160);
	} catch (InterruptedException e1) {
	// TODO Auto-generated catch block
	e1.printStackTrace();
	}
	}
	}

	}


	public class Race {

	public static void main(String[] args) {

	Tortoise tortoise=new Tortoise();
	Hare hare =new Hare();

	Thread tortoiseThread=new Thread(tortoise);
	Thread hareThread=new Thread(hare);

	tortoiseThread.start();
	hareThread.start();

	while(true)
	{
	if(!hareThread.isAlive())
	{
	System.out.println("Hare Wins The Race");
	tortoiseThread.stop();
	break;
	}

	if(!tortoiseThread.isAlive())
	{
	System.out.println("Tortoise Wins The Race");
	hareThread.stop();
	break;
	}



	}


	System.out.println("Refree dies");

	}

	}
