/*
	
	算术运算符 ：  +（正） -（负）  + - *  / %  前++  后++ 前-- 后-- +（连接符）

	思考？取模结果的正负和什么有关？ 
		和被模数有关。被模数是正的结果就为正，被模数是负的结果就为负


	[面试题]前++后++，前--后--的区别是什么？
	前++ ：先自增1，后赋值
	后++ ：先赋值，再自增1
	前-- ：先自减1，后赋值
	后-- ：先赋值，再自减1
*/

public class AriTest{

	public static void main(String[] args){
	
		int a = -10;
		System.out.println(a);

		//除 
		int number = 10;
		int number2 = 4;
		int number3 = number / number2; //2

		double number4 = number / number2; //2.0

		number4 = (number + 0.0) / number2; //2.5

		number4 = (double)number / number2; //2.5

		number4 = (double)(number / number2); //2.0

		number4 = 10 / 4 * 4; //8.0
		//注意 ：在实际应用中如果有乘除，我们一般先乘再除
		number4 = 10 * 4 / 4; //10.0

		System.out.println(number4);

		System.out.println("----------------------------取模--------------------");
		
		//使用场景 ： 判断是否可以整除。 比如  x % 5 == 0 如果条件满足那么就可以整除
		System.out.println(0 % 2); //0
		System.out.println(1 % 2); //1
		System.out.println(2 % 2); //0
		System.out.println(3 % 2); //1
		System.out.println(4 % 2); //0
		System.out.println(5 % 2); //1
		System.out.println(6 % 2); //0

		System.out.println("-------------------------------------------");
		//思考？取模结果的正负和什么有关？ 和被模数有关。被模数是正的结果就为正，被模数是负的结果就为负
		System.out.println(-3 % 2); // -1
		System.out.println(3 % -2); //1
		System.out.println(-3 % -2); //-1


		System.out.println("--------------(++  -- )---------------");
		int b = 10;
		//后++
		//b++;
		//前++
		++b;
		System.out.println(b);

		System.out.println("--------------(前++ 和后++的区别)---------------");
		int n = 10;
		int n2 = n++; //后++先赋值再自增1
		System.out.println("n=" + n + " n2=" + n2); //n = 11 n2 = 10
		
		int c = 10;
		int c2 = ++c; //前++ 先自增1再赋值
		System.out.println("c=" + c + " c2=" + c2); //c =11  c2 = 11


		System.out.println("--------------(++ --注意的点)---------------");
		int number = 10;
		//number++++; //错误的写法
		//(number++)++;//错误的写法
		System.out.println(number);
	}
}