package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest {
//	예외 던지기 : throws
//	메소드 안에서 동일한 Exception이 자주 발생하여 try~catch로 작성해야 한다면,
//	throws를 통해서, 사용한 부분으로 Exception을 보내준다.
//	throws를 사용하면 더 이상 메소드 안에서 해당 Exception이 발생하지 않고,
//	메소드를 사용하는 부분에서 한번만 try~catch를 사용해주면 된다. (일괄처리)
	public static void main(String[] args) throws IOException {
//		절대 경로: 어디서든 찾아갈 수 있는 경로, C:/부터 시작되면 절대경로이다. (보안이 취약함)
//		상대 경로: 현재 경로를 기준으로 찾아가는 경로, ../a/c, ./a/d(a/d로도 써도 됨)
//		이클립스에서 현재 경로는 패키지 폴더가 아니라 프로젝트 폴더이다.
//		BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt", true));
//		bw.write("정유진"); // write는 이어쓸수도 덮어쓸수도 있음
//		bw.flush();
//		bw.close(); // 무조건 닫고 그 다음 작업을 진행해야 함.

//		File file = new File("test.txt");
//		file.delete(); // 파일 삭제하기

		BufferedReader br = new BufferedReader(new FileReader("test.txt"));
		String line=null;
		while((line=br.readLine()) !=null) { // br.readLine()은 띄어쓰기를 인식하지 못함
			System.out.println(line);
		}
		br.close();		
	}
}
