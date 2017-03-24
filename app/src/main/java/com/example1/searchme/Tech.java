package com.example1.searchme;

import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;

import java.io.File;
import java.sql.Date;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class Tech extends Activity {
	

 
	 ImageView img;
	 Button start,next;
	 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tech);
		img=(ImageView) findViewById(R.id.imageView1);
	    start=(Button) findViewById(R.id.button1);
	  next=(Button) findViewById(R.id.button2);
	    start.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			try{
			String s="com.example1.searchme.Search";
			
			
			  Class c = Class.forName(s);
			 
				// TODO Auto-generated catch block
			
			
			Intent it=new Intent(getApplicationContext(),c);
			startActivity(it);
			}catch(Exception e)
			{
				Toast.makeText(getApplicationContext(), "Exception: "+e, Toast.LENGTH_LONG).show();
			}
		}
	});
	    next.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try{
					String s="com.example1.searchme.Wallpaper";
					
					
					  Class c = Class.forName(s);
					 
						// TODO Auto-generated catch block
					
					
					Intent it=new Intent(getApplicationContext(),c);
					startActivity(it);
					}catch(Exception e)
					{
						Toast.makeText(getApplicationContext(), "Exception: "+e, Toast.LENGTH_LONG).show();
					}
			}
		});
	   img.setClickable(true);
	   img.setOnTouchListener(new OnTouchListener() {
		
		@Override
		public boolean onTouch(View v, MotionEvent event) {
			// TODO Auto-generated method stub

			Intent it=new Intent(Intent.ACTION_DIAL,Uri.parse("tel:+91"));
			startActivity(it);
			return false;
		}
	});
	  
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tech, menu);
		
		
		
		return true;
	
	}

}
