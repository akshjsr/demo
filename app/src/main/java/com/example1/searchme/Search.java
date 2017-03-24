package com.example1.searchme;

import android.os.Bundle;


import android.app.Activity;
import android.app.SearchManager;
import android.content.Intent;
import android.net.Uri;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Search extends Activity {
	Button b1,b2,b3,b4,b5,b6;
	EditText e1;
	
	
    
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_search);
		e1=(EditText) findViewById(R.id.editText1);
		b6=(Button) findViewById(R.id.button5);
		
		b6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try{
				String str="com.example1.searchme.Explore";
				Class c=Class.forName(str);
				Intent it= new Intent(getApplicationContext(),c);
				startActivity(it);
				}
			catch(Exception e)
				{
				Toast.makeText(getApplicationContext(), "Activity failed to load!", Toast.LENGTH_LONG).show();
				}
			}
		});
		b1=(Button) findViewById(R.id.button1);
		b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent it=new Intent(Intent.ACTION_WEB_SEARCH,Uri.parse("http://www.google.co.in"));
				it.putExtra(SearchManager.QUERY,e1.getText().toString());
				startActivity(it);
				
			}
		});
		b2=(Button) findViewById(R.id.button4);
		b2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent it=new Intent(Intent.ACTION_VIEW,Uri.parse("geo:0,0?q="+e1.getText().toString()));
				
				startActivity(it);
			}
		});
		b3=(Button) findViewById(R.id.button2);
		b3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent it=new Intent(Intent.ACTION_DIAL,Uri.parse("tel:+91"+e1.getText().toString()));
				
				startActivity(it);
			}
		});
		b4=(Button) findViewById(R.id.button3);
		b4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent it=new Intent(Intent.ACTION_SENDTO,Uri.parse("sms:+91"+e1.getText().toString()));
				
				startActivity(it);
			}
		});
		b5=(Button) findViewById(R.id.button6);
		b5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				moveTaskToBack(true);
				android.os.Process.killProcess(android.os.Process.myPid());
                System.exit(1);

			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.search, menu);
		return true;
	}

}
