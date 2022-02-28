/**
 *
 */
package com.trainee.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;

import java.util.List;

import com.trainee.core.dao.AccentureDao;
import com.trainee.core.model.AccentureModel;


/**
 * @author ICON
 *
 */
public class AccentureDaoimpl extends DefaultGenericDao<AccentureModel> implements AccentureDao
{

	/**
	 * @param typecode
	 */
	public AccentureDaoimpl(final String typecode)
	{
		super(typecode);
		// XXX Auto-generated constructor stub
	}

	public List<AccentureModel> getAccenture()
	{
		return find();


	}
}
