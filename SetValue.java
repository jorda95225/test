
/*
	赋值运算符 ： =
	扩展赋值运算符 +=, -=, *=, /=, %=

*/
public class SetValue{

	public static void main(String[] args){
	
		int a = 10;

		a += 2; //可以理解成  a = a + 2 (但不相同)

		System.out.println(a);

		System.out.println("--------------面试题-------------");

		byte b = 10;
		b += 2; //编译可以通过，不会改变原来数据的类型
		//b = b + 2; 编译错误 因为byte做运算会先提升成int
		System.out.println(b);
		
		System.out.println("-----------------------------");
		
		byte b2 = 10;
		b2++; //编译可以通过 ：不改变原来类型的基础上自增1
		System.out.println(b2);
	}
}