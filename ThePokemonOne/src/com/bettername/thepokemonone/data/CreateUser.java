package com.bettername.thepokemonone.data;

import com.bettername.thepokemonone.model.Player;
import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

public class CreateUser {
	
	public void createUser(Player user) {
		Gson gson = new Gson();
		String json = gson.toJson(user);
		AsyncHttpClient client = new AsyncHttpClient();
		RequestParams rp = new RequestParams();
		rp.put("player", json);
		System.out.println(json);
		client.post("https://monsteradventure.fwd.wf/api/players", rp, new AsyncHttpResponseHandler() {
		    @Override
		    public void onSuccess(String response) {
		        System.out.println(response);
		    }
		});
		
	}





}


