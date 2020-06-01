package caf.war.Employee.taskclient;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import com.webmethods.caf.faces.annotations.DTManagedBean;
import com.webmethods.caf.faces.annotations.BeanType;

@ManagedBean(name = "EmpIdentificationRuleContext")
@SessionScoped
@DTManagedBean(displayName = "Emp Identification Rule Context", beanType = BeanType.DEFAULT)
public class EmpIdentificationRuleContext  extends  com.webmethods.caf.faces.data.task.impl.BaseTaskRuleContext {
}