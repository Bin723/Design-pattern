package chain;

public class MidFruitSorting extends AbstractFruitSort{
	public MidFruitSorting(int weight) {
		super(weight);
	}
	protected void pushBox(String fruit) {
		fruitBox.add("ˮ����ͷ��"+fruit);
	}

}
