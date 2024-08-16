package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTask {
	public static void main(String[] args) throws IOException{
//		BufferedWriter bw = new BufferedWriter(new FileWriter("cosmetic.txt"));
//		bw.write("틴트\n");
//		bw.write("섀도우\n"); 
//		bw.write("쿠션\n");
//		bw.write("아이라인\n");
//		bw.close();
		
//		BufferedWriter bw =	new BufferedWriter(new FileWriter("fashion.txt"));
//		bw.write("상의\n");
//		bw.write("하의\n"); 
//		bw.write("아우터\n");
//		bw.write("악세서리\n");
//		bw.close();
		
//		악세서리를 신발로 수정
//		BufferedReader br = new BufferedReader(new FileReader("fashion.txt"));
//		String line=null,temp=""; 
//		while((line=br.readLine())!=null) {
//			if(line.equals("악세서리")){ //만약에 악세서리가 있다면
//				temp+="신발\n"; //악세서리 대신에 신발을 temp에 추가하기
//				continue; // 다음으로 넘어가기
//			}
//			temp+=line+"\n"; //다른 것들은 그냥 temp에 추가하고 line에는 띄어쓰기가 없기 때문에 띄어쓰기 추가해주기!!
//		}
//		
//		br.close();
		
//		BufferedReader br = new BufferedReader(new FileReader("cosmetic.txt"));
//		String makeup = null, temp2 = "";
//		while((makeup=br.readLine())!=null) {
//			if(makeup.equals("아이라인")) {
//				temp2+="마스카라\n";
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
	
//		신발 삭제
		BufferedReader bufferedReader = new BufferedReader(new FileReader("fashion.txt"));
		String line=null,temp=""; 
		while((line=bufferedReader.readLine())!=null) { //null일 때까지 반복하기
			if(line.equals("신발")){ //만약에 신발이 있으면 그냥 담지 않고 넘어감
				continue;  //다음으로 그냥 넘어가기 위해서 사용
			}
			temp+=line+"\n";
		}
		
		bufferedReader.close(); //꼭 닫아줘야 함
		
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("fashion.txt"));  // 덮어쓰기
		bufferedWriter.write(temp);  //temp로 덮어쓰기
		bufferedWriter.close(); //꼭 닫아줘야 함
	}
}
