import java.util.Scanner;

public class TestMain {
	static Scanner sc=new Scanner(System.in);//scanner Incialised 
	
	public static void main(String[] args) {
		Branch b1= new Branch();
		int ch=0;
		do
		{
			b1=b1.BranchAccept();
		
		b1.BranchDisplay(b1);
		System.out.print("Enter :-");
		ch=sc.nextInt();
		}while(ch!=1);
		boolean b=false;
		b=b1.acceptUser();
	}

}
