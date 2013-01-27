package Data;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import android.os.AsyncTask;
import android.provider.SyncStateContract.Constants;
import android.text.style.SuperscriptSpan;

import com.bettername.thepokemonone.User;
import com.bettername.thepokemonone.monster.Monster;
import com.google.gson.Gson;


public class NetworkRequests {
	
	private static String kURLMonster = "http://";
	private static String kURLUser = "http://";
	
	private static String readUrl(String urlString) throws Exception {
	    BufferedReader reader = null;
	    try {
	        URL url = new URL(urlString);
	        reader = new BufferedReader(new InputStreamReader(url.openStream()));
	        StringBuffer buffer = new StringBuffer();
	        int read;
	        char[] chars = new char[1024];
	        while ((read = reader.read(chars)) != -1)
	            buffer.append(chars, 0, read); 

	        return buffer.toString();
	    } finally {
	        if (reader != null)
	            reader.close();
	    }
	}
	
	private class Request<T> extends AsyncTask<String, Void, T> {
		
		public Class aClass;
		public NetworkRequestDelegate<T> delegate;

		protected T doInBackground(String... urls) {
			
			String json = null;
			try {
				json = readUrl(urls[0]);
			} catch (Exception e) {
				return null;
			}

			Gson gson = new Gson();        
			T parsed = (T) gson.fromJson(json, aClass);
			return parsed;
			
	     }

	     protected void onPostExecute(T result) {
	    	 if (result != null) {
		    	 delegate.networkRequestCompleted(result);
	    	 } else {
	    		 delegate.networkRequestFailed();
	    	 }
	     }

	}

	public void getMonster(int monsterID, NetworkRequestDelegate<Monster> delegate) {
		Request<Monster> request = new Request<Monster>();
		request.aClass = Monster.class; 
		request.execute(kURLMonster);
	}
	
	public void getUser(int userID, NetworkRequestDelegate<Monster> delegate ) {
		Request<User> request = new Request<User>();
		request.aClass = User.class; 
		request.execute(kURLUser);
	}
	
	
	

}
