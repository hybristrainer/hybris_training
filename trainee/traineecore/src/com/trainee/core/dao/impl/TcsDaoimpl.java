/**
 *
 */
package com.trainee.core.dao.impl;

import de.hybris.platform.servicelayer.internal.dao.DefaultGenericDao;

import java.util.List;

import com.trainee.core.dao.TcsDao;
import com.trainee.core.model.TcsModel;


/**
 * @author ICON
 *
 */
public class TcsDaoimpl extends DefaultGenericDao<TcsModel> implements TcsDao
{

	/**
	 * @param typecode
	 */
	public TcsDaoimpl(final String typecode)
	{
		super(typecode);
		// XXX Auto-generated constructor stub
	}

	@Override
	public List<TcsModel> getTcs()
	{
		// XXX Auto-generated method stub
		return find();
	}

}
