/**
 *
 */
package com.trainee.facades.populators;

import de.hybris.platform.converters.Populator;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;

import com.trainee.core.model.AccentureModel;
import com.trainee.facades.accenture.AccentureData;


/**
 * @author ICON
 *
 */
public class AccenturePopulator implements Populator<AccentureModel, AccentureData>
{

	@Override
	public void populate(final AccentureModel source, final AccentureData target) throws ConversionException
	{

		target.setId(source.getId());
		target.setDomain(source.getDomain());
		target.setSalary(source.getSalary());

	}

}
