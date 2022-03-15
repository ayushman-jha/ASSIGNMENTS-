package com.details;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:db.properties")
public class Details {
	@Value("\"${DB_DRIVER_CLASS}\"")
	String driverClassName;
	@Value("\"${DB_URL}\"")
	String dburl;
	@Value("\"${DB_USERNAME}\"")
	String username;
	@Value("\"${DB_PASSWORD}\"")
	String password;
	public String getDriverClassName() {
		return driverClassName;
	}
	public void setDriverClassName(String driverClassName) {
		this.driverClassName = driverClassName;
	}
	public String getDburl() {
		return dburl;
	}
	public void setDburl(String dburl) {
		this.dburl = dburl;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String display() {
		return "Details :\nDriveName :"+getDriverClassName()+
				"\nDbUrl :"+getDburl()+"\nName : "+getUsername()
				+"\nPassword : "+getPassword();
	}

}