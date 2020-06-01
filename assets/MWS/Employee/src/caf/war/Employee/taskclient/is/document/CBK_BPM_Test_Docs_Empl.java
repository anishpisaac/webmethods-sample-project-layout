package caf.war.Employee.taskclient.is.document;

import java.io.Serializable;

/**
 * IS document wrapper
 */
public  class CBK_BPM_Test_Docs_Empl extends java.lang.Object implements Serializable {

	
	private static final long serialVersionUID = 1L;
	// IS Document type used to generate this class
	public static final String DOCUMENT_TYPE = "CBK_BPM_Test.Docs:Empl";
	private java.lang.String title;
	private java.lang.String name;
	public static String[][] FIELD_NAMES = new String[][] {{"title", "Title"},{"name", "Name"},{"addres", "Addres"},
	};
	private java.lang.String addres;
	

	public CBK_BPM_Test_Docs_Empl() {
	}


	public java.lang.String getTitle()  {
		
		return title;
	}


	public void setTitle(java.lang.String title)  {
		this.title = title;
	}


	public java.lang.String getName()  {
		
		return name;
	}


	public void setName(java.lang.String name)  {
		this.name = name;
	}


	public java.lang.String getAddres()  {
		
		return addres;
	}


	public void setAddres(java.lang.String addres)  {
		this.addres = addres;
	}

}