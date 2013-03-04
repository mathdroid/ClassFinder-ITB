package com.example.searcher;

import android.os.Bundle;
import android.content.Intent;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class Mainsearch extends Activity {	
	String name1 = "sismik";
	String name2 = "probstat";
	String name3 = "kalkulus";
	
	private EditText namelass;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_mainsearch);
		namelass = (EditText) findViewById (R.id.NamaKelas);
		Button about = (Button) findViewById(R.id.About);
		Button exits = (Button) findViewById(R.id.Exit);
		Button find = (Button) findViewById(R.id.Find);
		
		exits.setOnClickListener(new OnClickListener (){	
		@Override
		public void onClick(View v){
			Menu(v);
			}
		});		
		about.setOnClickListener(new OnClickListener() {
        @Override
        public void onClick(View v) {
				Menu(v);
        }
    });
		find.setOnClickListener(new OnClickListener (){
			public void  onClick(View view){
				CallIntent(view);
			}
		});
	}
		public void Menu(View view){	
			Intent i = null;
			switch (view.getId()) {
				case R.id.About:
					i = new Intent(Mainsearch.this, AboutClass.class);
					startActivity(i);
					break;
				case R.id.Exit:
					i = null;
					finish();
					System.exit(0);
					break;
				default:
					break;
				}			
			}
			public void CallIntent(View view) {	
				String text = namelass.getText().toString();
				Toast.makeText(Mainsearch.this,text,Toast.LENGTH_SHORT).show();
				Intent i = null;
				if(text==name1)
				{
					i = new Intent(Mainsearch.this, Sismik.class);
				  startActivity(i);
				}
				else if(text==name2)
				{
					i = new Intent(Mainsearch.this, Probstat.class);
					startActivity(i);
				}
				else if(text==name3)
				{
					i = new Intent(Mainsearch.this, Kalkulus.class);
					startActivity(i);
				}
				else
		        {
		            Toast.makeText(Mainsearch.this," Maaf Ruangan Kelas Tidak Di Temukan ",Toast.LENGTH_SHORT).show();
		        }			
			}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds Kelas to the action bar if it is present.
		getMenuInflater().inflate(R.menu.mainsearch, menu);
		return true;
	}	
}
