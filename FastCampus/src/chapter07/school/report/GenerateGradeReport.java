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
	public static final String TITLE = " ������ ���� \t\t\n";
	public static final String HEADER = " �̸�  |  �й�  |��������| ����   \n";
	public static final String LINE = "-------------------------------------\n";
	private StringBuffer buffer = new StringBuffer();
	
	public String getReport() {
		ArrayList<Subject> subjectList = school.getSubjectList();
		for(Subject subject : subjectList) {//�б����� ������ �����
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
		ArrayList<Student> studentList = subject.getStudentList();  // �� ������ �л���
		for(int i=0; i<studentList.size(); i++){
			Student student = studentList.get(i);
			buffer.append(student.getStudentName());
			buffer.append(" | ");
			buffer.append(student.getStudentId());
			buffer.append(" | ");
			buffer.append(student.getMajorSubject().getSubjectName() + "\t");
			buffer.append(" | ");
			
			getScoreGrade(student, subject.getSubjectId());  //�л��� �ش���� ���� ���
			buffer.append("\n");
			buffer.append(LINE);
		}
	}
	
	private void getScoreGrade(Student student, int subjectId) {
		ArrayList<Score> scoreList = student.getScoreList();
		int majorId = student.getMajorSubject().getSubjectId();//�л��� �ֿ� id�� �ȴ�
		
		GradeEvaluation[] gradeEvaluation = {new BasicEvaluation(), new MajorEvaluation(), new PassFailEvaluation()};  //���� �� Ŭ������
		
		for(int i=0; i<scoreList.size(); i++){  // �л��� ���� ������ 
			
			Score score = scoreList.get(i);
			if(score.getSubject().getSubjectId() == subjectId) {  // ���� ������ ������ ���� 
				String grade;
				if(score.getSubject().getGradeType() == Define.PF_TYPE) {
					//pass/Fail�� ��� �������� ���� �ʿ� ����
					grade = gradeEvaluation[Define.PF_TYPE].getGrade(score.getPoint());
				}else {
					if(score.getSubject().getSubjectId() == majorId)  // ���� ������ ���
						grade = gradeEvaluation[Define.SAB_TYPE].getGrade(score.getPoint());  //���� ���� ���� �� ���
					else
						grade = gradeEvaluation[Define.AB_TYPE].getGrade(score.getPoint()); // ���� ������ �ƴ� ���
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
