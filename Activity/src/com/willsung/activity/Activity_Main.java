package com.willsung.activity;

import java.util.Timer;
import java.util.TimerTask;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Activity_Main extends Activity{
	private static Boolean isExit = false;
	private Button myButton_main_1 = null;
	private Button myButton_main_2 = null;
	private Button myButton_main_3 = null;
	private Button myetButton = null;
	private EditText myet = null;
	//private TextView mytv_main = null;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tablelayout);
		
		myet = (EditText)findViewById(R.id.myet);
		
		myButton_main_1 = (Button)findViewById(R.id.myButton_main_1);
		myButton_main_1.setOnClickListener(new myButtonListener_1());
		myButton_main_2 = (Button)findViewById(R.id.myButton_main_2);
		myButton_main_2.setOnClickListener(new myButtonListener_2());
		myButton_main_3 = (Button)findViewById(R.id.myButton_main_3);
		myButton_main_3.setOnClickListener(new myButtonListener_3());
		
		myetButton = (Button)findViewById(R.id.myetButton);	
		myetButton.setOnClickListener(new myetButtonListener());

	}

	class myetButtonListener implements OnClickListener{
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			String str = myet.getText().toString();
			if(str == null || str.equals("")){
				Toast.makeText(getApplicationContext(),"Thers's no input!",Toast.LENGTH_SHORT).show();
				return;
			}
			else{
				char temp = str.charAt(0);
				if(temp=='1' || temp=='2' || temp =='3'){
					String note = "Going to the No." + str + " Activity";
					Toast.makeText(getApplicationContext(),note,Toast.LENGTH_SHORT).show();
				}
				else{
					Toast.makeText(getApplicationContext(),"Input Error!",Toast.LENGTH_SHORT).show();
					return;
				}
			}
			if(str.charAt(0) == '1')
				Activity_Main.this.startActivity(new Intent(Activity_Main.this,Activity_Frt.class));
			else if(str.charAt(0) == '2')
				Activity_Main.this.startActivity(new Intent(Activity_Main.this,Activity_Sec.class));
			else if(str.charAt(0) == '3')
				Activity_Main.this.startActivity(new Intent(Activity_Main.this,Activity_Trd.class));
		}
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
	
	class myButtonListener_1 implements OnClickListener{
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent intent = new Intent();
			intent.setClass(Activity_Main.this,Activity_Frt.class);
			Activity_Main.this.startActivity(intent);
		}
	}
	class myButtonListener_2 implements OnClickListener{
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent intent = new Intent();
			intent.setClass(Activity_Main.this,Activity_Sec.class);
			Activity_Main.this.startActivity(intent);
		}
	}
	class myButtonListener_3 implements OnClickListener{
		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			Intent intent = new Intent();
			intent.setClass(Activity_Main.this,Activity_Trd.class);
			Activity_Main.this.startActivity(intent);
		}
	}
	@Override  
	public boolean onKeyDown(int keyCode, KeyEvent event) {
	    // TODO Auto-generated method stub  
	    if(keyCode == KeyEvent.KEYCODE_BACK)  
	    	if(event.getAction() == KeyEvent.ACTION_DOWN && event.getRepeatCount() == 0)
	    	{    
	    		exitBy2Click();
	    	}  
	    return false;  
	}
	private void exitBy2Click() {
	    Timer tExit = null;  
	    if (isExit == false) {  
	        isExit = true;
	        Toast.makeText(this, "Once more to exit!", Toast.LENGTH_SHORT).show();  
	        tExit = new Timer();  
	        tExit.schedule(new TimerTask() {  
	            @Override  
	            public void run() {  
	                isExit = false;
	            }  
	        }, 1500);
	  
	    } else {  
	        finish();  
	        System.exit(0);  
	    }
	}
}