
public class LoginForm {
	private UserDAO dao;
	private String userName;
	private String userPassword;
	
	public void init(String userName,String userPassword) {
		this.userName=userName;
		this.userPassword=userPassword;
	}
	public void display() {
		System.out.println("userName:"+userName);
		System.out.println("userPassword:"+userPassword);
	}
	public void validate() {
		if(userName.length()<1) {
			System.out.println("�û����������");
		}
		if(userPassword.length()<1) {
			System.out.println("���벻��ȷ��");
		
		}

	}
}
