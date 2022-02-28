 /**
 *
 */



/*
/**
 *
 */
package com.trainee.facades.populators;


import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import com.trainee.core.model.EmployeesModel;
import com.trainee.facades.employee.EmployeeData;




/**
 * @author ICON
 *
 */
public class EmployeePopulator implements Populator<EmployeesModel, EmployeeData > 
{

	@Override
	public void populate(final EmployeesModel source, final EmployeeData target) throws ConversionException
	{
		// XXX Auto-generated method stub
		target.setEid(source.getEid());
		target.setEname(source.getEname());
		
	}

	

}
