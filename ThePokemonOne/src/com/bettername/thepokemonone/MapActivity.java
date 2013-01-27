package com.bettername.thepokemonone;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.MapFragment;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.support.v4.app.NavUtils;

public class MapActivity extends Activity
{
    LatLng you;
    Marker youMarker;
    CameraPosition cameraPosition;
    GoogleMap map;
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);
        // Show the Up button in the action bar.
        getActionBar().setDisplayHomeAsUpEnabled(true);
        
        LocationListener locationListener = new LocationListener()
        {
            public void onLocationChanged(Location location)
            {
                updateWithNewLocation(location);
            }
            
            public void onProviderDisabled(String provider)
            {
                updateWithNewLocation(null);
            }
            
            public void onProviderEnabled(String provider)
            {
            }
            
            public void onStatusChanged(String provider, int status,
                    Bundle extras)
            {
            }
        };
        
        LocationManager locManager;
        locManager = (LocationManager) getSystemService(Context.LOCATION_SERVICE);
        locManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 1000L,
                500.0f, locationListener);
        Location location = locManager
                .getLastKnownLocation(LocationManager.GPS_PROVIDER);
        
        you = new LatLng(location.getLatitude(), location.getLongitude());
        
        GoogleMap map;
        map = ((MapFragment) getFragmentManager().findFragmentById(R.id.map))
                .getMap();
        youMarker = map.addMarker(new MarkerOptions()
                .position(you)
                .title("You")
                .snippet("You")
                
                .icon(BitmapDescriptorFactory
                        .fromResource(R.drawable.rinodogsmaller)));
        youMarker.setPosition(you);
        cameraPosition = new CameraPosition.Builder().target(you).zoom(17)
                .bearing(0).tilt(30).build();
        map.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
    }
    
    public void updateWithNewLocation(Location location)
    {
        if (location != null)
        {
            you = new LatLng(location.getLatitude(), location.getLongitude());
            youMarker.setPosition(you);
            cameraPosition = new CameraPosition.Builder().target(you).build();
            //map.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
        }
        
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_map, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case android.R.id.home:
                // This ID represents the Home or Up button. In the case of this
                // activity, the Up button is shown. Use NavUtils to allow users
                // to navigate up one level in the application structure. For
                // more details, see the Navigation pattern on Android Design:
                //
                // http://developer.android.com/design/patterns/navigation.html#up-vs-back
                //
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
}
