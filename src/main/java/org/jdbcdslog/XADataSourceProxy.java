package org.jdbcdslog;

import java.sql.SQLException;

import javax.sql.DataSource;
import javax.sql.XADataSource;

public class XADataSourceProxy extends DataSourceProxyBase implements XADataSource, DataSource {

    private static final long serialVersionUID = -2923593005281631348L;

    public XADataSourceProxy() throws JDBCDSLogException {
        super();
    }
    
    @Override
    public Object unwrap(Class iface) throws SQLException {
    	return super.unwrap(iface);
    }
}
