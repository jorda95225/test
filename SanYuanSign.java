
/*

	��Ԫ����� ��

	��ʽ �� ���������ʽ���� ���ʽ1 �����ʽ����

	˵����
		 1.�������ʽ�Ľ��ֻ����boolean���͡�������Ϊtrue���صĽ��Ϊ���ʽ1.������Ϊ���ʽ2.
		 2.��Ԫ�����������Ƕ��ʹ�ã����ǲ����顣
		 3.���ʽ1�ͱ��ʽ2������Ҫ����һ��
*/

public class SanYuanSign{

	public static void main(String[] args){
	
		//�������������е����ֵ
		int a,b;
		a = 20;
		b = 20;

		int max = (a > b)? a : b;  //���a > b�����㣬������ a <= b
		System.out.println(max);

		//�������������е����ֵ
		int aa,bb,cc;
		aa = 10;
		bb = 20;
		cc = 30;
	
		int maxNumber = (aa > bb)? aa : bb;
		maxNumber = (maxNumber > cc)? maxNumber : cc;
		System.out.println(maxNumber);
	

		System.out.println("--------------Ƕ��ʹ��------------------");
		//����������ʹ�� - �ɶ��ԱȽϲ�
		/*
		int maxNumber = (((aa > bb)? aa : bb) > cc)? ((aa > bb)? aa : bb) : cc;
		System.out.println(maxNumber);
		*/

		System.out.println("-----------------------------------");
		int c,d;
		c = 5;
		d = 3;
		String str = (c > d)? "c��":"d��";
		System.out.println(str);

		double dou = (c > d)? 5 : 5.3;
		System.out.println(dou);
	}
}