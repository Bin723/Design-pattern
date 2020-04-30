package Fac;

public class GeneralSwitchFacade {
	private Light ligths[]=new Light[4];
	private Fan fan;
	private AirConditioner ac;
	private Television tv;
	
	public GeneralSwitchFacade() {
		ligths[0]=new Light("左前");
		ligths[1]=new Light("右前");
		ligths[2]=new Light("左后");
		ligths[3]=new Light("右后");
		fan =new Fan();
		ac=new AirConditioner();
		tv=new Television();
	}
	
	public void on() {
		ligths[0].on();
		ligths[1].on();
		ligths[2].on();
		ligths[3].on();
		fan.on();
		ac.on();
		tv.on();
	}
	public void off() {
		ligths[0].off();
		ligths[1].off();
		ligths[2].off();
		ligths[3].off();
		fan.off();
		ac.off();
		tv.off();
	}
}
