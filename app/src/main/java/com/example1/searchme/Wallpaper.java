package com.example1.searchme;

import android.os.Bundle;

import java.io.IOException;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;
import android.app.WallpaperManager;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;


public class Wallpaper extends Activity {
	ImageView iv,i1,i2,i3;
	Button set;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_wallpaper);
	    i1=(ImageView) findViewById(R.id.imageView1);
	    i1.setClickable(true);
	   
	    i2=(ImageView) findViewById(R.id.imageView2);
	    i3=(ImageView) findViewById(R.id.imageView3);
	    i2.setClickable(true);
	    i3.setClickable(true);
		iv=(ImageView) findViewById(R.id.imageView1);
	    set=(Button) findViewById(R.id.button1);
	i1.setOnTouchListener(new OnTouchListener() {
		
		public boolean onTouch(View v, MotionEvent event) {
			// TODO Auto-generated method stub
			iv=i1;
			
			return false;
		}
	});
	i2.setOnTouchListener(new OnTouchListener() {
		
		@Override
		public boolean onTouch(View v, MotionEvent event) {
			// TODO Auto-generated method stub
			iv=i2;
			return false;
		}
	});
	i3.setOnTouchListener(new OnTouchListener() {
		
		@Override
		public boolean onTouch(View v, MotionEvent event) {
			// TODO Auto-generated method stub
			iv=i3;
			return false;
		}
	});
	}

	 @SuppressLint("ServiceCast")
	 public void setWall(View v)
	 {
		 WallpaperManager wm=(WallpaperManager) getSystemService(WALLPAPER_SERVICE);
		 Drawable d=iv.getDrawable();
		 BitmapDrawable bmd=(BitmapDrawable) d;
		 Bitmap b=bmd.getBitmap();
		 try{
			 wm.setBitmap(b); 
		      
		    }
		 catch(IOException e)
		    {
			 Toast.makeText(getApplicationContext(), "Wallpaper not set: "+e, Toast.LENGTH_LONG).show();
		    }
	 }// end of setwall
	 
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.wallpaper, menu);
		return true;
	}

}
