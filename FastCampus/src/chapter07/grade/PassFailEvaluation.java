package chapter07.grade;

public class PassFailEvaluation implements GradeEvaluation {

	@Override
	public String getGrade(int point) {
		//interface형으로 구현했기 때문에 if/else문이 report쪽에 많이 줄엇다
		if(point >= 70)
			return "p";
		else 
			return "F";
	}

}
