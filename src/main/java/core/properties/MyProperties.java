package core.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

import core.properties.entity.DBInfo;

@ConfigurationProperties(prefix = "myproperties")
public class MyProperties {
	private DBInfo dbinfo;

	public DBInfo getDbinfo() {
		return dbinfo;
	}

	public void setDbinfo(DBInfo dbinfo) {
		this.dbinfo = dbinfo;
	}
	
	
}
