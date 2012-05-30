/******************************************************************************************
 * Copyright (c) 2011 SpringSource, a division of VMware, Inc. All rights reserved.
 ******************************************************************************************/
package com.springsource.sts.config.ui.editors.integration.redis.graph.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;

import com.springsource.sts.config.ui.editors.integration.graph.IntegrationImages;
import com.springsource.sts.config.ui.editors.integration.graph.parts.AbstractChannelGraphicalEditPart;
import com.springsource.sts.config.ui.editors.integration.redis.graph.model.PublishSubscribeChannelModelElement;

public class PublishSubscribeChannelGraphicalEditPart extends AbstractChannelGraphicalEditPart {

	public PublishSubscribeChannelGraphicalEditPart(PublishSubscribeChannelModelElement channel) {
		super(channel);
	}

	@Override
	protected IFigure createFigure() {
		Label l = (Label) super.createFigure();
		l.setIcon(IntegrationImages.getImageWithBadge(IntegrationImages.PUBSUB_CHANNEL,
				IntegrationImages.BADGE_SI_REDIS));
		return l;
	}

	@Override
	public PublishSubscribeChannelModelElement getModelElement() {
		return (PublishSubscribeChannelModelElement) getModel();
	}

}
