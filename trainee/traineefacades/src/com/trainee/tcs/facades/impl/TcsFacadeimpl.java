/**
 *
 */
package com.trainee.tcs.facades.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

import com.trainee.core.model.TcsModel;
import com.trainee.core.service.TcsService;
import com.trainee.facades.tcs.TcsData;
import com.trainee.tcs.facades.TcsFacade;


/**
 * @author ICON
 *
 */
public class TcsFacadeimpl implements TcsFacade
{

	private TcsService tcsService;

	private Converter<TcsModel, TcsData> tcsConverter;

	@Override
	public List<TcsData> getTcs()
	{
		final List<TcsModel> tcs = tcsService.getTcs();
		return tcsConverter.convertAll(tcs);
	}

	/**
	 * @return the tcsService
	 */
	public TcsService getTcsService()
	{
		return tcsService;
	}

	/**
	 * @param tcsService
	 *           the tcsService to set
	 */
	public void setTcsService(final TcsService tcsService)
	{
		this.tcsService = tcsService;
	}

	/**
	 * @return the tcsConverter
	 */
	public Converter<TcsModel, TcsData> getTcsConverter()
	{
		return tcsConverter;
	}

	/**
	 * @param tcsConverter
	 *           the tcsConverter to set
	 */
	public void setTcsConverter(final Converter<TcsModel, TcsData> tcsConverter)
	{
		this.tcsConverter = tcsConverter;
	}


}
