/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package com.trainee.fulfilmentprocess.jalo;

import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import com.trainee.fulfilmentprocess.constants.TraineeFulfilmentProcessConstants;

public class TraineeFulfilmentProcessManager extends GeneratedTraineeFulfilmentProcessManager
{
	public static final TraineeFulfilmentProcessManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (TraineeFulfilmentProcessManager) em.getExtension(TraineeFulfilmentProcessConstants.EXTENSIONNAME);
	}
	
}
