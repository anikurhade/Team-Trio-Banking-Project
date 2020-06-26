import java.io.Console;
import java.util.Scanner;

public class admin implements Authorization {
	Scanner sc=new Scanner(System.in);//scanner Incialised 
	// private Value declaration 
			private String userId; 
			private String userPass;
			private String userString;
			int x=0;
			static int cunt=0;
			String []user=new String[2];
			String []pass=new String[2];
	//default constructor
				public admin() 
				{
					//default constructor;
				}
	//parametric constructor 
			public admin(String uId, String uPass) {
				super();
				this.userId = uId;
			    this.userPass = uPass;
			}
	//getters for Returning Value 
			public String getuId() {
				return userId;
			}
			public String getuPass() {
				return userPass;
			}
	//Function For Authorizing Admin ....
		boolean userAutho=false;
			
		public boolean acceptUser()
			{
		int i=0;
			do {
				if(cunt==0)
				{
					user[0]="Trio";
					pass[0]="admin123";
					
				}
			//accept User Name
				System.out.println("\n\n\n\t\t\t===============================================================================");
				System.out.print("\n\t\t\t\t\t *  UserName :- ");
				String temp_user=sc.next();
				int k=0;
			//check Accepted Username With Stored Username
				if(temp_user.equals(user[i]))
				{  
				//if matches accept password 
					int cnt=0;
					do {
				//accept password
					System.out.print("\n\t\t\t\t\t *   PassWord :-");
					String temp_pass=sc.next();
				//check Accepted Password With Stored Password
					if(temp_pass.equals(pass[i]))
					{
				//if matches accept Final Check 
						String Creator="Trio";
				//accept final check
						System.out.print("\n\t\t\t\t\t * Final Check Enter Creator Name:-");
						String acceptCreator=sc.next();
						if(acceptCreator.equals(Creator))
						{
				//if matches Admin Verified 
						System.out.println("\n\t\t\t\t\t\t\tAdmin Verified ");
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
					if(i>=user.length)
					{
						System.out.println("\n\t\t\t\t\t\t Username Not Found!!!");
						break;
					}
					
					else
						{
							System.out.println("\n\t\t\t\t\tUserName Entered Invalid ");
						}
				}
			}while(i!=user.length);
			return userAutho;
		//end of function 
			}
	// function to change Username And Password;
	public boolean changeSysUser()
	{
		System.out.println("\t\t\t\t Checking Wether It's You Admin ");
		System.out.println("\t\t\t\t\t(Enter Your Old Details ) ");
		boolean check=acceptUser(),change=false;
		if(check==true)
		{
			System.out.print("\n\t\t\t\t\t * Enter New UserName:- ");
			String newUserid=sc.next();
			user[x]=newUserid;
			System.out.print("\n\t\t\t\t\t * Enter New PassWord :-");
			String newUserPass=sc.next();
			pass[x]=newUserPass;
			x++;
			admin a1=new admin(newUserid, newUserPass);
			
			System.out.println("\n\t\t\t\t User Details Updated !!! ");
			System.out.println("\n\n\n\t\t\t===============================================================================");
			change=true;
			cunt=1;
		}
		else
		{
			System.out.println("\n\t\t\t\t Authorization Failed !!! You Can't Change Password !!!!");
		}
		return change;
	}

	
}
