/******************************************************************************************
 * Copyright (c) 2010 SpringSource, a division of VMware, Inc. All rights reserved.
 ******************************************************************************************/
package com.springsource.sts.config.ui.editors.integration.ip.graph.model;

import org.eclipse.wst.xml.core.internal.provisional.document.IDOMElement;

import com.springsource.sts.config.core.schemas.IntIpSchemaConstants;
import com.springsource.sts.config.flow.model.AbstractConfigFlowDiagram;
import com.springsource.sts.config.ui.editors.integration.graph.model.AbstractInboundGatewayModelElement;

/**
 * @author Leo Dos Santos
 */
@SuppressWarnings("restriction")
public class TcpInboundGatewayModelElement extends AbstractInboundGatewayModelElement {

	public TcpInboundGatewayModelElement() {
		super();
	}

	public TcpInboundGatewayModelElement(IDOMElement input, AbstractConfigFlowDiagram diagram) {
		super(input, diagram);
	}

	@Override
	public String getInputName() {
		return IntIpSchemaConstants.ELEM_TCP_INBOUND_GATEWAY;
	}

}
