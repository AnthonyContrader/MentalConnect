package it.contrader.model;

public class Folder {
	
	private int idFolder;
	
	private int idUser;
	
	private String nameFolder;
	
	
	
	
    public int getIdFolder() {
    
    	return idFolder;
    
    }
    
    public void setIdFolder(int idFolder) {
    	
    	this.idFolder = idFolder;
    }
   
    public int getIdUser() {
		
    	return idUser;
	}
	
    public void setIdUser(int idUser) {
		
		this.idUser = idUser;
	}
    
    public String getNameFolder() {
    	
    	return this.nameFolder ;
    }
    
    public void setNameFolder(String nameFolder) {
    	
    	this.nameFolder = nameFolder;
    }
    
public Folder() {}
	
	
	
	public Folder(String nameFolder , int idUser) {
		this.nameFolder = nameFolder;
		this.idUser = idUser;
		
	}
	
	
	public Folder(int idFolder,String nameFolder, int idUser) {
		this.nameFolder = nameFolder;
		this.idFolder = idFolder;
		this.idUser = idUser;
	}
	
	@Override
	public String toString() {
		return  idFolder + "\t"  + idUser +"\t\t" +   nameFolder;
	}

	
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Folder other = (Folder) obj;
			
			if (idFolder != other.idFolder)
				return false;
			if (idUser != other.idUser)
				return false;
			
		
			return true;
		}
		
    
	
}