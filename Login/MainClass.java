import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("�������û�����");
		String userName=input.nextLine();
		System.out.println("���������룺");
		String userPassword=input.nextLine();
		LoginForm loginForm=new LoginForm();
		loginForm.init(userName,userPassword);
		loginForm.display();
		loginForm.validate();
	}

}
