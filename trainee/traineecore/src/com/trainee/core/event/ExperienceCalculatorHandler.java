/**
 *
 */
package com.trainee.core.event;

import de.hybris.platform.servicelayer.model.attribute.DynamicAttributeHandler;

import com.trainee.core.model.TcsModel;


/**
 * @author ICON
 *
 */
public class ExperienceCalculatorHandler implements DynamicAttributeHandler<String, TcsModel>
{

	@Override
	public String get(final TcsModel tcs)
	{

		final int salary = Integer.valueOf(tcs.getSalary());
		int exp = 0;
		if (salary > 15000)
		{
			exp = 2;
		}
		else
		{
			exp = 1;
		}
		return Integer.toString(exp);
	}

	@Override
	public void set(final TcsModel arg0, final String arg1)
	{
		// XXX Auto-generated method stub

	}

}
