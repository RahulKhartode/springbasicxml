package com.poc.springbasicxml.datasource;

public class DummyDataSource {

	private String url;
	
	public DummyDataSource() {
		System.out.println("DummyDataSource created");
	}
	
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
}
