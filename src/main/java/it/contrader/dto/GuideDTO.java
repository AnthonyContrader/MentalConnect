package it.contrader.dto;


public class GuideDTO {
	
	private int idGuide;
	private String question;
	private String answer;
	
		// costruttori
		
		public GuideDTO() {
			
		}

		public GuideDTO (String question, String answer ) {
			this.question = question;
			this.answer = answer;
		}

		public GuideDTO (int idGuide, String question, String answer) {
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
	}