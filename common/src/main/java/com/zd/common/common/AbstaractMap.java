package com.zd.common.common;

public abstract class AbstaractMap {

	String id;
	
	AbstaractMap(String id){
		this.id = id;
	}
	abstract void show(String id,String name);
	
	abstract String getName(String id);
}
