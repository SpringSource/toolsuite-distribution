/******************************************************************************************
 * Copyright (c) 2010 SpringSource, a division of VMware, Inc. All rights reserved.
 ******************************************************************************************/
package com.springsource.sts.config.ui.editors.integration.jmx.graph.model;

import org.eclipse.wst.xml.core.internal.provisional.document.IDOMElement;

import com.springsource.sts.config.core.schemas.IntJmxSchemaConstants;
import com.springsource.sts.config.flow.model.AbstractConfigFlowDiagram;
import com.springsource.sts.config.ui.editors.integration.graph.model.AbstractOutboundChannelAdapterModelElement;

/**
 * @author Leo Dos Santos
 */
@SuppressWarnings("restriction")
public class NotificationPublishingChannelAdapterModelElement extends AbstractOutboundChannelAdapterModelElement {

	public NotificationPublishingChannelAdapterModelElement() {
		super();
	}

	public NotificationPublishingChannelAdapterModelElement(IDOMElement input, AbstractConfigFlowDiagram diagram) {
		super(input, diagram);
	}

	@Override
	public String getInputName() {
		return IntJmxSchemaConstants.ELEM_NOTIFICATION_PUBLISHING_CHANNEL_ADAPTER;
	}

}
