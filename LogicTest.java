

/*
	逻辑运算符 ：&—逻辑与         | —逻辑或         ！—逻辑非
				&& —短路与      || —短路或        ^ —逻辑异或 

	
	说明：
		 １.逻辑与和短路与。当运算符的两边有一个为false结果就为false
		 2.逻辑或和短路或。当运算符的两边有一个为true结果就为true
		 3.逻辑非。取反。(如果a的值为true结果为false.如果a的值为false结果为true)
		 4.逻辑异或。当运算符的两边值相同结果为false.两边的值不同结果为true

    特点 ：
		1.逻辑运算符是对boolean类型进行运算的
		2.逻辑运算符的结果为boolean类型


	[面试题]&&和& ,|和||的区别？

*/
public class LogicTest{

	public static void main(String[] args){
	
		boolean a = true;
		boolean b = false;

		System.out.println(a & b); //false
		System.out.println(a && b); //false
		System.out.println(a | b); //true
		System.out.println(a || b); //true
		System.out.println(!b); //true
		System.out.println(a ^ b); //true

		System.out.println("------------------------------------");

		boolean boo = false;

		if(boo){
			System.out.println("我是一个true");
		}

		System.out.println("代码结束");

		System.out.println("-----------&&和&区别？-----------------");
		
		/*
			&&和&的区别？
				当左边的式子的结果为true时。
					&&和&右边的式子都会执行。
				当左边的式子的结果为false时
					&&右边的式子不再执行（因为左边为false时就可以判断出结果就为false）。
					&右边的式子仍然执行。
		*/
		boolean bo = false;
		int a1 = 10;
		if(bo & (a1++ < 20)){
			System.out.println("true");
		}
		System.out.println("bo=" + bo + " a1=" + a1);


		boolean bo2 = false;
		int a2 = 10;
		if(bo2 && (a2++ < 20)){
			System.out.println("true");
		}
		System.out.println("bo2=" + bo2 + " a2=" + a2);


		/*
			true
			bo=true a1=11
			true
			bo2=true a2=11

			bo=false a1=11
			bo2=false a2=10

		*/

		System.out.println("-------------------------,|和||的的区别？---------------------");

		/*
			||和|的区别？
				当左边的式子的结果为false时。
					||和|右边的式子都会执行
					
				当左边的式子的结果为true时
					||右边的式子不再执行。（当左边的结果为true时就能判断出结果为true）
					|右边的式了仍然会执行
					

		*/
		boolean bo3 = true;

		int aa = 10;
		if(bo3 | (aa++ < 20)){
			System.out.println("true");
		}
		System.out.println("bo3=" + bo3 + " aa=" + aa);


		int aa2 = 10;
		if(bo3 || (aa2++ < 20)){
			System.out.println("true");
		}
		System.out.println("bo3=" + bo3 + " aa2=" + aa2);

		/*
			
			bo3=false aa=11
			bo3=false aa2=11


			bo3=false aa=11
			bo3=false aa2=11

		*/
		
	}
}