package chapter07.grade;

public class PassFailEvaluation implements GradeEvaluation {

	@Override
	public String getGrade(int point) {
		//interface������ �����߱� ������ if/else���� report�ʿ� ���� �پ���
		if(point >= 70)
			return "p";
		else 
			return "F";
	}

}
