package de.metas.inoutcandidate.api.impl;

/*
 * #%L
 * de.metas.swat.base
 * %%
 * Copyright (C) 2015 metas GmbH
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

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.Nullable;

import org.adempiere.mm.attributes.AttributeSetInstanceId;
import org.adempiere.warehouse.WarehouseId;

import com.google.common.annotations.VisibleForTesting;

import de.metas.inoutcandidate.api.IPackageable;
import de.metas.inoutcandidate.api.ShipmentScheduleId;
import de.metas.order.OrderLineId;
import de.metas.product.ProductId;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;

@VisibleForTesting
@Value
@Builder
public class Packageable implements IPackageable
{
	int bpartnerLocationId;

	@NonNull
	ShipmentScheduleId shipmentScheduleId;

	BigDecimal qtyToDeliver;

	int bpartnerId;
	String bpartnerValue;
	String bpartnerName;

	String bpartnerLocationName;

	String bpartnerAddress;

	@NonNull
	WarehouseId warehouseId;
	String warehouseName;

	String deliveryVia;

	int shipperId;
	String shipperName;

	boolean displayed;

	String documentNo;

	Timestamp deliveryDate;
	Timestamp preparationDate;

	String freightCostRule;

	@NonNull
	ProductId productId;
	String productName;

	@NonNull
	AttributeSetInstanceId asiId;

	int orderId;
	String docSubType;

	@Nullable
	OrderLineId orderLineIdOrNull;
}
