
/*
	��ֵ����� �� =
	��չ��ֵ����� +=, -=, *=, /=, %=

*/
public class SetValue{

	public static void main(String[] args){
	
		int a = 10;

		a += 2; //��������  a = a + 2 (������ͬ)

		System.out.println(a);

		System.out.println("--------------������-------------");

		byte b = 10;
		b += 2; //�������ͨ��������ı�ԭ�����ݵ�����
		//b = b + 2; ������� ��Ϊbyte���������������int
		System.out.println(b);
		
		System.out.println("-----------------------------");
		
		byte b2 = 10;
		b2++; //�������ͨ�� �����ı�ԭ�����͵Ļ���������1
		System.out.println(b2);
	}
}