
/*


		实现两个变量中数据的交换

*/

public class SwapData{

	public static void main(String[] args){
	
		int a = 5;
		int b = 10;

		//需求 ：让a和b中的两个数据实现交换
		
		//方式一 : 必须都得记住都得会
		/*
			优点:容易理解。基本数据类型和引用数据类型都可以采用如下方式
			缺点：多创建一个变量。占用了内存。
		*/
		/*
		int temp = a;
		a = b;
		b = temp;
		*/

		//方式二(了解)：
		/*
			优点 ： 效率高
			缺点 ：可能会造成精度损失（溢出）,只能用于（基本数据类型）数值
		*/
		/*
		a = a + b; // a = (a + b)
		b = a - b; // b = (a + b) - b;
		a = a - b; // a = (a + b) - b(a);
		*/

		//方式三（了解）
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;



		System.out.println("a=" + a + " b=" + b);
	}
}