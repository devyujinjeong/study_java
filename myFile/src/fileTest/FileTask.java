package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTask {
	public static void main(String[] args) throws IOException{
//		패션
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("fashion.txt"));
//		bufferedWriter.write("상의\n");
//		bufferedWriter.write("하의\n"); 
//		bufferedWriter.write("아우터\n");
//		bufferedWriter.write("악세서리\n");
//		bufferedWriter.close();
		
//		악세서리를 신발로 수정
//		BufferedReader bufferedReader = new BufferedReader(new FileReader("fashion.txt"));
//		String line=null,temp=""; 
//		while((line=bufferedReader.readLine())!=null) {
//			if(line.equals("악세서리")){ //만약에 악세서리가 있다면
//				temp+="신발\n"; //악세서리 대신에 신발을 temp에 추가하기
//				continue; // 다음으로 넘어가기
//			}
//			temp+=line+"\n"; //다른 것들은 그냥 temp에 추가하고 line에는 띄어쓰기가 없기 때문에 띄어쓰기 추가해주기!!
//		}
//		
//		bufferedReader.close();
//		
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("fashion.txt"));
//		bufferedWriter.write(temp);
//		bufferedWriter.close();
		
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
