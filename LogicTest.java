

/*
	�߼������ ��&���߼���         | ���߼���         �����߼���
				&& ����·��      || ����·��        ^ ���߼���� 

	
	˵����
		 ��.�߼���Ͷ�·�롣���������������һ��Ϊfalse�����Ϊfalse
		 2.�߼���Ͷ�·�򡣵��������������һ��Ϊtrue�����Ϊtrue
		 3.�߼��ǡ�ȡ����(���a��ֵΪtrue���Ϊfalse.���a��ֵΪfalse���Ϊtrue)
		 4.�߼���򡣵������������ֵ��ͬ���Ϊfalse.���ߵ�ֵ��ͬ���Ϊtrue

    �ص� ��
		1.�߼�������Ƕ�boolean���ͽ��������
		2.�߼�������Ľ��Ϊboolean����


	[������]&&��& ,|��||������

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
			System.out.println("����һ��true");
		}

		System.out.println("�������");

		System.out.println("-----------&&��&����-----------------");
		
		/*
			&&��&������
				����ߵ�ʽ�ӵĽ��Ϊtrueʱ��
					&&��&�ұߵ�ʽ�Ӷ���ִ�С�
				����ߵ�ʽ�ӵĽ��Ϊfalseʱ
					&&�ұߵ�ʽ�Ӳ���ִ�У���Ϊ���Ϊfalseʱ�Ϳ����жϳ������Ϊfalse����
					&�ұߵ�ʽ����Ȼִ�С�
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

		System.out.println("-------------------------,|��||�ĵ�����---------------------");

		/*
			||��|������
				����ߵ�ʽ�ӵĽ��Ϊfalseʱ��
					||��|�ұߵ�ʽ�Ӷ���ִ��
					
				����ߵ�ʽ�ӵĽ��Ϊtrueʱ
					||�ұߵ�ʽ�Ӳ���ִ�С�������ߵĽ��Ϊtrueʱ�����жϳ����Ϊtrue��
					|�ұߵ�ʽ����Ȼ��ִ��
					

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