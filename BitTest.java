

/*
	
	>> (����):  ��һ����Χ�ڣ�ÿ������һλ��ԭ����������2
	<< (����) : ��һ����Χ�ڣ�ÿ������һλ��ԭ����������2


	>> : ������������λ��0��������Ǹ������λ��1��
	>>> (�޷�������) :
*/
public class BitTest{

	public static void main(String[] args){
	
		
		System.out.println(6 >> 1); //3

		System.out.println(6 << 1); //12

		int a = 1;

		System.out.println(a << 31);

		System.out.println(6 >> 5);

		System.out.println("---------------->>  >>>----------------");

		System.out.println(6 >> 1); //3 ���λ�õ�0��
		System.out.println(-6 >> 1); //-3 ���λ��1��
		System.out.println(-6 >>> 1);

	}
}