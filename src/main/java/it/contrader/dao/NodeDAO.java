package it.contrader.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import it.contrader.main.ConnectionSingleton;
import it.contrader.model.User;
import java.sql.*;
import it.contrader.model.Node;

public class NodeDAO {
	private final String QUERY_ALL = "SELECT * FROM node";
	private final String QUERY_CREATE = "INSERT INTO node (idNode, text, color, idMap) VALUES (?,?,?,?)";
	private final String QUERY_READ = "SELECT * FROM node WHERE idNode=?";
	private final String QUERY_UPDATE = "UPDATE node SET text=?, color=?, idMap=? WHERE idNode=?";
	private final String QUERY_DELETE = "DELETE FROM node WHERE idNode=?";

	public NodeDAO() {}
	
	public List<Node> getAll() {
		List<Node> nodeList = new ArrayList<>();
		Connection connection = ConnectionSingleton.getInstance();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(QUERY_ALL);
			Node node;
			while (resultSet.next()) {
				int id = resultSet.getInt("idNode");
				String text = resultSet.getString("text");
				String color = resultSet.getString("color");
				node = new Node(text, color, id);
				node.setIdNode(id);
				nodeList.add(node);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return nodeList;
	}

	public boolean insert(Node nodeToInsert) {
		Connection connection = ConnectionSingleton.getInstance();
		try {	
			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_CREATE);
			preparedStatement.setString(1, nodeToInsert.getText());
			preparedStatement.setString(2, nodeToInsert.getColor());
			preparedStatement.setInt(3, nodeToInsert.getIdMap());
			preparedStatement.execute();
			return true;
		} catch (SQLException e) {
			return false;
		}

	}

	public Node read(int nodeId) {
		Connection connection = ConnectionSingleton.getInstance();
		try {


			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_READ);
			preparedStatement.setInt(1, nodeId);
			ResultSet resultSet = preparedStatement.executeQuery();
			resultSet.next();
			String text, color;
			int idMap;

			text = resultSet.getString("text");
			color = resultSet.getString("color");
			idMap = resultSet.getInt("idMap");
			Node node= new Node(text, color, idMap);
			node.setIdNode(resultSet.getInt("idNode"));

			return node;
		} catch (SQLException e) {
			return null;
		}

	}

	public boolean update(Node nodeToUpdate) {
		Connection connection = ConnectionSingleton.getInstance();

		// Check if id is present
		if (nodeToUpdate.getIdNode() == 0)
			return false;

		Node nodeRead = read(nodeToUpdate.getIdNode());
		if (!nodeRead.equals(nodeToUpdate)) {
			try {
				// Fill the nodeToUpdate object
				if (nodeToUpdate.getText() == null || nodeToUpdate.getText().equals("")) {
					nodeToUpdate.setText(nodeRead.getText());
				}

				if (nodeToUpdate.getColor() == null || nodeToUpdate.getColor().equals("")) {
					nodeToUpdate.setColor(nodeRead.getColor());
				}

				// Update the user
				PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(QUERY_UPDATE);
				preparedStatement.setString(1, nodeToUpdate.getText());
				preparedStatement.setString(2, nodeToUpdate.getColor());
				preparedStatement.setInt(3, nodeToUpdate.getIdNode());
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

	public boolean delete(int id) {
		Connection connection = ConnectionSingleton.getInstance();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_DELETE);
			preparedStatement.setInt(1, id);
			int n = preparedStatement.executeUpdate();
			if (n != 0)
				return true;

		} catch (SQLException e) {
		}
		return false;
	}
}
