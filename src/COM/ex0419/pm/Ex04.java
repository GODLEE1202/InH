package COM.ex0419.pm;

import COM.ex0419.ex.ExternalClass;
import COM.ex0419.ex.SuperClass;

public class Ex04 extends SuperClass{
	/*
	 * private ���� Ŭ���� �������� ���ٰ���
	 * default ���� ��Ű�� �������� ���ٰ���
	 * protected ���� ��Ű�� ������ �׸��� �ٸ� ��Ű���� �ڼ�Ŭ�������� ���ٰ���
	 * public ��� ���� ����
	 */
	
	
	private int a;
	int b;
	protected int c;
	public int d;
	
	private void aaa() {
		
	}
	void bbb() {
		
		
	}
	protected void ccc() {
		
	}
	public void ddd() {
		
	}
	public Ex04() {
		a=1;
		b=2;
		c=3;
		d=4;
		aaa();
		bbb();
		ccc();
		ddd();
		
		DefaultClass dc = new DefaultClass();
		//dc.a = 0;		private
		dc.b = 0;
		dc.c = 0;
		dc.d = 0;
		//dc.aaa();		private(���� Ŭ����)
		dc.bbb();
		dc.ccc();
		dc.ddd();
	
		//super.a =1; 	private(���� Ŭ����)
		//super.b =1;	protected(���� ��Ű��)
		super.c = 1;
		super.d = 2;
		//super.aaa();	private
		//super.bbb();	protected
		super.ccc();
		super.ddd();
		
		ExternalClass ec = new ExternalClass();
		//ec.a=3;
		//ec.b=3;
		//ec.c=3;		���� ��Ű�� �ȿ� ������ Ŭ����
		ec.d=3;
		//ec.aaa();
		//ec.bbb();
		//ec.ccc();
		ec.ddd();
		
		
	}
	
	
	
}

