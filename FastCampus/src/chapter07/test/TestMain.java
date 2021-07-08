package chapter07.test;

import chapter07.school.School;
import chapter07.school.Score;
import chapter07.school.Student;
import chapter07.school.Subject;
import chapter07.school.report.GenerateGradeReport;
import chapter07.utils.Define;

public class TestMain {
	School goodSchool = School.getInstance();//학교
	Subject korean;//과목
	Subject math;//과목
	Subject dance;//추가 과목
	GenerateGradeReport gradeReport = new GenerateGradeReport();//리포트 출력용
	
	public static void main(String[] args) {
		TestMain test = new TestMain();
		
		test.createSubject();
		test.createStudent();
		
		String report = test.gradeReport.getReport();//성적결과 생성
		System.out.println(report);
	}
	
	//테스트 학생 생성
	private void createStudent() {
		Student student1 = new Student(211213, "강감찬", korean  );
		Student student2 = new Student(212330, "김유신", math  );
		Student student3 = new Student(201518, "신사임당", korean  );
		Student student4 = new Student(202360, "이순신", korean  );
		Student student5 = new Student(201290, "홍길동", math );
		
		goodSchool.addStudent(student1);//학교에 학생 추가
		goodSchool.addStudent(student2);
		goodSchool.addStudent(student3);
		goodSchool.addStudent(student4);
		goodSchool.addStudent(student5);
		
		korean.register(student1);//과목을 수강 등록(과목에 학생을 가지고 있다)
		//지금은 다 듣지만 추후에 과목에 어떤 학생들이 듣는지 알아야된다
		korean.register(student2);
		korean.register(student3);
		korean.register(student4);
		korean.register(student5);
		
		math.register(student1);
		math.register(student2);
		math.register(student3);
		math.register(student4);
		math.register(student5);
		
		//3학생만
		dance.register(student1);
		dance.register(student2);
		dance.register(student3);

		addScoreForStudent(student1, korean, 95); 
		addScoreForStudent(student1, math, 56);	
		addScoreForStudent(student1, dance, 95);	//추가 과목 점수 세팅
		
		addScoreForStudent(student2, korean, 95); 
		addScoreForStudent(student2, math, 95);	
		addScoreForStudent(student2, dance, 85);	//추가 과목 점수 세팅
		
		addScoreForStudent(student3, korean, 100); 
		addScoreForStudent(student3, math, 88);	
		addScoreForStudent(student3, dance, 55);	//추가 과목 점수 세팅
		
		addScoreForStudent(student4, korean, 89); 
		addScoreForStudent(student4, math, 95);	
		
		addScoreForStudent(student5, korean, 85); 
		addScoreForStudent(student5, math, 56);	

	}
	//과목별 성적입력
	private void addScoreForStudent(Student student, Subject subject, int point) {
		Score score = new Score(student.getStudentId(), subject, point);
		student.addSubjectScore(score);
	}

	//테스트 과목 생성
	private void createSubject() {
		korean = new Subject("국어", Define.KOREAN);
		math = new Subject("수학", Define.MATH);
		dance = new Subject("방송댄스",Define.DANCE);
		//추가과목 인스턴스 할당
		
		dance.setGradeType(Define.PF_TYPE);//기본이 AB_TYPE이라서 major타입에 따라서 구분되기 떄문에 안해도 되지만 
		//방송댄스는 해야된다.
		
		goodSchool.addSubject(korean);
		goodSchool.addSubject(math);
		//list추가
		goodSchool.addSubject(dance);
	}

}
