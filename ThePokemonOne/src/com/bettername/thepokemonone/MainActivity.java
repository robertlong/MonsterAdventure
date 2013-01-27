package com.bettername.thepokemonone;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.LightingColorFilter;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity
{
    Context appContext = this;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        Config.setContext(appContext);
        // Create user
        
       
        final Button boyButton = (Button)findViewById(R.id.boy_button);
        final Button girlButton = (Button)findViewById(R.id.girl_button);

        
        final int mul = 0x8A8A8A8A;
        boyButton.getBackground().setColorFilter(new LightingColorFilter(mul, 0X00000000));
        girlButton.getBackground().setColorFilter(new LightingColorFilter(mul, 0X00000000));
        
        boyButton.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v)
            {
            	boyButton.getBackground().clearColorFilter();
                girlButton.getBackground().setColorFilter(new LightingColorFilter(mul, 0X00000000));
            }
        });
        
        
        girlButton.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v)
            {
                boyButton.getBackground().setColorFilter(new LightingColorFilter(mul, 0X00000000));
            	girlButton.getBackground().clearColorFilter();
            }
        });
        
        
        
        
        Button continueButton = (Button)findViewById(R.id.continue_button);
        continueButton.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v)
            {
                Intent continueIntent = new Intent(appContext, CreaturePickActivity.class);
                appContext.startActivity(continueIntent);
            }
        });
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("About")
                .setMessage(
                        "It's an app! Developed by:\n\n"
                                + "Kristian\n"
                                + "Nolan\n"
                                + "Robert\n" 
                                + "Will\n"
                                + "Holly\n"
                                + "Kyle\n")
                .setNeutralButton("OK",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog,
                                    int which) {
                                Intent continueIntent = new Intent(appContext, MapActivity.class);
                                appContext.startActivity(continueIntent);
                            }
                        });
        builder.create().show();
        return true;
    }

    @Override
    protected void onPause()
    {
        // TODO Auto-generated method stub
        super.onPause();
    }

    @Override
    protected void onResume()
    {
        // TODO Auto-generated method stub
        super.onResume();
    }

    @Override
    protected void onStop()
    {
        // TODO Auto-generated method stub
        super.onStop();
    }
}
