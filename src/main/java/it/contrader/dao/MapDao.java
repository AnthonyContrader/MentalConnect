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
import it.contrader.model.Map;

public class MapDao {
	
	private final String QUERY_ALL = "SELECT * FROM map";
	private final String QUERY_CREATE = "INSERT INTO map (idUser) VALUES (?)";
	private final String QUERY_READ = "SELECT * FROM map WHERE idMap=?";
	//private final String QUERY_UPDATE = "UPDATE map SET username=?, password=?, usertype=? WHERE id=?";
	private final String QUERY_DELETE = "DELETE FROM map WHERE idMap=?";
	
	public MapDao() {}
	
	public List<Map> getAll() {
		List<Map> mapList = new ArrayList<>();
		Connection connection = ConnectionSingleton.getInstance();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(QUERY_ALL);
			Map map;
			while (resultSet.next()) {
				int idMap = resultSet.getInt("idMap");
				int idUser = resultSet.getInt("idUser");
				map = new Map(idMap, idUser);
				//map.setIdMap(idMap);
				mapList.add(map);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return mapList;
	}
	
	public boolean insert(Map map) {
		Connection connection = ConnectionSingleton.getInstance();
		try {	
			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_CREATE);
			preparedStatement.setInt(1, map.getIdUser());
			preparedStatement.execute();
			return true;
		} catch (SQLException e) {
			return false;
		}

	}
	
	public Map read(int mapId) {
		Connection connection = ConnectionSingleton.getInstance();
		try {


			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_READ);
			preparedStatement.setInt(1, mapId);
			ResultSet resultSet = preparedStatement.executeQuery();
			resultSet.next();
			
			int idUser = resultSet.getInt("idUser");
			Map map = new Map(mapId, idUser);
			
			return map;
		} catch (SQLException e) {
			return null;
		}

	}
	
	/*   TODO: UPDATE MAP
	 * 
	 * public boolean update(User userToUpdate) {
		Connection connection = ConnectionSingleton.getInstance();

		// Check if id is present
		if (userToUpdate.getId() == 0)
			return false;

		User userRead = read(userToUpdate.getId());
		if (!userRead.equals(userToUpdate)) {
			try {
				// Fill the userToUpdate object
				if (userToUpdate.getUsername() == null || userToUpdate.getUsername().equals("")) {
					userToUpdate.setUsername(userRead.getUsername());
				}

				if (userToUpdate.getPassword() == null || userToUpdate.getPassword().equals("")) {
					userToUpdate.setPassword(userRead.getPassword());
				}

				if (userToUpdate.getUsertype() == null || userToUpdate.getUsertype().equals("")) {
					userToUpdate.setUsertype(userRead.getUsertype());
				}

				// Update the user
				PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(QUERY_UPDATE);
				preparedStatement.setString(1, userToUpdate.getUsername());
				preparedStatement.setString(2, userToUpdate.getPassword());
				preparedStatement.setString(3, userToUpdate.getUsertype());
				preparedStatement.setInt(4, userToUpdate.getId());
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
	 * */
	
	public boolean delete(int idMap) {
		Connection connection = ConnectionSingleton.getInstance();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_DELETE);
			preparedStatement.setInt(1, idMap);
			int n = preparedStatement.executeUpdate();
			if (n != 0)
				return true;

		} catch (SQLException e) {
		}
		return false;
	}

}
