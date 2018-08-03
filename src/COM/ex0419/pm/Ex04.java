package COM.ex0419.pm;

import COM.ex0419.ex.ExternalClass;
import COM.ex0419.ex.SuperClass;

public class Ex04 extends SuperClass{
	/*
	 * private 같은 클래스 내에서만 접근가능
	 * default 같은 패키지 내에서만 접근가능
	 * protected 같은 패키지 내에서 그리고 다른 패키지의 자손클래스에서 접근가능
	 * public 모두 접근 가능
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
		//dc.aaa();		private(같은 클래스)
		dc.bbb();
		dc.ccc();
		dc.ddd();
	
		//super.a =1; 	private(같은 클래스)
		//super.b =1;	protected(같은 패키지)
		super.c = 1;
		super.d = 2;
		//super.aaa();	private
		//super.bbb();	protected
		super.ccc();
		super.ddd();
		
		ExternalClass ec = new ExternalClass();
		//ec.a=3;
		//ec.b=3;
		//ec.c=3;		같은 패키지 안에 인접한 클래스
		ec.d=3;
		//ec.aaa();
		//ec.bbb();
		//ec.ccc();
		ec.ddd();
		
		
	}
	
	
	
}

