package it.contrader.dto;

public class FolderDTO {
	
	private int idFolder;
    
	private int idUser;
	
	private String nameFolder;
	
	
	 public FolderDTO() {}
	 
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
	    
	
		
		
		
		public FolderDTO(String nameFolder , int idUser) {
			this.nameFolder = nameFolder;
			this.idUser = idUser;
			
		}
		
		
		public FolderDTO(int idFolder,String nameFolder, int idUser) {
			this.nameFolder = nameFolder;
			this.idFolder = idFolder;
			this.idUser = idUser;
		}
		
		@Override
		public String toString() {
			return  idFolder + "\t\t"  + idUser +"\t" +   nameFolder;
		}
}
	
	
