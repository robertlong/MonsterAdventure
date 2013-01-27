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

public class CreaturePickActivity extends Activity
{
    
    Context appContext = this;
    
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_creaturepick);
        
        final Button creature1 = (Button) findViewById(R.id.rhinodog_button);
        final Button creature2 = (Button) findViewById(R.id.pigbat_button);
        final Button creature3 = (Button) findViewById(R.id.birdhorse_button);
        
        creature1.setOnClickListener(new OnClickListener()
        {
            
            @Override
            public void onClick(View v)
            {
                new CreateUser().createUser(Player.createCurrentUser("player",
                        Gender.Male, new Bradpitbull("angie")));
            }
        });
        
        creature2.setOnClickListener(new OnClickListener()
        {
            
            @Override
            public void onClick(View v)
            {
                new CreateUser().createUser(Player.createCurrentUser("player",
                        Gender.Male, new Bradpitbull("angie")));
            }
        });
        
        creature3.setOnClickListener(new OnClickListener()
        {
            
            @Override
            public void onClick(View v)
            {
                new CreateUser().createUser(Player.createCurrentUser("player",
                        Gender.Male, new Bradpitbull("angie")));
            }
        });
    }
}