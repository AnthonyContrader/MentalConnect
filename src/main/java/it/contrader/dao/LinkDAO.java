package it.contrader.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import it.contrader.main.ConnectionSingleton;
import it.contrader.model.Link;

public class LinkDAO {

	private final String QUERY_ALL = "SELECT * FROM link";
	private final String QUERY_CREATE = "INSERT INTO link (idNode1, idNode2) VALUES (?,?)";
	private final String QUERY_READ = "SELECT * FROM link WHERE idNode1=? AND idNode2=?";
	//private final String QUERY_UPDATE = "UPDATE link SET idNode1=?, idNode2=? WHERE id=?";
	private final String QUERY_DELETE = "DELETE FROM link WHERE idNode1=? AND idNode2=?";
	
	public LinkDAO() { }

	public List<Link> getAll() {
		List<Link> linkList = new ArrayList<>();
		Connection connection = ConnectionSingleton.getInstance();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(QUERY_ALL);
			Link link;
			while (resultSet.next()) {
				int idNode1 = resultSet.getInt("idNode1");
				int idNode2 = resultSet.getInt("idNode2");
				link = new Link(idNode1, idNode2);
				//link.setId(id);
				linkList.add(link);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return linkList;
	}
	
	public boolean insert(Link linkToInsert) {
		Connection connection = ConnectionSingleton.getInstance();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_CREATE);
			preparedStatement.setInt(1, linkToInsert.getIdNode1());
			preparedStatement.setInt(2, linkToInsert.getIdNode2());
			preparedStatement.execute();
			return true;
		} catch (SQLException e) {
			return false;
		}
	}
	
	public Link read(int idNode1, int idNode2) {
		Connection connection = ConnectionSingleton.getInstance();
		try {

			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_READ);
			preparedStatement.setInt(1, idNode1);
			preparedStatement.setInt(2, idNode2);
			ResultSet resultSet = preparedStatement.executeQuery();
			resultSet.next();

			Link link = new Link(resultSet.getInt("idNode1"), resultSet.getInt("idNode2"));

			return link;
		} catch (SQLException e) {
			return null;
		}
	}
	
	public boolean delete(int idNode1, int idNode2) {
		Connection connection = ConnectionSingleton.getInstance();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_DELETE);
			preparedStatement.setInt(1, idNode1);
			preparedStatement.setInt(2, idNode2);
			int n = preparedStatement.executeUpdate();
			if (n != 0)
				return true;

		} catch (SQLException e) {
		}
		return false;
	}
}
