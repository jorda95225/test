/*
	
	��������� ��  +������ -������  + - *  / %  ǰ++  ��++ ǰ-- ��-- +�����ӷ���

	˼����ȡģ�����������ʲô�йأ� 
		�ͱ�ģ���йء���ģ�������Ľ����Ϊ������ģ���Ǹ��Ľ����Ϊ��


	[������]ǰ++��++��ǰ--��--��������ʲô��
	ǰ++ ��������1����ֵ
	��++ ���ȸ�ֵ��������1
	ǰ-- �����Լ�1����ֵ
	��-- ���ȸ�ֵ�����Լ�1
*/

public class AriTest{

	public static void main(String[] args){
	
		int a = -10;
		System.out.println(a);

		//�� 
		int number = 10;
		int number2 = 4;
		int number3 = number / number2; //2

		double number4 = number / number2; //2.0

		number4 = (number + 0.0) / number2; //2.5

		number4 = (double)number / number2; //2.5

		number4 = (double)(number / number2); //2.0

		number4 = 10 / 4 * 4; //8.0
		//ע�� ����ʵ��Ӧ��������г˳�������һ���ȳ��ٳ�
		number4 = 10 * 4 / 4; //10.0

		System.out.println(number4);

		System.out.println("----------------------------ȡģ--------------------");
		
		//ʹ�ó��� �� �ж��Ƿ���������� ����  x % 5 == 0 �������������ô�Ϳ�������
		System.out.println(0 % 2); //0
		System.out.println(1 % 2); //1
		System.out.println(2 % 2); //0
		System.out.println(3 % 2); //1
		System.out.println(4 % 2); //0
		System.out.println(5 % 2); //1
		System.out.println(6 % 2); //0

		System.out.println("-------------------------------------------");
		//˼����ȡģ�����������ʲô�йأ� �ͱ�ģ���йء���ģ�������Ľ����Ϊ������ģ���Ǹ��Ľ����Ϊ��
		System.out.println(-3 % 2); // -1
		System.out.println(3 % -2); //1
		System.out.println(-3 % -2); //-1


		System.out.println("--------------(++  -- )---------------");
		int b = 10;
		//��++
		//b++;
		//ǰ++
		++b;
		System.out.println(b);

		System.out.println("--------------(ǰ++ �ͺ�++������)---------------");
		int n = 10;
		int n2 = n++; //��++�ȸ�ֵ������1
		System.out.println("n=" + n + " n2=" + n2); //n = 11 n2 = 10
		
		int c = 10;
		int c2 = ++c; //ǰ++ ������1�ٸ�ֵ
		System.out.println("c=" + c + " c2=" + c2); //c =11  c2 = 11


		System.out.println("--------------(++ --ע��ĵ�)---------------");
		int number = 10;
		//number++++; //�����д��
		//(number++)++;//�����д��
		System.out.println(number);
	}
}