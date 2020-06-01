package caf.war.Employee.taskclient;


import com.webmethods.caf.faces.data.task.ITaskData;
import com.webmethods.caf.faces.data.ContentProviderException;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * Task Client bean for 'Emp Identification' task.
 */
@ManagedBean(name = "EmpIdentification")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(beanType = BeanType.DEFAULT)
public class EmpIdentification extends com.webmethods.caf.faces.data.task.impl.TaskContentProviderExtended {

	private static final long serialVersionUID = 6738460774040588288L;
	
	/**
	 * Globally unique task type id
	 */
	private static final String TASK_TYPE_ID = "D5A6DD82-E600-BAFA-463E-2508EF386C23";

	/**
	 * Default constructor
	 */
	public EmpIdentification() {
		super();
		setTaskTypeID(TASK_TYPE_ID);
	}
	
	/**
	 * Task Data Object
	 */
	public static class TaskData extends com.webmethods.caf.faces.data.task.impl.TaskData {

		private static final long serialVersionUID = 7039614689361438720L;
		
		public static String[][] FIELD_NAMES = new String[][] {{"empl", "Empl"},
		};

		private caf.war.Employee.taskclient.is.document.CBK_BPM_Test_Docs_Empl empl = null;

		public static final String[] INPUTS = new String[] {"empl", };

		public static final String[] OUTPUTS = new String[] {"empl", };

		public TaskData() {
		}

		public caf.war.Employee.taskclient.is.document.CBK_BPM_Test_Docs_Empl getEmpl()  {
			if (empl == null) {
				empl = new caf.war.Employee.taskclient.is.document.CBK_BPM_Test_Docs_Empl();
			}
			return empl;
		}

		public void setEmpl(caf.war.Employee.taskclient.is.document.CBK_BPM_Test_Docs_Empl empl)  {
			this.empl = empl;
		}
		
	}
	
	/**
	 * Return current task data object
	 * @return current task data
	 */
	public TaskData getTaskData() {
		return (TaskData)getValue(PROPERTY_KEY_TASKDATA);
	}

	/**
	 * Creates new task data object
	 * @return newly created task data object
	 */	
	protected ITaskData newTaskData() throws ContentProviderException {
		return new TaskData();
	}

}