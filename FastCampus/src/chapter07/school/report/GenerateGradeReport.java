package chapter07.school.report;

import java.util.ArrayList;

import chapter07.grade.BasicEvaluation;
import chapter07.grade.GradeEvaluation;
import chapter07.grade.MajorEvaluation;
import chapter07.grade.PassFailEvaluation;
import chapter07.school.School;
import chapter07.school.Score;
import chapter07.school.Student;
import chapter07.school.Subject;
import chapter07.utils.Define;

public class GenerateGradeReport {
	School school = School.getInstance();
	public static final String TITLE = " 수강생 학점 \t\t\n";
	public static final String HEADER = " 이름  |  학번  |중점과목| 점수   \n";
	public static final String LINE = "-------------------------------------\n";
	private StringBuffer buffer = new StringBuffer();
	
	public String getReport() {
		ArrayList<Subject> subjectList = school.getSubjectList();
		for(Subject subject : subjectList) {//학교에서 개설된 과목들
			makeHeader(subject);
			makeBody(subject);
			makeFooter();
		}
		return buffer.toString();
	}
	
	private void makeHeader(Subject subject) {
		buffer.append(GenerateGradeReport.LINE);
		buffer.append("\t" + subject.getSubjectName());
		buffer.append(GenerateGradeReport.TITLE );
		buffer.append(GenerateGradeReport.HEADER );
		buffer.append(GenerateGradeReport.LINE);
	}
	
	private void makeBody(Subject subject) {
		ArrayList<Student> studentList = subject.getStudentList();  // 각 과목의 학생들
		for(int i=0; i<studentList.size(); i++){
			Student student = studentList.get(i);
			buffer.append(student.getStudentName());
			buffer.append(" | ");
			buffer.append(student.getStudentId());
			buffer.append(" | ");
			buffer.append(student.getMajorSubject().getSubjectName() + "\t");
			buffer.append(" | ");
			
			getScoreGrade(student, subject.getSubjectId());  //학생별 해당과목 학점 계산
			buffer.append("\n");
			buffer.append(LINE);
		}
	}
	
	private void getScoreGrade(Student student, int subjectId) {
		ArrayList<Score> scoreList = student.getScoreList();
		int majorId = student.getMajorSubject().getSubjectId();//학생의 주요 id를 안다
		
		GradeEvaluation[] gradeEvaluation = {new BasicEvaluation(), new MajorEvaluation(), new PassFailEvaluation()};  //학점 평가 클래스들
		
		for(int i=0; i<scoreList.size(); i++){  // 학생이 가진 점수들 
			
			Score score = scoreList.get(i);
			if(score.getSubject().getSubjectId() == subjectId) {  // 현재 학점을 산출할 과목 
				String grade;
				if(score.getSubject().getGradeType() == Define.PF_TYPE) {
					//pass/Fail일 경우 중점과목 구분 필요 없다
					grade = gradeEvaluation[Define.PF_TYPE].getGrade(score.getPoint());
				}else {
					if(score.getSubject().getSubjectId() == majorId)  // 중점 과목인 경우
						grade = gradeEvaluation[Define.SAB_TYPE].getGrade(score.getPoint());  //중점 과목 학점 평가 방법
					else
						grade = gradeEvaluation[Define.AB_TYPE].getGrade(score.getPoint()); // 중점 과목이 아닌 경우
				}
				buffer.append(score.getPoint());
				buffer.append(":");
				buffer.append(grade);
				buffer.append(" | ");
			}
		}
	}

	private void makeFooter() {
		buffer.append("\n");

	}

	
}
