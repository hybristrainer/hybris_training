/**
 *
 */
package com.trainee.facades.populators;

import de.hybris.platform.commercefacades.user.converters.populator.CustomerPopulator;
import de.hybris.platform.commercefacades.user.data.CustomerData;
import de.hybris.platform.core.model.user.CustomerModel;


/**
 * @author ICON
 *
 */
public class TraineeCustomerPopulator extends CustomerPopulator
{
	@Override
	public void populate(final CustomerModel source, final CustomerData target)
	{
		super.populate(source, target);
		target.setAddress(source.getAddress());
		target.setPin(source.getPin());
	}
}
