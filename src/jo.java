import java.util.Scanner;


public class jo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		String cuserName, cpassword, userName, password;
		cuserName = "franz";
		cpassword = "franz90";
		
		userName = "";
		password ="";
		
		while (!userName.equals(cuserName) || !password.equals(cpassword)) {
		System.out.println("Eneter user name");
		userName = keyboard.next();
		System.out.println("Enter pasword");
		password = keyboard.next();
		}
		System.out.println("welcome " + cuserName);
		
		
	}	
}


