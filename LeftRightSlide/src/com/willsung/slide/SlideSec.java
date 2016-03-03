package com.willsung.slide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SlideSec extends Activity {
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.sec_main);
		Button button_forward = (Button)findViewById(R.id.forward);
        button_forward.setOnClickListener(new View.OnClickListener() {	
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(SlideSec.this, SlideTrd.class);
				startActivity(intent);
				overridePendingTransition(R.anim.in_from_right,R.anim.out_to_left);								
			}
		});
        
        Button button_back = (Button)findViewById(R.id.back);
        button_back.setOnClickListener(new View.OnClickListener() {	
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(SlideSec.this, SlideFrt.class);
				startActivity(intent);
				overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);
				}
		});
	}

}
