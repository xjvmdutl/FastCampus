package chapter02.ch09;

public class Student {
	int studentId;
	String studentName;
	Subject korea;//���� ����
	Subject math;
	Student(int studentId,String studentName){
		this.studentId=studentId;
		this.studentName=studentName;
		//�����ڿ��� ���������� �������ش�.(new)
		korea = new Subject();
		math = new Subject();
	}
	//���� �ڷ������� ��������� ���� ������ ��ü�� ���Ͽ� ��Ȱ�� ����� �и��ϰ� �ϴ� �κ��� �ִ�.
	public void setKoreaSubject(String name,int score) {//�������
		korea.subjectName = name;
		korea.score = score;
	}
	public void setMathSubject(String name,int score) {//���а���
		math.subjectName = name;
		math.score = score;
	}
	public void showScoreInfo() {
		int total = korea.score + math.score;
		System.out.println(studentName + "�л��� ������ "+total+"�� �Դϴ�.");
	}
}