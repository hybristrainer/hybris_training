/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 25-Feb-2022, 5:50:54 PM                     ---
 * ----------------------------------------------------------------
 */
package com.trainee.core.jalo;

import com.trainee.core.constants.TraineeCoreConstants;
import com.trainee.core.jalo.Accenture;
import com.trainee.core.jalo.ApparelProduct;
import com.trainee.core.jalo.ApparelSizeVariantProduct;
import com.trainee.core.jalo.ApparelStyleVariantProduct;
import com.trainee.core.jalo.ElectronicsColorVariantProduct;
import com.trainee.core.jalo.Employees;
import com.trainee.core.jalo.Tata;
import com.trainee.core.jalo.Tcs;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.JaloBusinessException;
import de.hybris.platform.jalo.JaloSystemException;
import de.hybris.platform.jalo.SessionContext;
import de.hybris.platform.jalo.extension.Extension;
import de.hybris.platform.jalo.product.Product;
import de.hybris.platform.jalo.type.ComposedType;
import de.hybris.platform.jalo.type.JaloGenericCreationException;
import de.hybris.platform.jalo.user.Customer;
import de.hybris.platform.jalo.user.User;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type <code>TraineeCoreManager</code>.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedTraineeCoreManager extends Extension
{
	protected static final Map<String, Map<String, AttributeMode>> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, Map<String, AttributeMode>> ttmp = new HashMap();
		Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put("productSize", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.product.Product", Collections.unmodifiableMap(tmp));
		tmp = new HashMap<String, AttributeMode>();
		tmp.put("address", AttributeMode.INITIAL);
		tmp.put("pin", AttributeMode.INITIAL);
		ttmp.put("de.hybris.platform.jalo.user.Customer", Collections.unmodifiableMap(tmp));
		DEFAULT_INITIAL_ATTRIBUTES = ttmp;
	}
	@Override
	public Map<String, AttributeMode> getDefaultAttributeModes(final Class<? extends Item> itemClass)
	{
		Map<String, AttributeMode> ret = new HashMap<>();
		final Map<String, AttributeMode> attr = DEFAULT_INITIAL_ATTRIBUTES.get(itemClass.getName());
		if (attr != null)
		{
			ret.putAll(attr);
		}
		return ret;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.address</code> attribute.
	 * @return the address
	 */
	public String getAddress(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, TraineeCoreConstants.Attributes.Customer.ADDRESS);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.address</code> attribute.
	 * @return the address
	 */
	public String getAddress(final Customer item)
	{
		return getAddress( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.address</code> attribute. 
	 * @param value the address
	 */
	public void setAddress(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, TraineeCoreConstants.Attributes.Customer.ADDRESS,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.address</code> attribute. 
	 * @param value the address
	 */
	public void setAddress(final Customer item, final String value)
	{
		setAddress( getSession().getSessionContext(), item, value );
	}
	
	public Accenture createAccenture(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TraineeCoreConstants.TC.ACCENTURE );
			return (Accenture)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Accenture : "+e.getMessage(), 0 );
		}
	}
	
	public Accenture createAccenture(final Map attributeValues)
	{
		return createAccenture( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelProduct createApparelProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TraineeCoreConstants.TC.APPARELPRODUCT );
			return (ApparelProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelProduct createApparelProduct(final Map attributeValues)
	{
		return createApparelProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TraineeCoreConstants.TC.APPARELSIZEVARIANTPRODUCT );
			return (ApparelSizeVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelSizeVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelSizeVariantProduct createApparelSizeVariantProduct(final Map attributeValues)
	{
		return createApparelSizeVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TraineeCoreConstants.TC.APPARELSTYLEVARIANTPRODUCT );
			return (ApparelStyleVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ApparelStyleVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ApparelStyleVariantProduct createApparelStyleVariantProduct(final Map attributeValues)
	{
		return createApparelStyleVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TraineeCoreConstants.TC.ELECTRONICSCOLORVARIANTPRODUCT );
			return (ElectronicsColorVariantProduct)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating ElectronicsColorVariantProduct : "+e.getMessage(), 0 );
		}
	}
	
	public ElectronicsColorVariantProduct createElectronicsColorVariantProduct(final Map attributeValues)
	{
		return createElectronicsColorVariantProduct( getSession().getSessionContext(), attributeValues );
	}
	
	public Employees createEmployees(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TraineeCoreConstants.TC.EMPLOYEES );
			return (Employees)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Employees : "+e.getMessage(), 0 );
		}
	}
	
	public Employees createEmployees(final Map attributeValues)
	{
		return createEmployees( getSession().getSessionContext(), attributeValues );
	}
	
	public Tata createTata(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TraineeCoreConstants.TC.TATA );
			return (Tata)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Tata : "+e.getMessage(), 0 );
		}
	}
	
	public Tata createTata(final Map attributeValues)
	{
		return createTata( getSession().getSessionContext(), attributeValues );
	}
	
	public Tcs createTcs(final SessionContext ctx, final Map attributeValues)
	{
		try
		{
			ComposedType type = getTenant().getJaloConnection().getTypeManager().getComposedType( TraineeCoreConstants.TC.TCS );
			return (Tcs)type.newInstance( ctx, attributeValues );
		}
		catch( JaloGenericCreationException e)
		{
			final Throwable cause = e.getCause();
			throw (cause instanceof RuntimeException ?
			(RuntimeException)cause
			:
			new JaloSystemException( cause, cause.getMessage(), e.getErrorCode() ) );
		}
		catch( JaloBusinessException e )
		{
			throw new JaloSystemException( e ,"error creating Tcs : "+e.getMessage(), 0 );
		}
	}
	
	public Tcs createTcs(final Map attributeValues)
	{
		return createTcs( getSession().getSessionContext(), attributeValues );
	}
	
	@Override
	public String getName()
	{
		return TraineeCoreConstants.EXTENSIONNAME;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.pin</code> attribute.
	 * @return the pin
	 */
	public String getPin(final SessionContext ctx, final Customer item)
	{
		return (String)item.getProperty( ctx, TraineeCoreConstants.Attributes.Customer.PIN);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Customer.pin</code> attribute.
	 * @return the pin
	 */
	public String getPin(final Customer item)
	{
		return getPin( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.pin</code> attribute. 
	 * @param value the pin
	 */
	public void setPin(final SessionContext ctx, final Customer item, final String value)
	{
		item.setProperty(ctx, TraineeCoreConstants.Attributes.Customer.PIN,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Customer.pin</code> attribute. 
	 * @param value the pin
	 */
	public void setPin(final Customer item, final String value)
	{
		setPin( getSession().getSessionContext(), item, value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productSize</code> attribute.
	 * @return the productSize
	 */
	public String getProductSize(final SessionContext ctx, final Product item)
	{
		return (String)item.getProperty( ctx, TraineeCoreConstants.Attributes.Product.PRODUCTSIZE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Product.productSize</code> attribute.
	 * @return the productSize
	 */
	public String getProductSize(final Product item)
	{
		return getProductSize( getSession().getSessionContext(), item );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productSize</code> attribute. 
	 * @param value the productSize
	 */
	public void setProductSize(final SessionContext ctx, final Product item, final String value)
	{
		item.setProperty(ctx, TraineeCoreConstants.Attributes.Product.PRODUCTSIZE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Product.productSize</code> attribute. 
	 * @param value the productSize
	 */
	public void setProductSize(final Product item, final String value)
	{
		setProductSize( getSession().getSessionContext(), item, value );
	}
	
}
