package com.bettername.thepokemonone.activity;

import android.app.Activity;
import android.content.Context;
import android.graphics.LightingColorFilter;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.bettername.thepokemonone.R;
import com.bettername.thepokemonone.R.id;
import com.bettername.thepokemonone.R.layout;
import com.bettername.thepokemonone.data.CreateUser;
import com.bettername.thepokemonone.model.Player;
import com.bettername.thepokemonone.monster.Bradpitbull;
import com.bettername.thepokemonone.monster.Pitbullfrog;
import com.bettername.thepokemonone.monster.Rihannacerous;

public class BattleActivity extends Activity {

	Context appContext = this;

	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_creaturepick);

		final Button creature1 = (Button) findViewById(R.id.rhinodog_button);
		final Button creature2 = (Button) findViewById(R.id.pigbat_button);
		final Button creature3 = (Button) findViewById(R.id.birdhorse_button);

		final int mul = 0xFFFFFFFF;
		final int add = 0x22222222;

		creature1.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Player.getCurrentUser().setStartingMonster(new Pitbullfrog("bully"));
				creature1.getBackground().setColorFilter(new LightingColorFilter(mul, add));
				creature2.getBackground().clearColorFilter();
				creature3.getBackground().clearColorFilter();
				new CreateUser().createUser(Player.getCurrentUser());
			}
		});

		creature2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Player.getCurrentUser().setStartingMonster(new Bradpitbull("bratty"));
				creature2.getBackground().setColorFilter(new LightingColorFilter(mul, add));
				creature1.getBackground().clearColorFilter();
				creature3.getBackground().clearColorFilter();
				new CreateUser().createUser(Player.getCurrentUser());
			}
		});

		creature3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				Player.getCurrentUser().setStartingMonster(new Rihannacerous("bitch"));
				creature3.getBackground().setColorFilter(new LightingColorFilter(mul, add));
				creature1.getBackground().clearColorFilter();
				creature2.getBackground().clearColorFilter();
				new CreateUser().createUser(Player.getCurrentUser());
			}
		});
	}
	
	
	
	
	
}
