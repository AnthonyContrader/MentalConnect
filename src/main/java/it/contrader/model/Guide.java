package it.contrader.model;

public class Guide {

	private int idGuide;
	private String question;
	private String answer;
	
	// costruttori
	
	public Guide() {
		
	}

	public Guide (String question, String answer ) {
		this.question = question;
		this.answer = answer;
	}

	public Guide (int idGuide, String question, String answer) {
		this.idGuide = idGuide;
		this.question = question;
		this.answer = answer;
	}

	
	//Trasforma un oggetto in una stringa
	@Override
	public String toString() {
		return  idGuide + "\t"  + question +"\t\t" +   answer;
	}
	
	// getter e setter

	public int getIdGuide() {
		return idGuide;
	}

	public void setIdGuide(int idGuide) {
		this.idGuide = idGuide;
	}

	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	//Metodo per il confronto degli oggetti
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Guide other = (Guide) obj;
		if (idGuide != other.idGuide)
			return false;
		if (question == null) {
			if (other.question != null)
				return false;
		} else if (!question.equals(other.question))
			return false;
		if (answer == null) {
			if (other.answer != null)
				return false;
		} else if (!answer.equals(other.answer))
			return false;
			return true;
	}
}




