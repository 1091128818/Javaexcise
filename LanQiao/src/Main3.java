/*
 * �������ǳ���������1֮�����޿ɱ�����������
 * 
 * ��Ŀ���ж�101-200֮���ж��ٸ���������������������� 

�����ֽ����������ǳ���1��������֮�⣬��Ҳû�������ܱ�������������Ҳ��������ֻ���������ӡ�
 * */
public class Main3 {

	public static void main(String[] args) {
		int i,j,m,n,x;
		m=0;n=0;x=0;
		for(i=101;i<200;i++) {
			for(j=1;j<=i;j++) {
				n=i%j;
				if(n==0)m=m++;
			}
			if(m==2) {
				System.out.print(i+" ");
				x=x++;
			}
			m=0;
		}
		System.out.println();
		System.out.println("���101-200֮���������"+"������"+x);
		

	}

}