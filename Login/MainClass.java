import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("请输入用户名：");
		String userName=input.nextLine();
		System.out.println("请输入密码：");
		String userPassword=input.nextLine();
		LoginForm loginForm=new LoginForm();
		loginForm.init(userName,userPassword);
		loginForm.display();
		loginForm.validate();
	}

}
