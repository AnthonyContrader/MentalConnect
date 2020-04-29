package it.contrader.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import it.contrader.model.Folder;
import it.contrader.model.Node;
import it.contrader.utils.ConnectionSingleton;



public class FolderDAO {
	//private final String QUERY_ALL = "SELECT * FROM folder";
	private final String QUERY_CREATE = "INSERT INTO folder (idUser, nameFolder) VALUES (?,?)";
	private final String QUERY_READ = "SELECT * FROM folder WHERE idFolder=?";
	private final String QUERY_UPDATE = "UPDATE folder SET nameFolder=? WHERE idFolder=?";
	private final String QUERY_DELETE = "DELETE FROM folder WHERE idFolder=?";
	private final String QUERY_FILTER = "SELECT * FROM folder WHERE idUser=?";

	public FolderDAO() {}
	
	public List<Folder> getAll(int idUser) {
		List<Folder> folderList = new ArrayList<>();
		Connection connection = ConnectionSingleton.getInstance();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_FILTER);
			preparedStatement.setInt(1, idUser);
			ResultSet resultSet = preparedStatement.executeQuery();
			Folder folder;
			while (resultSet.next()) {
				int idFolder = resultSet.getInt("idFolder");
				int iduser = resultSet.getInt("idUser");
				String namefolder = resultSet.getString("nameFolder");
				folder = new Folder(namefolder , idUser);
	            folder.setIdFolder(idFolder);
				folderList.add(folder);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return folderList;
	}

	public boolean insert(Folder folderToInsert) {
		Connection connection = ConnectionSingleton.getInstance();
		try {	
			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_CREATE);
			System.out.println(folderToInsert.getNameFolder());
			preparedStatement.setInt(1, folderToInsert.getIdUser());
			preparedStatement.setString(2, folderToInsert.getNameFolder());
	
			preparedStatement.execute();
			return true;
		} catch (SQLException e) {
			return false;
		}

	}

	public Folder read(int folderId) {
		Connection connection = ConnectionSingleton.getInstance();
		try {


			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_READ);
			preparedStatement.setInt(1, folderId);
			ResultSet resultSet = preparedStatement.executeQuery();
			resultSet.next();
			String nameFolder;
			int idUser;

			nameFolder = resultSet.getString("nameFolder");
			idUser = resultSet.getInt("idUser");
			
			Folder folder= new Folder(nameFolder , idUser);
			folder.setIdFolder(resultSet.getInt("idFolder"));
		
			return folder;
		} catch (SQLException e) {
			return null;
		}

	}

	public boolean update(Folder folderToUpdate) {
		Connection connection = ConnectionSingleton.getInstance();
	
		
		if (folderToUpdate.getIdFolder() == 0)
			return false;
		
		Folder folderRead = read(folderToUpdate.getIdFolder());
		
		if (!folderRead.equals(folderToUpdate)) {
		
			try {
			
				if (folderToUpdate.getNameFolder() == null || folderToUpdate.getNameFolder().equals("")) {
					folderToUpdate.setNameFolder(folderRead.getNameFolder());
				}
			
				PreparedStatement preparedStatement = (PreparedStatement) connection.prepareStatement(QUERY_UPDATE);
				preparedStatement.setString(1, folderToUpdate.getNameFolder());
				preparedStatement.setInt(2, folderToUpdate.getIdFolder());
				
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

	public boolean delete(int idFolder) {
		Connection connection = ConnectionSingleton.getInstance();
		try {
			PreparedStatement preparedStatement = connection.prepareStatement(QUERY_DELETE);
			preparedStatement.setInt(1, idFolder);
			int n = preparedStatement.executeUpdate();
			if (n != 0)
				return true;

		} catch (SQLException e) {
		}
		return false;
	}

 }
