package cn.kai.common;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

import cn.kai.common.JdbcContextHolder;

public class DynamicDataSource extends AbstractRoutingDataSource {

	@Override
	protected Object determineCurrentLookupKey() {
		// ��ȡ��ǰ����Դ����
		return JdbcContextHolder.getJdbcType();
	}
}
