/**
 *
 */
package com.trainee.core.dao.impl;



import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;

import java.util.List;

import com.trainee.core.dao.EmployeeDao;
import com.trainee.core.model.EmployeesModel;



/**
 * @author ICON
 *
 */
public class EmployeeDaoimpl extends DefaultGenericDao<EmployeesModel> implements EmployeeDao
{

	/**
	 * @param typecode
	 */
	public EmployeeDaoimpl(final String typecode)
	{
		super(typecode);
		// XXX Auto-generated constructor stub
	}

	@Override
	public List<EmployeesModel> getEmployee()
	{
		// XXX Auto-generated method stub
		return find();
	}


}
