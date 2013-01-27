package com.bettername.thepokemoneone.data;

import com.google.gson.Gson;
import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

public class POI
{
    
    private class Place
    {
        double latitude;
        double longitude;
        double radius;
        
        public Place(double latitude, double longitude, double radius)
        {
            this.latitude = latitude;
            this.longitude = longitude;
            this.radius = radius;
        }
    }
    
    public void getPOIs(double latitude, double longitude, double radius, final CallBackListener callback)
    {
        Place place = new Place(latitude, longitude, radius);
        Gson gson = new Gson();
        String json = gson.toJson(place);
        AsyncHttpClient client = new AsyncHttpClient();
        RequestParams rp = new RequestParams();
        rp.put("place", json);
        client.post("https://monsteradventure.fwd.wf/api/places", rp,
                new AsyncHttpResponseHandler()
                {
                    @Override
                    public void onSuccess(String response)
                    {
                        callback.callBack(response);
                    }
                });
    }
    public interface CallBackListener{
        public void callBack(Object o);
    }
    
}
