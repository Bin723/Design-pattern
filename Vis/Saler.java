package Vis;

public class Saler extends AVisitor{
	public void visit(Apple apple) {
		System.out.println("����Ա"+name+"��ƻ�����Ӽ�����۸�");
	}
	public void visit(Book book) {
		System.out.println("����Ա"+name+"ֱ�Ӽ�����ļ۸�");
	}

}
