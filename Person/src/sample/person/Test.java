package sample.person;

public class Test {

	public static void main(String[] args) {
			Person taro=new Person();
		taro.name="山田　太郎";
		taro.age=20;
		taro.phoneNumber="000-0000-0000";
		taro.address="xxx@xxx.co.jp";

			System.out.println(taro.name);
			System.out.println(taro.age);
			System.out.println(taro.phoneNumber);
			System.out.println(taro.address);
			taro.talk();
			taro.walk();
			taro.run();
			
			Person kimura=new Person();
			
		kimura.name="木村　次郎";
		kimura.age=18;
		kimura.phoneNumber="111-1111-1111";
		kimura.address="yyy@yyy.com";
		
			System.out.println(kimura.name+kimura.age);
			System.out.println(kimura.phoneNumber);
			System.out.println(kimura.address);
			
			Person suzuki=new Person();
			
		suzuki.name="鈴木　花子";
		suzuki.age=16;
		suzuki.phoneNumber="222-2222-2222";
		suzuki.address="aaa@aaa.co.jp";
		
			System.out.println(suzuki.name+suzuki.age);
			System.out.println(suzuki.phoneNumber);
			System.out.println(suzuki.address);
			
			Person yojo=new Person();
			
		yojo.name="四條　慎平";
		yojo.age=25;
		yojo.phoneNumber="333-3333-3333";
		yojo.address="bbb@bbb.com";
		
			System.out.println(yojo.name+yojo.age);
			System.out.println(yojo.phoneNumber);
			System.out.println(yojo.address);
			
			Robot aibo=new Robot();
			
		aibo.name="アイボ";
			
			aibo.talk();
			aibo.walk();
			aibo.run();
			
			Robot asimo=new Robot();
			
		asimo.name="アシモ";
		
			asimo.talk();
			asimo.walk();
			asimo.run();
			
			Robot pepper=new Robot();
			
		pepper.name="ペッパー君";
			
			pepper.talk();
			pepper.walk();
			pepper.run();
			

		}

}
