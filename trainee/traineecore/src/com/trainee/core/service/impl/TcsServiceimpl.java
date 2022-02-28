/**
 *
 */
package com.trainee.core.service.impl;

import java.util.List;

import com.trainee.core.dao.TcsDao;
import com.trainee.core.model.TcsModel;
import com.trainee.core.service.TcsService;


/**
 * @author ICON
 *
 */
public class TcsServiceimpl implements TcsService
{

	private TcsDao tcsDao;

	@Override
	public List<TcsModel> getTcs()
	{
		// XXX Auto-generated method stub
		return tcsDao.getTcs();
	}

	/**
	 * @return the tcsDao
	 */
	public TcsDao getTcsDao()
	{
		return tcsDao;
	}

	/**
	 * @param tcsDao
	 *           the tcsDao to set
	 */
	public void setTcsDao(final TcsDao tcsDao)
	{
		this.tcsDao = tcsDao;
	}

}
