package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTask {
	public static void main(String[] args) throws IOException{
//		BufferedWriter bw = new BufferedWriter(new FileWriter("cosmetic.txt"));
//		bw.write("ƾƮ\n");
//		bw.write("������\n"); 
//		bw.write("���\n");
//		bw.write("���̶���\n");
//		bw.close();
		
//		BufferedWriter bw =	new BufferedWriter(new FileWriter("fashion.txt"));
//		bw.write("����\n");
//		bw.write("����\n"); 
//		bw.write("�ƿ���\n");
//		bw.write("�Ǽ�����\n");
//		bw.close();
		
//		�Ǽ������� �Ź߷� ����
//		BufferedReader br = new BufferedReader(new FileReader("fashion.txt"));
//		String line=null,temp=""; 
//		while((line=br.readLine())!=null) {
//			if(line.equals("�Ǽ�����")){ //���࿡ �Ǽ������� �ִٸ�
//				temp+="�Ź�\n"; //�Ǽ����� ��ſ� �Ź��� temp�� �߰��ϱ�
//				continue; // �������� �Ѿ��
//			}
//			temp+=line+"\n"; //�ٸ� �͵��� �׳� temp�� �߰��ϰ� line���� ���Ⱑ ���� ������ ���� �߰����ֱ�!!
//		}
//		
//		br.close();
		
//		BufferedReader br = new BufferedReader(new FileReader("cosmetic.txt"));
//		String makeup = null, temp2 = "";
//		while((makeup=br.readLine())!=null) {
//			if(makeup.equals("���̶���")) {
//				temp2+="����ī��\n";
//				continue;
//			}
//			temp2+=makeup+"\n";
//		}
//		
//		br.close();
//		
//		BufferedWriter bw = new BufferedWriter(new FileWriter("cosmetic.txt"));
//		bw.write(temp2);
//		bw.close();
	
//		�Ź� ����
		BufferedReader bufferedReader = new BufferedReader(new FileReader("fashion.txt"));
		String line=null,temp=""; 
		while((line=bufferedReader.readLine())!=null) { //null�� ������ �ݺ��ϱ�
			if(line.equals("�Ź�")){ //���࿡ �Ź��� ������ �׳� ���� �ʰ� �Ѿ
				continue;  //�������� �׳� �Ѿ�� ���ؼ� ���
			}
			temp+=line+"\n";
		}
		
		bufferedReader.close(); //�� �ݾ���� ��
		
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("fashion.txt"));  // �����
		bufferedWriter.write(temp);  //temp�� �����
		bufferedWriter.close(); //�� �ݾ���� ��
	}
}
