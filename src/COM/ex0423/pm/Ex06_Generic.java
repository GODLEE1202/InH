package COM.ex0423.pm;

public class Ex06_Generic {
	public static void main(String[] args) {
		
		/*
		 * ���׸� �޼ҵ�
		 * ���� : public <Ÿ���Ķ����(���׸�Ÿ��)...> ���� Ÿ�� �޼ҵ��(�Ű�����...)
		 * �޼ҵ忡���� �Ķ���� Ÿ���� �̿��ؼ� ���׸�Ÿ���� ������ �� �ִ�.
		 * ���׸� �޼ҵ�� ������ Ÿ���� �������� ��� ����� �����ϴ�.
		 * ���������� �ڿ� Ÿ�� �Ķ���͸� ���������ν� ������ �����ϴ�.
		 * ȣ���� �ΰ��� ������� ȣ���� �����ϴ�.
		 * => �޼����(�Ű���)
		 * <Ÿ���Ķ����> �޼���� (�Ű���)
		 */
		
		
		
		
		
		
		Util util = new Util();
		Box<Integer> box1 = util.boxing(100);
		//Box<Integer> box1 = util.<Integer> <-�������� boxing(100);
		Box<Double> box2 = util.boxing(12.2341564);
		
		System.out.println(box1.get());
		System.out.println(box2.get());
	}
}
