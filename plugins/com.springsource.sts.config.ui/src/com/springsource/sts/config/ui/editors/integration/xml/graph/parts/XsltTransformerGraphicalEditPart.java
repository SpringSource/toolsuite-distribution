/******************************************************************************************
 * Copyright (c) 2010 SpringSource, a division of VMware, Inc. All rights reserved.
 ******************************************************************************************/
package com.springsource.sts.config.ui.editors.integration.xml.graph.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;

import com.springsource.sts.config.ui.editors.integration.graph.IntegrationImages;
import com.springsource.sts.config.ui.editors.integration.graph.parts.BorderedIntegrationPart;
import com.springsource.sts.config.ui.editors.integration.xml.graph.model.XslTransformerModelElement;

/**
 * @author Leo Dos Santos
 */
public class XsltTransformerGraphicalEditPart extends BorderedIntegrationPart {

	public XsltTransformerGraphicalEditPart(XslTransformerModelElement transformer) {
		super(transformer);
	}

	@Override
	protected IFigure createFigure() {
		Label l = (Label) super.createFigure();
		l.setIcon(IntegrationImages.getImageWithBadge(IntegrationImages.TRANSFORMER, IntegrationImages.BADGE_SI_XML));
		return l;
	}

	@Override
	public XslTransformerModelElement getModelElement() {
		return (XslTransformerModelElement) getModel();
	}

}
