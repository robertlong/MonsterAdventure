package com.bettername.thepokemonone;

import com.bettername.thepokemonone.R;
import com.bettername.thepokemonone.R.layout;
import com.bettername.thepokemonone.R.menu;
import com.bettername.thepokemonone.model.Player;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class StoryActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_story);

//		final Button continueButton = (Button) findViewById(R.id.continue_button);
//		continueButton.setOnClickListener(new OnClickListener()
//        {
//            
//            @Override
//            public void onClick(View v)
//            {
//                Intent continueIntent = new Intent(appContext, StoryActivty.class);
//                appContext.startActivity(continueIntent);
//            }
//        });
		
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_story, menu);
		return true;
	}

}
