package org.jdbcdslog;

import java.sql.SQLException;

import javax.sql.DataSource;

public class DataSourceProxy extends DataSourceProxyBase implements DataSource {

    private static final long serialVersionUID = -6888072076120346186L;

    public DataSourceProxy() throws JDBCDSLogException {
        super();
    }
    
    @Override
    public Object unwrap(Class iface) throws SQLException {
    	return super.unwrap(iface);
    }

}
