package com.bettername.thepokemonone;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class StoryActivity extends Activity
{
    
    Context appContext = this;
    
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);
        
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_story, menu);
        return true;
    }
    
    public void onClick(View v)
    {
        
        Intent continueIntent = new Intent(appContext, MapActivity.class);
        appContext.startActivity(continueIntent);
        
    }
    
}
