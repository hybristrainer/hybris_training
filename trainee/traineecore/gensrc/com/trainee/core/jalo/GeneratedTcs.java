/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 02-Mar-2022, 10:47:59 AM                    ---
 * ----------------------------------------------------------------
 */
package com.trainee.core.jalo;

import com.trainee.core.constants.TraineeCoreConstants;
import de.hybris.platform.jalo.GenericItem;
import de.hybris.platform.jalo.Item.AttributeMode;
import de.hybris.platform.jalo.SessionContext;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Tcs}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedTcs extends GenericItem
{
	/** Qualifier of the <code>Tcs.id</code> attribute **/
	public static final String ID = "id";
	/** Qualifier of the <code>Tcs.role</code> attribute **/
	public static final String ROLE = "role";
	/** Qualifier of the <code>Tcs.salary</code> attribute **/
	public static final String SALARY = "salary";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(ID, AttributeMode.INITIAL);
		tmp.put(ROLE, AttributeMode.INITIAL);
		tmp.put(SALARY, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Tcs.id</code> attribute.
	 * @return the id
	 */
	public String getId(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Tcs.id</code> attribute.
	 * @return the id
	 */
	public String getId()
	{
		return getId( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Tcs.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Tcs.id</code> attribute. 
	 * @param value the id
	 */
	public void setId(final String value)
	{
		setId( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Tcs.role</code> attribute.
	 * @return the role
	 */
	public String getRole(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ROLE);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Tcs.role</code> attribute.
	 * @return the role
	 */
	public String getRole()
	{
		return getRole( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Tcs.role</code> attribute. 
	 * @param value the role
	 */
	public void setRole(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ROLE,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Tcs.role</code> attribute. 
	 * @param value the role
	 */
	public void setRole(final String value)
	{
		setRole( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Tcs.salary</code> attribute.
	 * @return the salary
	 */
	public String getSalary(final SessionContext ctx)
	{
		return (String)getProperty( ctx, SALARY);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Tcs.salary</code> attribute.
	 * @return the salary
	 */
	public String getSalary()
	{
		return getSalary( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Tcs.salary</code> attribute. 
	 * @param value the salary
	 */
	public void setSalary(final SessionContext ctx, final String value)
	{
		setProperty(ctx, SALARY,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Tcs.salary</code> attribute. 
	 * @param value the salary
	 */
	public void setSalary(final String value)
	{
		setSalary( getSession().getSessionContext(), value );
	}
	
}
