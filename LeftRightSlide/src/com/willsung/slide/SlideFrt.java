package com.willsung.slide;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SlideFrt extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.frt_main);   
        Button button_forward = (Button)findViewById(R.id.forward);
        button_forward.setOnClickListener(new View.OnClickListener() {	
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(SlideFrt.this, SlideSec.class);
				startActivity(intent);
				overridePendingTransition(R.anim.in_from_right, R.anim.out_to_left);						
				}
		});
        
        Button button_back = (Button)findViewById(R.id.back);
        button_back.setOnClickListener(new View.OnClickListener() {	
			@Override
			public void onClick(View v) {
				Intent intent = new Intent();
				intent.setClass(SlideFrt.this, SlideTrd.class);
				startActivity(intent);
				overridePendingTransition(R.anim.in_from_left, R.anim.out_to_right);		
				}
		});
    }
    public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		menu.add(0, 1, 1, R.string.exit);
		menu.add(0, 2, 2, R.string.about);
		return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if(item.getItemId() == 1){
			finish();
		}
		if(item.getItemId() == 2){
			Toast.makeText(getApplicationContext(),"This is my TEST app.",Toast.LENGTH_SHORT).show();
		}
		return super.onOptionsItemSelected(item);
	}
}