package com.trainee.core.jalo;

import com.trainee.core.constants.TraineeCoreConstants;
import de.hybris.platform.jalo.JaloSession;
import de.hybris.platform.jalo.extension.ExtensionManager;
import org.apache.log4j.Logger;

public class TraineeCoreManager extends GeneratedTraineeCoreManager
{
	@SuppressWarnings("unused")
	private static final Logger log = Logger.getLogger( TraineeCoreManager.class.getName() );
	
	public static final TraineeCoreManager getInstance()
	{
		ExtensionManager em = JaloSession.getCurrentSession().getExtensionManager();
		return (TraineeCoreManager) em.getExtension(TraineeCoreConstants.EXTENSIONNAME);
	}
	
}
