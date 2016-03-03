package com.willsung.activity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Activity_Sec extends Activity {
	private Button myButton_sec_back = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sec);

		myButton_sec_back = (Button)findViewById(R.id.myButton_sec_back);
		myButton_sec_back.setOnClickListener(new myButtonListener_Sec_Back());
	}
	
	class myButtonListener_Sec_Back implements OnClickListener{
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent intent = new Intent();
			intent.setClass(Activity_Sec.this,Activity_Main.class);
			Activity_Sec.this.startActivity(intent);
		}
	}
}