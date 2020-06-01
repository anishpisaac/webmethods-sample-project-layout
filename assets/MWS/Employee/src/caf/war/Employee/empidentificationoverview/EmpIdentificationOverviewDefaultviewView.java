/**
 * 
 */
package caf.war.Employee.empidentificationoverview;

/**
 * @author anish
 *
 */

import com.webmethods.caf.faces.data.task.TaskDisplayProvider;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.ExpireWithPageFlow;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

@ManagedBean(name = "EmpIdentificationOverviewDefaultviewView")
@SessionScoped
@ExpireWithPageFlow
@DTManagedBean(displayName = "EmpIdentificationOverview/default", beanType = BeanType.PAGE)
public class EmpIdentificationOverviewDefaultviewView extends com.webmethods.caf.faces.bean.BasePageBean {


	private static final long serialVersionUID = 1L;
	private static final String[][] INITIALIZE_PROPERTY_BINDINGS = new String[][] {
		{"#{activePreferencesBean.currentTab}", "TaskData"},
	};

	// binding the Task Display Provider to the current taskID (passed to the Portlet Bean via the URL)
	private TaskDisplayProvider taskDisplayProvider = null;
	private static final String[][] TASKDISPLAYPROVIDER_PROPERTY_BINDINGS = new String[][] { {
			"#{TaskDisplayProvider.taskID}", "#{EmpIdentificationOverview.taskID}" }, };
	private transient caf.war.Employee.empidentificationoverview.EmpIdentificationOverview empIdentificationOverview = null;
	private caf.war.Employee.taskclient.EmpIdentification empIdentification = null;
	private static final String[][] EMPIDENTIFICATION_PROPERTY_BINDINGS = new String[][] {
		{"#{EmpIdentification.taskID}", "#{EmpIdentificationOverview.taskID}"},
	};

	/**
	 * Initialize page
	 */
	public String initialize() {
		try {
		    resolveDataBinding(INITIALIZE_PROPERTY_BINDINGS, null, "initialize", true, false);
		} catch (Exception e) {
			error(e);
			log(e);
		}
		return null;	
	}

	/*
	 * Get the Task Display Provider for the current taskID
	 */
	public TaskDisplayProvider getTaskDisplayProvider() {
		if (taskDisplayProvider == null) {
			taskDisplayProvider = (TaskDisplayProvider) resolveExpression("#{TaskDisplayProvider}");
		}
		resolveDataBinding(TASKDISPLAYPROVIDER_PROPERTY_BINDINGS,
				taskDisplayProvider, "taskDisplayProvider", false, false);
		return taskDisplayProvider;
	}

	public caf.war.Employee.empidentificationoverview.EmpIdentificationOverview getEmpIdentificationOverview()  {
		if (empIdentificationOverview == null) {
		    empIdentificationOverview = (caf.war.Employee.empidentificationoverview.EmpIdentificationOverview)resolveExpression("#{EmpIdentificationOverview}");
		}
		return empIdentificationOverview;
	}

	public caf.war.Employee.taskclient.EmpIdentification getEmpIdentification()  {
		if (empIdentification == null) {
		    empIdentification = (caf.war.Employee.taskclient.EmpIdentification)resolveExpression("#{EmpIdentification}");
		}
	
	    resolveDataBinding(EMPIDENTIFICATION_PROPERTY_BINDINGS, empIdentification, "empIdentification", false, false);
		return empIdentification;
	}

}