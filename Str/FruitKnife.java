package Str;

public class FruitKnife implements ICutFruit{
	
	public void CutStrategy(String fruitname) {
		System.out.println(fruitname+"一次切成一片");
	}

}
