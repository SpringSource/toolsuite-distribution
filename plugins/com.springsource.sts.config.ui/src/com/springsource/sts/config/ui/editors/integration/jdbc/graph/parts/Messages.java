/******************************************************************************************
 * Copyright (c) 2010 SpringSource, a division of VMware, Inc. All rights reserved.
 ******************************************************************************************/
package com.springsource.sts.config.ui.editors.integration.jdbc.graph.parts;

import org.eclipse.osgi.util.NLS;

/**
 * @author Leo Dos Santos
 */
public class Messages extends NLS {
	private static final String BUNDLE_NAME = "com.springsource.sts.config.ui.editors.integration.jdbc.graph.parts.messages"; //$NON-NLS-1$

	public static String IntJdbcPaletteFactory_INBOUND_CHANNEL_ADAPTER_COMPONENT_DESCRIPTION;

	public static String IntJdbcPaletteFactory_OUTBOUND_CHANNEL_ADAPTER_COMPONENT_DESCRIPTION;

	public static String IntJdbcPaletteFactory_OUTBOUND_GATEWAY_COMPONENT_DESCRIPTION;

	public static String IntJdbcPaletteFactory_STORED_PROC_INBOUND_CHANNEL_ADAPTER_COMPONENT_DESCRIPTION;

	public static String IntJdbcPaletteFactory_STORED_PROC_OUTBOUND_CHANNEL_ADAPTER_COMPONENT_DESCRIPTION;

	public static String IntJdbcPaletteFactory_STORED_PROC_OUTBOUND_GATEWAY_COMPONENT_DESCRIPTION;
	static {
		// initialize resource bundle
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

	private Messages() {
	}
}
