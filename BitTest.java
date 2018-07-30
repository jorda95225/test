

/*
	
	>> (右移):  在一定范围内，每向右移一位。原来的数除以2
	<< (左移) : 在一定范围内，每向左移一位。原来的数乘以2


	>> : 如果是正数最高位用0补，如果是负数最高位用1补
	>>> (无符号右移) :
*/
public class BitTest{

	public static void main(String[] args){
	
		
		System.out.println(6 >> 1); //3

		System.out.println(6 << 1); //12

		int a = 1;

		System.out.println(a << 31);

		System.out.println(6 >> 5);

		System.out.println("---------------->>  >>>----------------");

		System.out.println(6 >> 1); //3 最高位用的0补
		System.out.println(-6 >> 1); //-3 最高位用1被
		System.out.println(-6 >>> 1);

	}
}