package com.bettername.thepokemoneone.data;

public interface NetworkRequestDelegate<T> {
	
	public void networkRequestCompleted(T response);
	public void networkRequestFailed();

}
