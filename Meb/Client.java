package Meb;

public class Client {

	public static void main(String[] args) {
		AbstractChatroom happyChat=new ChatGroup();
		Member member1,member2,member3,member4,member5;
		member1=new DiamondMember("����");
		member2=new DiamondMember("����");
		member3=new CommonMember("����");
		member4=new CommonMember("С��");
		member5=new CommonMember("С��");
		
		happyChat.register(member1);
		happyChat.register(member2);
		happyChat.register(member3);
		happyChat.register(member4);
		happyChat.register(member5);

		member1.sendText("����", "�������");
		member2.sendImage("����", "˧�����");
		member4.sendText("С��", "�����������");
	}

}