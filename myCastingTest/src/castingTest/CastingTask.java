package castingTest;

// 넷플릭스
// 애니메이션, 영화, 드라마 클래스 선언
// 사용자가 선택한 영상이
// 애니메이션 이라면 "자막 지원" 기능 사용
// 영화라면 "4D" 기능 사용
// 드라마라면 "굿즈" 기능 사용

// 클래스 선언하기
public class CastingTask {
//	비디오를 확인하는 메소드 선언하기
	public void checkVideo(Video video) {
		if(video instanceof Animation) { // 객체 간의 타입 비교하기
			((Animation)video).printStubtitle(); // down casting

		}
		
		else if(video instanceof Drama) { // 객체 간의 타입 비교하기
			((Drama)video).print4D(); // down casting
		}
		
		else { // 객체 간의 타입 비교하기
			((Movie)video).sellGoods(); // down casting
		}
	}

	public static void main(String[] args) {
//		테스트
		CastingTask castingTask = new CastingTask();
		
//		비디오 배열에 담기
		Video[] video= {
				new Animation(),
				new Drama(),
				new Movie()
		};
		
		for(int i=0;i<video.length;i++) {
			castingTask.checkVideo(video[i]);
		}
	}
}
