package org.adempiere.mm.attributes.api.impl;

import org.adempiere.mm.attributes.AttributeId;
import org.adempiere.mm.attributes.api.IAttributeDAO;
import org.adempiere.mm.attributes.api.ILotNumberDateAttributeDAO;
import org.adempiere.util.Services;
import org.compiere.model.I_M_Attribute;

/*
 * #%L
 * de.metas.swat.base
 * %%
 * Copyright (C) 2016 metas GmbH
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 2 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public
 * License along with this program. If not, see
 * <http://www.gnu.org/licenses/gpl-2.0.html>.
 * #L%
 */

public class LotNumberDateAttributeDAO implements ILotNumberDateAttributeDAO
{
	public static String LotNumberDateAttribute = "HU_LotNumberDate";
	public static String LotNumberAttribute = "Lot-Nummer";

	@Override
	public AttributeId getLotNumberDateAttributeId()
	{
		final IAttributeDAO attributesRepo = Services.get(IAttributeDAO.class);
		return attributesRepo.retrieveAttributeIdByValueOrNull(LotNumberDateAttribute);
	}

	@Override
	public AttributeId getLotNumberAttributeId()
	{
		final IAttributeDAO attributesRepo = Services.get(IAttributeDAO.class);
		return attributesRepo.retrieveAttributeIdByValueOrNull(LotNumberAttribute);
	}

	@Override
	public I_M_Attribute getLotNumberAttribute()
	{
		final IAttributeDAO attributesRepo = Services.get(IAttributeDAO.class);

		final AttributeId attributeId = getLotNumberAttributeId();
		return attributesRepo.getAttributeById(attributeId);
	}
}
