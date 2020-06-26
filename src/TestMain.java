
public class TestMain {

	public static void main(String[] args) {
		admin a1=new admin();
		boolean adminautho=a1.acceptUser();
		if(adminautho==true)
		{
			System.out.println(" Okay Hello Admin !!!!");
		}
		else
		{
			System.out.println("You Are Not Admin");
		}
	}

}
