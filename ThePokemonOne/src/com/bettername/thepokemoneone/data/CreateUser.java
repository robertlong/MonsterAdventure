package com.bettername.thepokemoneone.data;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.concurrent.FutureCallback;
import org.apache.http.impl.nio.client.DefaultHttpAsyncClient;
import org.apache.http.nio.client.HttpAsyncClient;
import org.apache.http.nio.reactor.IOReactorException;

import android.util.Log;

import com.google.gson.Gson;

public class CreateUser {

	class callback implements FutureCallback<HttpResponse> {

		@Override
		public void cancelled() {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void completed(HttpResponse arg0) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void failed(Exception arg0) {
			// TODO Auto-generated method stub
			
		}




	}
	
	public static void blah() throws IOReactorException, InterruptedException, ExecutionException {
		try {
			//At this line code gives me exception i do't know why..?
			HttpAsyncClient httpclient = new DefaultHttpAsyncClient();
			httpclient.start();
			HttpPost post = new   HttpPost("http://www.apache.org");
			Future<HttpResponse> future = httpclient.execute(post, null);
			HttpResponse resp = future.get();
			HttpEntity entity = resp.getEntity();
			Gson gson = new Gson();
			Log.w("CALLBACK", "SFSDS");
		} catch (Exception e) {
			
		}
	}





}


