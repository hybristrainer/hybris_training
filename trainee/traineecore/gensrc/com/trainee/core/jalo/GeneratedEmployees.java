/*
 * ----------------------------------------------------------------
 * --- WARNING: THIS FILE IS GENERATED AND WILL BE OVERWRITTEN! ---
 * --- Generated at 01-Mar-2022, 5:47:02 PM                     ---
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
 * Generated class for type {@link de.hybris.platform.jalo.GenericItem Employees}.
 */
@SuppressWarnings({"deprecation","unused","cast"})
public abstract class GeneratedEmployees extends GenericItem
{
	/** Qualifier of the <code>Employees.eid</code> attribute **/
	public static final String EID = "eid";
	/** Qualifier of the <code>Employees.ename</code> attribute **/
	public static final String ENAME = "ename";
	protected static final Map<String, AttributeMode> DEFAULT_INITIAL_ATTRIBUTES;
	static
	{
		final Map<String, AttributeMode> tmp = new HashMap<String, AttributeMode>();
		tmp.put(EID, AttributeMode.INITIAL);
		tmp.put(ENAME, AttributeMode.INITIAL);
		DEFAULT_INITIAL_ATTRIBUTES = Collections.unmodifiableMap(tmp);
	}
	@Override
	protected Map<String, AttributeMode> getDefaultAttributeModes()
	{
		return DEFAULT_INITIAL_ATTRIBUTES;
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employees.eid</code> attribute.
	 * @return the eid
	 */
	public String getEid(final SessionContext ctx)
	{
		return (String)getProperty( ctx, EID);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employees.eid</code> attribute.
	 * @return the eid
	 */
	public String getEid()
	{
		return getEid( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employees.eid</code> attribute. 
	 * @param value the eid
	 */
	public void setEid(final SessionContext ctx, final String value)
	{
		setProperty(ctx, EID,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employees.eid</code> attribute. 
	 * @param value the eid
	 */
	public void setEid(final String value)
	{
		setEid( getSession().getSessionContext(), value );
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employees.ename</code> attribute.
	 * @return the ename
	 */
	public String getEname(final SessionContext ctx)
	{
		return (String)getProperty( ctx, ENAME);
	}
	
	/**
	 * <i>Generated method</i> - Getter of the <code>Employees.ename</code> attribute.
	 * @return the ename
	 */
	public String getEname()
	{
		return getEname( getSession().getSessionContext() );
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employees.ename</code> attribute. 
	 * @param value the ename
	 */
	public void setEname(final SessionContext ctx, final String value)
	{
		setProperty(ctx, ENAME,value);
	}
	
	/**
	 * <i>Generated method</i> - Setter of the <code>Employees.ename</code> attribute. 
	 * @param value the ename
	 */
	public void setEname(final String value)
	{
		setEname( getSession().getSessionContext(), value );
	}
	
}
