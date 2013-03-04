package com.example.searcher;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;


public class Sismik extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.kalkulus);
		Button kelas = (Button) findViewById(R.id.KelasLain);
		
		kelas.setOnClickListener(new OnClickListener() {
	        @Override
	        public void onClick(View v) {
				Intent i = new Intent(Sismik.this, Mainsearch.class);
				startActivity(i);
	        }
	    });
	}

}