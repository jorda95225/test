
/*

	三元运算符 ：

	格式 ： （条件表达式）？ 表达式1 ：表达式２；

	说明：
		 1.条件表达式的结果只能是boolean类型。如果结果为true返回的结果为表达式1.否则结果为表达式2.
		 2.三元素运算符可以嵌套使用，但是不建议。
		 3.表达式1和表达式2的类型要保持一致
*/

public class SanYuanSign{

	public static void main(String[] args){
	
		//需求？求两个数中的最大值
		int a,b;
		a = 20;
		b = 20;

		int max = (a > b)? a : b;  //如果a > b不满足，则满足 a <= b
		System.out.println(max);

		//需求？求三个数中的最大值
		int aa,bb,cc;
		aa = 10;
		bb = 20;
		cc = 30;
	
		int maxNumber = (aa > bb)? aa : bb;
		maxNumber = (maxNumber > cc)? maxNumber : cc;
		System.out.println(maxNumber);
	

		System.out.println("--------------嵌套使用------------------");
		//不建议这样使用 - 可读性比较差
		/*
		int maxNumber = (((aa > bb)? aa : bb) > cc)? ((aa > bb)? aa : bb) : cc;
		System.out.println(maxNumber);
		*/

		System.out.println("-----------------------------------");
		int c,d;
		c = 5;
		d = 3;
		String str = (c > d)? "c大":"d大";
		System.out.println(str);

		double dou = (c > d)? 5 : 5.3;
		System.out.println(dou);
	}
}