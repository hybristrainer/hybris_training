/**
 *
 */
package com.trainee.core.service.impl;







import java.util.List;

import com.trainee.core.dao.EmployeeDao;
import com.trainee.core.model.EmployeesModel;
import com.trainee.core.service.EmployeeService;


/**
 * @author ICON
 *
 */
public class EmployeeServiceimpl implements EmployeeService
{
	private EmployeeDao employeeDao;

	@Override
	public List<EmployeesModel> getEmployee()
	{
		// XXX Auto-generated method stub
		return employeeDao.getEmployee();
	}

	public EmployeeDao getEmployeeDao()
	{
		return employeeDao;

	}

	public void setEmployeeDao(final EmployeeDao employeeDao)
	{
		this.employeeDao = employeeDao;
	}
}
