package eddu.smg;
import java.util.Scanner;
public class TV_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		TV tv1 = new TV();
		int ch,v;
		tv1.turnon();
		if(tv1.on) {
			System.out.println("The TV is on ");
		}
		System.out.println("Channel between 1-120? ");
		ch = in.nextInt();
		tv1.setChannel(ch);
		System.out.println("The channel is  "+ tv1.channel);
		System.out.println("Volume level between 1-7? ");
		v = in.nextInt();
		tv1.setVolume(v);
		System.out.println("The volume level is "+ tv1.volumeLevel);
		tv1.channelUp();
		tv1.volumeDown();
		System.out.println("The channel is  "+ tv1.channel);
		System.out.println("The volume level is "+ tv1.volumeLevel);
		tv1.turnoff();
		if(!tv1.on) {
			System.out.println("The TV is off ");
		}
		
	}

}
