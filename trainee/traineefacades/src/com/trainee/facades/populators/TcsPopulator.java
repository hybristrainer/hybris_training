/**
 *
 */
package com.trainee.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import com.trainee.core.model.TcsModel;
import com.trainee.facades.tcs.TcsData;


/**
 * @author ICON
 *
 */
public class TcsPopulator implements Populator<TcsModel, TcsData>
{

	@Override
	public void populate(final TcsModel source, final TcsData target) throws ConversionException
	{
		// XXX Auto-generated method stub
		target.setId(source.getId());
		target.setRole(source.getRole());
		target.setSalary(source.getSalary());
		target.setExp(source.getExp());
	}

}
