/******************************************************************************************
 * Copyright (c) 2010 SpringSource, a division of VMware, Inc. All rights reserved.
 ******************************************************************************************/
package com.springsource.sts.config.ui.editors.integration.httpinvoker.graph.parts;

import org.eclipse.osgi.util.NLS;

/**
 * @author Leo Dos Santos
 */
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "com.springsource.sts.config.ui.editors.integration.httpinvoker.graph.parts.messages"; //$NON-NLS-1$

	public static String IntHttpInvokerPaletteFactory_INBOUND_GATEWAY_COMPONENT_DESCRIPTION;

	public static String IntHttpInvokerPaletteFactory_OUTBOUND_GATEWAY_COMPONENT_DESCRIPTION;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
