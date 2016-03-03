package com.willsung.drawerlayout;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SubLIstButtons extends Activity implements OnClickListener{

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sublistbuttons);
		
		Button sulistbutton = (Button)findViewById(R.id.subListButton);
		sulistbutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
			}
		});
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		
	}
}
