package coding;

import java.util.ArrayList;

public class code4673 {

	public static void main(String[] args) {
		
		
		int min = 1;
		int max = 10000;
		
		ArrayList<Integer> unSelfNum = new ArrayList<Integer>();//NOT�����ѹ�
		ArrayList<Integer> selfNum = new ArrayList<Integer>();//�����ѹ�
		
		int nowNum;		//���� ������� ����
		int position;	//�ڸ���
		int remainder;	//������
		int firstNum = 0;	//���ڸ� ����
		
		while(min<max) {//�ִ밪 ����
			while(true) {
				if(!unSelfNum.contains(min)) {
					if(min<max) {
						selfNum.add(min);
					}
					
					nowNum = min++;
					
					break;
				}
				else min++;
			}
			while(nowNum < max) {
				position = (int)(Math.log10(nowNum));	//���� �α�10�� ������� = �ڸ���
				remainder = nowNum;
				
				for (int i = position; i >= 0; i--) {
					firstNum = (int)(remainder/Math.pow(10, i));
					remainder -= (int)(firstNum * Math.pow(10, i));
					nowNum += firstNum;
				}
				if(firstNum >= max) break;
				if(!unSelfNum.contains(nowNum)) unSelfNum.add(nowNum);
			}
			
		}
		for (Integer integer : selfNum) {
			System.out.println(integer);
		}

}
}
