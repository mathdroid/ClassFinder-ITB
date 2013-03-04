package com.example.searcher;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class AboutClass extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.aboutclass);
		Button home = (Button) findViewById(R.id.HomePage);
		home.setOnClickListener(new OnClickListener() {

	        @Override
	        public void onClick(View v) {
				Intent i = new Intent(AboutClass.this, Mainsearch.class);
				startActivity(i);
	        }
	    });
	}

}