package jjjjj;
import java.util.Scanner;
public class everyting {
		public static void main(String[] args){

		User A=new User();
		A.add(null, null, null, null, null, null, null, null, null, null);
		A.login(null,null);
		
		
			
			
			
		}
}
class User{
	String id;
	String Pw;
	String userName;
	String nickName;
	int age;
	String sex;
	String major;
	String univ;
	String key;
	boolean pic;
	Scanner in=new Scanner(System.in);
	public void login(String a,String b){
		
		id=a;
		Pw=b;
		
		Scanner in=new Scanner(System.in);
		System.out.println("id�� �Է��Ͻÿ�: ");
		a=in.nextLine();
		System.out.println("Pw�� �Է��Ͻÿ�: ");
		b=in.nextLine();
		
		
	}
	public void logOut(){
		
	}
	public void add(String a,String b,String c,String d,int e,String f,String g,String h,String i,boolean j){
		id=a;
		System.out.println("id�� �Է��Ͻÿ�: ");
		a=in.nextLine();
		Pw=b;
		System.out.println("Pw�� �Է��Ͻÿ�: ");
		b=in.nextLine();
		userName=c;
		System.out.println("�̸��� �Է��Ͻÿ�: ");
		c=in.nextLine();
		nickName=d;
		System.out.println("�г����� �Է��Ͻÿ�: ");
		d=in.nextLine();
		age=e;
		System.out.println("���̸� �Է��Ͻÿ�: ");
		e=in.nextInt();
		sex=f;
		System.out.println("������ �Է��Ͻÿ�: ");
		f=in.nextLine();
		major=g;
		System.out.println("������ �Է��Ͻÿ�: ");
		g=in.nextLine();
		univ=h;
		System.out.println("������ �Է��Ͻÿ�: ");
		h=in.nextLine();
		key=i;
		System.out.println("���ɻ縦 �Է��Ͻÿ�: ");
		i=in.nextLine();
		pic=j;
	}
	public void delete(){
		
	}
	public void update(String a,String b,String c,String d,int e,String f,String g,String h,String i,boolean j){
		userName=c;
		nickName=d;
		age=e;
		sex=f;
		major=g;
		univ=h;
		key=i;
		pic=j;
	}
}
class UserDB{
	String id;
	String Pw;
	String UserName;
	String NickName;
	int Age;
	String Sex;
	String Major;
	String Univ;
	String keyword;
	boolean Pic;
}
class Matching{
	int Age;
	String Sex;
	String Univ;
	String Major;
	String Keyword;
public void compare(){
}
}

