package lt5;

public class Lt_continue {
	public static void main(String[] args) {
		// �����ַ������1-10��3�ı���
		System.out.println("����1");
		for (int i=1; i<=10; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("����2��ʹ��continue");
		for (int i=1; i<=10; i++) {
			if (i % 3 != 0) {
				continue;
			}
			System.out.println(i);
		}
	}
}
