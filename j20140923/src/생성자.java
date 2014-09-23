
public class 생성자 {
	String name;
	public 생성자()// 기본생성자
	{
		System.out.println("기본생성자");
		this.name = "aaa";
	}
	public 생성자(String name)
	{
		System.out.println("생성자"+name);
	}
	public 생성자(String name, int a)
	{
		System.out.println("생성자"+name+" "+a);
	}
	public 생성자(String name, int a ,double b)
	{
		System.out.println("생성자"+name+" "+a+" "+b);
	}
}
