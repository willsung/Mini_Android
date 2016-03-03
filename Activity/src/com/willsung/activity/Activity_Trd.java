package com.willsung.activity;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Activity_Trd extends Activity {
	private Button myButton_trd_back = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_trd);

		myButton_trd_back = (Button)findViewById(R.id.myButton_trd_back);
		myButton_trd_back.setOnClickListener(new myButtonListener_TRd_Back());
	}
	
	class myButtonListener_TRd_Back implements OnClickListener{
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent intent = new Intent();
			intent.setClass(Activity_Trd.this,Activity_Main.class);
			Activity_Trd.this.startActivity(intent);
		}
	}
}