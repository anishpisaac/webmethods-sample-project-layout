/**
 * 
 */
package caf.war.Employee;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ApplicationScoped;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

/**
 * @author anish
 *
 */
@ManagedBean(name = "Employee")
@ApplicationScoped
@DTManagedBean(displayName = "Employee", beanType = BeanType.APPLICATION)
public class Employee extends com.webmethods.caf.faces.bean.BaseApplicationBean 
{
	public Employee()
	{
		super();
		setCategoryName( "CafApplication" );
		setSubCategoryName( "Employee" );
	}
}