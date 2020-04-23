package it.contrader.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import it.contrader.main.ConnectionSingleton;
import it.contrader.model.Map;


public class MapDAO {
	
	private final String QUERY_ALL = "SELECT * FROM map";
	private final String QUERY_CREATE = "INSERT INTO map (idCartella) VALUES (?)";
	private final String QUERY_READ = "SELECT * FROM map WHERE idMap=?";
	private final String QUERY_UPDATE = "UPDATE map SET mapName=?, WHERE id=?";
	private final String QUERY_DELETE = "DELETE FROM map WHERE idMap=?";
	
	public MapDAO() {}
	
	public List<Map> getAll() {
		List<Map> mapList = new ArrayList<>();
		Connection connection = ConnectionSingleton.getInstance();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(QUERY_ALL);
			Map map;
			while (resultSet.next()) {
				int idMap = resultSet.getInt("idMap");
				int idCartella = resultSet.getInt("idCartella");
				String mapName = resultSet.getString("mapName");
				map = new Map(idMap, idCartella, mapName);
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
			preparedStatement.setInt(1, map.getIdCartella());
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
			
			int idCartella = resultSet.getInt("idCartella");
			String mapName = resultSet.getString("mapName");
			
			Map map = new Map(mapId, idCartella, mapName);
			
			return map;
		} catch (SQLException e) {
			return null;
		}

	}
	
	
	public boolean update(Map mapToUpdate) {
		Connection connection = ConnectionSingleton.getInstance();

		// Check if id is present
		if (mapToUpdate.getIdMap() == 0)
			return false;

		Map mapRead = read(mapToUpdate.getIdMap());
		if (!mapRead.equals(mapToUpdate)) {
			try {
				// Fill the userToUpdate object
				if (mapToUpdate.getIdCartella() != 0 ) {
					mapToUpdate.setIdMap(mapRead.getIdCartella());
				}
				if (mapToUpdate.getMapName() == null || mapToUpdate.getMapName().equals("") ) {
					mapToUpdate.setMapName(mapRead.getMapName());
				}
								

				// Update the user
				PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(QUERY_UPDATE);
				preparedStatement.setString(1, mapToUpdate.getMapName());
				
				preparedStatement.setInt(2, mapToUpdate.getIdMap());
				
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
