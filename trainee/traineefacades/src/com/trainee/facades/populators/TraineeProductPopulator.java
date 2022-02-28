/**
 *
 */
package com.trainee.facades.populators;

import de.hybris.platform.commercefacades.product.converters.populator.ProductBasicPopulator;
import de.hybris.platform.commercefacades.product.data.ProductData;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.servicelayer.dto.converter.ConversionException;


/**
 * @author ICON
 *
 */
public class TraineeProductPopulator extends ProductBasicPopulator
{
	@Override
	public void populate(final ProductModel productModel, final ProductData productData) throws ConversionException
	{
		super.populate(productModel, productData);
		productData.setProductSize(productModel.getProductSize());
	}
}
