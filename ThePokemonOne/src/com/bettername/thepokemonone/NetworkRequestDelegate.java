package com.bettername.thepokemonone;

public interface NetworkRequestDelegate<T> {
	
	public void networkRequestCompleted(T response);
	public void networkRequestFailed();

}
