package com.szczytowski.genericdao.criteria.projection;

import com.szczytowski.genericdao.criteria.Criteria;

/**
 * Row count projection.
 *
 * @author Maciej Szczytowsko <mszczytowski-genericdao@gmail.com>
 * @since 1.0
 */
public class RowCountProjection extends SimpleProjection {
    
	/**
	 * Create new row count projection.
	 */
	protected RowCountProjection() {}

        @Override
	public String toSqlString(Criteria criteria, Criteria.CriteriaQuery criteriaQuery) {
		return "count(*)";
	}

}
