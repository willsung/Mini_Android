package com.willsung.activity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Activity_Frt extends Activity {
	private Button myButton_frt_back = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_frt);
		
		myButton_frt_back = (Button)findViewById(R.id.myButton_frt_back);
		myButton_frt_back.setOnClickListener(new myButtonListener_Frt_Back());
	}
	
	class myButtonListener_Frt_Back implements OnClickListener{
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent intent = new Intent();
			intent.setClass(Activity_Frt.this,Activity_Main.class);
			Activity_Frt.this.startActivity(intent);
		}
	}
}