package keisyou;

public class SmartPhone extends Mp3Player{
	public void play(){
		System.out.println("再生（ハイレゾ機能）");
	}

	public void call(){
		System.out.println("電話");
	}
	public void mail(){
		System.out.println("メール");
	}
	public void photo(){
		System.out.println("写真");
	}
	public void internet(){
		System.out.println("インターネット");
	}

}
