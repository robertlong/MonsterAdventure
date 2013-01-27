package com.bettername.thepokemonone.data;

import com.bettername.thepokemonone.model.Player;
import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

public class CreateUser {

	public void createUser(Player user, AsyncHttpResponseHandler handler) {

		String jsonString = new Gson().toJson(user);
		System.out.println(jsonString);
		RequestParams rp = new RequestParams();
		System.out.println(rp.toString());
		System.out.println(rp);
		rp.put("player", jsonString);
		PokeServClient.post("players", rp, handler);

	}

}
