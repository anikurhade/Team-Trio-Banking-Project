import java.util.LinkedList;
import java.util.Scanner;

public class Branch implements Authorization
{
	static Scanner sc =new Scanner(System.in);
	//Declaration Of Variables 
	private String branchCode;
	private int branchMICR;
	private String branchIFSC;
	private String branchName;
	private String branchAddress;
	private long branchPhone;
	private String branchPass;
	private Branch Branch[]=new Branch[10];
	static private int x=1;
	
	public Branch()
	{
		//default constructor
	}
	//Creating Constructor
	public Branch(String branchCode, int branchMICR,String branchIFSC, String branchName, String branchAddress,
			long branchPhone,String branchPass) {
		
		super();
		
		this.branchCode = branchCode;
		this.branchMICR = branchMICR;
		this.branchIFSC = branchIFSC;
		this.branchName = branchName;
		this.branchAddress = branchAddress;
		this.branchPhone = branchPhone;
		this.branchPass=branchPass;
		
	}
	
	// getters for display And Other Information
	public String getBranchCode() {
		return branchCode;
	}
	public int getBranchMICR() {
		return branchMICR;
	}
	public String getBranchIFSC() {
		return branchIFSC;
	}
	public String getBranchName() {
		return branchName;
	}
	public String getBranchAddress() {
		return branchAddress;
	}
	public long getBranchPhone() {
		return branchPhone;
	}
	public String getBranchPass() {
		return branchPass;
	}
	public int getX() 
	{
		return x;
	}
	// create function 
	public void BranchCreate()
	{
		Branch b1;
		if(x!=0)
		{
			b1=BranchAccept();
		}
		else
		{
		    String branch_Code="BOM100";
			int branch_MICR=4390;
			String branch_IFSC="IFSC1980";
			String branch_Name="ShivajiNagar Branch";
			String branch_Address="Near Deccan Hardikar Hospital ,ShivajiNagar,Pune";
			int branch_Phone=937307691;
			String branch_Pass="BOMSHIV";
			b1=new Branch(branch_Code, branch_MICR, branch_IFSC, branch_Name, branch_Address, branch_Phone, branch_Pass);
			Branch[0]=b1;
		}	 
			
		
		Branch[x]=b1;
		x++;
	}
	// accept Function 
	public Branch BranchAccept() 
	{
		
		
		System.out.println("\n\n\n\t\t\t===========================New branch Detail====================================================");
		System.out.print("\n\t\t\t\t\t * Branch Code :- ");
		String Code=sc.next();
		System.out.print("\n\t\t\t\t\t * Branch IFSC :- ");
		String IFSC=sc.next();
		System.out.print("\n\t\t\t\t\t * Branch Name :- ");
		String Name=sc.next();
		System.out.print("\n\t\t\t\t\t * Branch Address :- ");
		String Addr=sc.next();
		System.out.print("\n\t\t\t\t\t * Branch Phone :- ");
		int Phone=sc.nextInt();
		System.out.print("\n\t\t\t\t\t * Branch PassWord :- ");
		String Password=sc.next();
		System.out.println("\n\t\t\t=============================*********************************=====================================");
		Branch b1=new Branch(Code,getBranchMICR()+1,IFSC,Name,Addr,Phone,Password);
		
		return b1;
		
	}
	//display Function
	
	public void BranchDisplay(Branch b1) {
		System.out.println("\n\n\t\t\t===========================Display Branch Detail====================================================");
		System.out.println("\t\t\t\t\t \" Branch Code\" :- "+b1.getBranchCode());
		System.out.println("\t\t\t\t\t \" Branch MICR\" :- "+b1.getBranchMICR());
		System.out.println("\t\t\t\t\t \" Branch IFSC\" :- "+b1.getBranchIFSC());
		System.out.println("\t\t\t\t\t \" Branch Name\" :- "+b1.getBranchName());
		System.out.print("\t\t\t\t\t \" Branch Address\" :- "+b1.getBranchAddress());
		System.out.println("\n\t\t\t\t\t \" Branch Contact\" :- "+b1.getBranchPhone());
		System.out.println("\n\n\t\t\t=============================*******************************============================================");
		
	}
	
	//Function For Authorizing Branch ....
			boolean userAutho=false;
				
	public boolean acceptUser()
		{
	int i=0;
		do {
			
		//accept User Name
			System.out.println("\n\n\n\t\t\t===============================================================================");
			System.out.println("\n\t\t\t\t\tPlease Enter Creditials !!");
			System.out.print("\n\t\t\t\t\t *  Branch Code :- ");
			String temp_branchcode=sc.next();
			int k=0;
		//check Accepted Username With Stored Username
			if(temp_branchcode.equals((Branch[i].branchCode)))
			{  
			//if matches accept password 
				int cnt=0;
				do {
			//accept password
				System.out.print("\n\t\t\t\t\t *   PassWord :-");
				String temp_pass=sc.next();
			//check Accepted Password With Stored Password
				if(temp_pass.equals(Branch[i].branchPass))
				{
			//if matches accept Final Check 
					String Creator="Trio";
			//accept final check
					System.out.print("\n\t\t\t\t\t * Final Check Enter Creator Name:-");
					String acceptCreator=sc.next();
					if(acceptCreator.equals(Creator))
					{
			//if matches Admin Verified 
					System.out.println("\n\t\t\t\t\t\t\tBranch Access Verified ");
					userAutho=true;
					break;
					}
					else 
					{
			//else print Warning!!! 
						System.out.println("\n\t\t\t\t You Missed That !! Bye Bye Have A Happy Journey To Jail !!!");
						
						break;
					}
				//end If of password check;
				}
			//else of Password check 
				else
				{
					System.out.println("\n\t\t\t\t\t\tPassWord Invalid!!");
					System.out.println("\n\n\n\t\t\t===============================================================================");
					cnt++;
				}
			//while for checking  and entering password 3 time if incorrect;
			}while(cnt!=3);
			break;
			//end Password check ;
			}
		//userName check  Else statement  	
			else
			{
				if(i>=Branch.length)
				{
					System.out.println("\n\t\t\t\t\t\t Username Not Found!!!");
					break;
				}
				
				else
					{
						System.out.println("\n\t\t\t\t\tUserName Entered Invalid ");
					}
			}
		}while(i!=Branch.length);
		return userAutho;
	//end of function 
		}
	
}
