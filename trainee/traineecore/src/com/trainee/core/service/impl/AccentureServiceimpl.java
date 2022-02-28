/**
 *
 */
package com.trainee.core.service.impl;

import java.util.List;

import com.trainee.core.dao.AccentureDao;
import com.trainee.core.model.AccentureModel;
import com.trainee.core.service.AccentureService;


/**
 * @author ICON
 *
 */
public class AccentureServiceimpl implements AccentureService
{
	private AccentureDao accentureDao;

	@Override
	public List<AccentureModel> getAccenture()
	{
		// XXX Auto-generated method stub
		return accentureDao.getAccenture();
	}

	/**
	 * @return the accentureDao
	 */
	public AccentureDao getAccentureDao()
	{
		return accentureDao;
	}

	/**
	 * @param accentureDao
	 *           the accentureDao to set
	 */
	public void setAccentureDao(final AccentureDao accentureDao)
	{
		this.accentureDao = accentureDao;
	}

}
