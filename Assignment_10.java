package GMT_Assignments;

//Write a program on for loop to print from-100 to -150

public class Assignment_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=-100;i>=-150;i--)
		{
			System.out.println(i);
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
