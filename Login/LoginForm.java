
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
			System.out.println("用户名输入错误！");
		}
		if(userPassword.length()<1) {
			System.out.println("密码不正确！");
		
		}

	}
}
