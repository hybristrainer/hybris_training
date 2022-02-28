/**
 *
 */
package com.trainee.employee.facades.impl;


import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

import com.trainee.core.model.EmployeesModel;
import com.trainee.core.service.EmployeeService;
import com.trainee.employee.facades.EmployeeFacade;
import com.trainee.facades.employee.EmployeeData;


/**
 * @author ICON
 *
 */
public class EmployeeFacadeimpl implements EmployeeFacade
{
	private EmployeeService employeeService;

	private Converter<EmployeesModel, EmployeeData> employeeConverter;

	@Override
	public List<EmployeeData> getEmployee()
	{
		// XXX Auto-generated method stub
		final List<EmployeesModel> employee = employeeService.getEmployee();
		return employeeConverter.convertAll(employee);
	}

	/**
	 * @return the employeeService
	 */
	public EmployeeService getEmployeeService()
	{
		return employeeService;
	}

	/**
	 * @param employeeService
	 *           the employeeService to set
	 */
	public void setEmployeeService(final EmployeeService employeeService)
	{
		this.employeeService = employeeService;
	}

	/**
	 * @return the employeeConverter
	 */
	public Converter<EmployeesModel, EmployeeData> getEmployeeConverter()
	{
		return employeeConverter;
	}

	/**
	 * @param employeeConverter
	 *           the employeeConverter to set
	 */
	public void setEmployeeConverter(final Converter<EmployeesModel, EmployeeData> employeeConverter)
	{
		this.employeeConverter = employeeConverter;
	}




}
