package com.bettername.thepokemonone;

import android.app.Activity;
import android.content.Context;
import android.graphics.LightingColorFilter;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.bettername.thepokemoneone.data.CreateUser;
import com.bettername.thepokemoneone.model.Player;
import com.bettername.thepokemoneone.model.Player.Gender;
import com.bettername.thepokemonone.monster.Bradpitbull;

public class CreaturePickActivity extends Activity {
	
	Context appContext = this;
	
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creaturepick);
        
        final Button creature1 = (Button)findViewById(R.id.button1);
        final Button creature2 = (Button)findViewById(R.id.button2);
        final Button creature3 = (Button)findViewById(R.id.button3);
        final Button createAccount = (Button)findViewById(R.id.button4);
        
		final int mul = 0x8A8A8A8A;
        creature1.getBackground().setColorFilter(new LightingColorFilter(mul, 0X00000000));
        creature2.getBackground().setColorFilter(new LightingColorFilter(mul, 0X00000000));
        creature3.getBackground().setColorFilter(new LightingColorFilter(mul, 0X00000000));
        
        
        
        creature1.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v)
            {
            	creature1.getBackground().clearColorFilter();
            	creature2.getBackground().setColorFilter(new LightingColorFilter(mul, 0X00000000));
            	creature3.getBackground().setColorFilter(new LightingColorFilter(mul, 0X00000000));
            }
        });
        
        creature2.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v)
            {
            	creature2.getBackground().clearColorFilter();
            	creature1.getBackground().setColorFilter(new LightingColorFilter(mul, 0X00000000));
            	creature3.getBackground().setColorFilter(new LightingColorFilter(mul, 0X00000000));
            }
        });
        
        creature3.setOnClickListener(new OnClickListener(){

            @Override
            public void onClick(View v)
            {
            	creature3.getBackground().clearColorFilter();
            	creature1.getBackground().setColorFilter(new LightingColorFilter(mul, 0X00000000));
            	creature2.getBackground().setColorFilter(new LightingColorFilter(mul, 0X00000000));
            }
        });
        
        createAccount.setOnClickListener( new OnClickListener() {

            @Override
            public void onClick(View v)
            {
            	new CreateUser().createUser(Player.createCurrentUser("player", Gender.Male, new Bradpitbull("angie")));
            }
        });
    }
    
    
}