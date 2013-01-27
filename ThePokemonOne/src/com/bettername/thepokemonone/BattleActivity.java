package com.bettername.thepokemonone;

import android.annotation.TargetApi;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.bettername.thepokemonone.util.SystemUiHider;

/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 * 
 * @see SystemUiHider
 */
public class BattleActivity extends Activity
{
    ImageView pigBat;
    ImageView rhinoDog;
    Animation slideInLeft;
    Animation slideInRight;
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_battle);
        pigBat = (ImageView) findViewById(R.id.pigbat_battle);
        rhinoDog = (ImageView) findViewById(R.id.rhinodog_battle);
        /*
        slideInLeft = AnimationUtils.loadAnimation(this,
                android.R.anim.slide_in_left);
        slideInRight = AnimationUtils.loadAnimation(this,
                android.R.anim.slide_out_right);
        
        slideInRight.setInterpolator(this,
                android.R.interpolator.accelerate_decelerate);
        slideInLeft.setInterpolator(this,
                android.R.interpolator.accelerate_decelerate);
                */
    }
    
    @Override
    protected void onPostCreate(Bundle savedInstanceState)
    {
        super.onPostCreate(savedInstanceState);
        pigBat.setVisibility(View.VISIBLE);
        rhinoDog.setVisibility(View.VISIBLE);
        /*
        pigBat.startAnimation(slideInLeft);
        rhinoDog.startAnimation(slideInRight);
        */
        
    }
    
    /**
     * Set up the {@link android.app.ActionBar}, if the API is available.
     */
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    private void setupActionBar()
    {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB)
        {
            // Show the Up button in the action bar.
            getActionBar().setDisplayHomeAsUpEnabled(true);
        }
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
                // TODO: If Settings has multiple levels, Up should navigate up
                // that hierarchy.
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
}
