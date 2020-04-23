package it.contrader.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import it.contrader.main.ConnectionSingleton;
import it.contrader.model.Guide;

public class GuideDAO
{
	private final String QUERY_ALL = "SELECT * FROM guide";
	private final String QUERY_CREATE = "INSERT INTO guide (idGuide, answer, question) VALUES (?,?,?)";
	private final String QUERY_READ = "SELECT * FROM guide WHERE idGuide=?";
	private final String QUERY_UPDATE = "UPDATE user SET idGuide=?, answer=?, question=? WHERE idGuide=?";
	private final String QUERY_DELETE = "DELETE FROM guide WHERE idGuide=?";

	public GuideDAO() {

	}

	public List<Guide> getAll() {
		List<Guide> guideList = new ArrayList<>();
		Connection connection = ConnectionSingleton.getInstance();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(QUERY_ALL);
			Guide guide;
			while (resultSet.next()) {
				int idGuide = resultSet.getInt("idGuide");
				String question = resultSet.getString("question");
				String answer = resultSet.getString("answer");
				guide = new Guide (idGuide, question, answer);
				guideList.add(guide);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return guideList;
	}

	public boolean insert(Guide guideToInsert) {
		Connection connection = ConnectionSingleton.getInstance();
		try {	
			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_CREATE);
			preparedStatement.setInt(1, guideToInsert.getIdGuide());
			preparedStatement.setString(2, guideToInsert.getQuestion());
			preparedStatement.setString(3, guideToInsert.getAnswer());
			preparedStatement.execute();
			return true;
		} catch (SQLException e) {
			return false;
		}

	}

	public Guide read(int idGuide) {
		Connection connection = ConnectionSingleton.getInstance();
		try {


			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_READ);
			preparedStatement.setInt(1, idGuide);
			ResultSet resultSet = preparedStatement.executeQuery();
			resultSet.next();
			String question,answer;

			question = resultSet.getString("question");
			answer = resultSet.getString("answer");
			Guide guide = new Guide (question, answer);
			guide.setIdGuide(resultSet.getInt("idGuide"));

			return guide;
		} catch (SQLException e) {
			return null;
		}

	}

	public boolean update(Guide guideToUpdate) {
		Connection connection = ConnectionSingleton.getInstance();

		// Check if id is present
		if (guideToUpdate.getIdGuide() == 0)
			return false;

		Guide guideRead = read(guideToUpdate.getIdGuide());
		if (!guideRead.equals(guideToUpdate)) {
			try {
				// Fill the guideToUpdate object
				if (guideToUpdate.getQuestion() == null || guideToUpdate.getQuestion().equals("")) {
					guideToUpdate.setQuestion(guideRead.getQuestion());
				}

				if (guideToUpdate.getAnswer() == null || guideToUpdate.getAnswer().equals("")) {
					guideToUpdate.setAnswer(guideRead.getAnswer());
				}

				// Update the guide
				PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(QUERY_UPDATE);
				preparedStatement.setString(1, guideToUpdate.getQuestion());
				preparedStatement.setString(2, guideToUpdate.getAnswer());
				preparedStatement.setInt(3, guideToUpdate.getIdGuide());
				int a = preparedStatement.executeUpdate();
				if (a > 0)
					return true;
				else
					return false;

			} catch (SQLException e) {
				return false;
			}
		}

		return false;

	}

	public boolean delete(int idGuide) {
		Connection connection = ConnectionSingleton.getInstance();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_DELETE);
			preparedStatement.setInt(1, idGuide);
			int n = preparedStatement.executeUpdate();
			if (n != 0)
				return true;

		} catch (SQLException e) {
		}
		return false;
	}


}
