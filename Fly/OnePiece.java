package Fly;

public class OnePiece extends APiece {
	public OnePiece(String inkind) {
		super(inkind);
	}
	@Override
	public void Play(int x, int y) {
		System.out.println("��"+inkind+"�ӷ��ڣ�"+x+","+y+"����λ����");
	}

}
