package com.bettername.thepokemonone.data;

public interface NetworkRequestDelegate<T> {
	
	public void networkRequestCompleted(T response);
	public void networkRequestFailed();

}
