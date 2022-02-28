/**
 *
 */
package com.trainee.accenture.facades.impl;

import de.hybris.platform.servicelayer.dto.converter.Converter;

import java.util.List;

import com.trainee.accenture.facades.AccentureFacade;
import com.trainee.core.model.AccentureModel;
import com.trainee.core.service.AccentureService;
import com.trainee.facades.accenture.AccentureData;


/**
 * @author ICON
 *
 */
public class AccentureFacadeimpl implements AccentureFacade
{

	private AccentureService accentureService;

	private Converter<AccentureModel, AccentureData> accentureConverter;

	@Override
	public List<AccentureData> getAccenture()
	{
		final List<AccentureModel> accenture = accentureService.getAccenture();
		// XXX Auto-generated method stub
		return accentureConverter.convertAll(accenture);
	}


	/**
	 * @return the accentureService
	 */
	public AccentureService getAccentureService()
	{
		return accentureService;
	}

	/**
	 * @param accentureService
	 *           the accentureService to set
	 */
	public void setAccentureService(final AccentureService accentureService)
	{
		this.accentureService = accentureService;
	}

	/**
	 * @return the accentureConverter
	 */
	public Converter<AccentureModel, AccentureData> getAccentureConverter()
	{
		return accentureConverter;
	}

	/**
	 * @param accentureConverter
	 *           the accentureConverter to set
	 */
	public void setAccentureConverter(final Converter<AccentureModel, AccentureData> accentureConverter)
	{
		this.accentureConverter = accentureConverter;
	}





}
