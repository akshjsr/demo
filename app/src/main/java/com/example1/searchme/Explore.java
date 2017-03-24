package com.example1.searchme;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TextView;
import android.widget.Toast;

public class Explore extends Activity implements OnCheckedChangeListener, OnClickListener {
	private TextView tv;
	private RadioGroup mRadioGroup;
	private Button btn;
	RadioButton b1,b2,b3,b4;
	String send="";
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_explore);
		b1=(RadioButton) findViewById(R.id.radioButton1);
		tv = (TextView) findViewById(R.id.textView1);
		mRadioGroup= (RadioGroup) findViewById(R.id.radioGroup1);
		btn= (Button) findViewById(R.id.button1);
		mRadioGroup.setOnCheckedChangeListener((android.widget.RadioGroup.OnCheckedChangeListener) this);
		btn.setOnClickListener((OnClickListener) this);
	    
	}

	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.explore, menu);
		
		
		return true;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
	try{
		 String s="com.example1.searchme.Tech";
		 Class c=Class.forName(s);
		 Intent it=new Intent(getApplicationContext(),c);
		 it.putExtra("Tech",send);
		 startActivity(it);
	   }catch(Exception e)
	      {
			 Toast.makeText(this, "Exception: "+e, Toast.LENGTH_LONG).show();
		  }
	
	}

	public void onCheckedChanged(RadioGroup group, int isChecked) {
		// TODO Auto-generated method stub
		String str=null;
	
		if(isChecked == View.NO_ID)
		  str="You have selected none";
		else{
			
		
			str="You have selected";
		    switch( isChecked)
		    {
		     case R.id.radioButton1 : str=str.concat("Technology");
		                              send=str;
		                              break;
		     case R.id.radioButton2 : str=str.concat("Science");
                                      send=str;
		                              break;
		     case R.id.radioButton3 : str=str.concat("Photography");
                                      send=str;
		                              break;
		     case R.id.radioButton4 : str=str.concat("Politics");
                                      send=str;
		                              break;

		                              
		    }
		}tv.setText(str);
	}

	

}
