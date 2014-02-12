/**
 * This file is part of mycollab-dao.
 *
 * mycollab-dao is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-dao is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-dao.  If not, see <http://www.gnu.org/licenses/>.
 */
/**
 * This file is part of mycollab-core.
 *
 * mycollab-core is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mycollab-core is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mycollab-core.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.esofthead.mycollab.core.arguments;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author MyCollab Ltd.
 * @since 1.0
 * 
 */
public abstract class SearchCriteria implements Serializable {
	private static final long serialVersionUID = 1L;

	public static String ASC = "ASC";

	public static String DESC = "DESC";

	protected String orderByField;

	protected String sortDirection;

	protected NumberSearchField saccountid;

	protected List<ExtSearchField> extraFields;

	public SearchCriteria() {
		saccountid = new NumberSearchField(GroupIdProvider.getAccountId());
	}

	public String getOrderByField() {
		return orderByField;
	}

	public void setOrderByField(String orderByField) {
		this.orderByField = orderByField;
	}

	public String getSortDirection() {
		return sortDirection;
	}

	public void setSortDirection(String sortDirection) {
		this.sortDirection = sortDirection;
	}

	public NumberSearchField getSaccountid() {
		return saccountid;
	}

	public void setSaccountid(NumberSearchField saccountid) {
		this.saccountid = saccountid;
	}

	public List<ExtSearchField> getExtraFields() {
		return extraFields;
	}

	public void setExtraFields(List<ExtSearchField> extraFields) {
		this.extraFields = extraFields;
	}

	public void addExtraField(ExtSearchField extraField) {
		if (extraFields == null) {
			extraFields = new ArrayList<ExtSearchField>();
		}
		extraFields.add(extraField);
	}
}