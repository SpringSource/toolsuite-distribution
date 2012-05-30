/******************************************************************************************
 * Copyright (c) 2010 SpringSource, a division of VMware, Inc. All rights reserved.
 ******************************************************************************************/
package com.springsource.sts.config.ui.editors.integration.mail.graph.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;

import com.springsource.sts.config.ui.editors.integration.graph.IntegrationImages;
import com.springsource.sts.config.ui.editors.integration.graph.parts.BorderedIntegrationPart;
import com.springsource.sts.config.ui.editors.integration.mail.graph.model.HeaderEnricherModelElement;

/**
 * @author Leo Dos Santos
 */
public class HeaderEnricherGraphicalEditPart extends BorderedIntegrationPart {

	public HeaderEnricherGraphicalEditPart(HeaderEnricherModelElement enricher) {
		super(enricher);
	}

	@Override
	protected IFigure createFigure() {
		Label l = (Label) super.createFigure();
		l.setIcon(IntegrationImages.getImageWithBadge(IntegrationImages.ENRICHER, IntegrationImages.BADGE_SI_MAIL));
		return l;
	}

	@Override
	public HeaderEnricherModelElement getModelElement() {
		return (HeaderEnricherModelElement) getModel();
	}

}
