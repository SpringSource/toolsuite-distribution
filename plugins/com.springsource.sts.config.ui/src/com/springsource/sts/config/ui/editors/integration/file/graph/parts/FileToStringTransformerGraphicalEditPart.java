/******************************************************************************************
 * Copyright (c) 2010 SpringSource, a division of VMware, Inc. All rights reserved.
 ******************************************************************************************/
package com.springsource.sts.config.ui.editors.integration.file.graph.parts;

import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.Label;

import com.springsource.sts.config.ui.editors.integration.file.graph.model.FileToStringTransformerModelElement;
import com.springsource.sts.config.ui.editors.integration.graph.IntegrationImages;
import com.springsource.sts.config.ui.editors.integration.graph.parts.BorderedIntegrationPart;

/**
 * @author Leo Dos Santos
 */
public class FileToStringTransformerGraphicalEditPart extends BorderedIntegrationPart {

	public FileToStringTransformerGraphicalEditPart(FileToStringTransformerModelElement transformer) {
		super(transformer);
	}

	@Override
	protected IFigure createFigure() {
		Label l = (Label) super.createFigure();
		l.setIcon(IntegrationImages.getImageWithBadge(IntegrationImages.TRANSFORMER, IntegrationImages.BADGE_SI_FILE));
		return l;
	}

	@Override
	public FileToStringTransformerModelElement getModelElement() {
		return (FileToStringTransformerModelElement) getModel();
	}

}
