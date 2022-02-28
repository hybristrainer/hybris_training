/**
 *
 */
package com.training.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import de.hybris.platform.commercefacades.order.data.CartData;


/**
 * @author Yuktha Sree
 *
 */
public class PlaceOrderWithoutPayment implements Validator
{

	@Override
	public boolean supports(final Class<?> clazz)
	{
		return CartData.class.equals(clazz);
	}

	@Override
	public void validate(final Object target, final Errors errors)
	{
		final CartData cart = (CartData) target;

		if (!cart.isCalculated())
		{
			errors.reject("cart.notCalculated");
		}

		if (cart.getDeliveryMode() == null)
		{
			errors.reject("cart.deliveryModeNotSet");
		}

		//		if (!(cart.getPaymentInfo() == null))
		//		{
		//			errors.reject("cart.paymentInfoNotSet");
		//		}
	}

}
