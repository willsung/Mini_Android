package com.willsung.activity;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Activity_Frt extends Activity {
	private Button myButton_frt_back = null;
	private Button myButton_play = null;
	private Button myButton_stop = null;
	private MediaPlayer mPlayer = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_frt);

		myButton_frt_back = (Button) findViewById(R.id.myButton_frt_back);
		myButton_play = (Button) findViewById(R.id.myButton_play);
		myButton_stop = (Button) findViewById(R.id.myButton_stop);

		mPlayer = MediaPlayer.create(this, R.raw.canon);
		myButton_frt_back.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent intent = new Intent();
				intent.setClass(Activity_Frt.this, Activity_Main.class);
				Activity_Frt.this.startActivity(intent);
			}
		});

		myButton_play.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					if (mPlayer.isPlaying()) {
						Toast.makeText(getApplicationContext(), "正在播放...", Toast.LENGTH_SHORT).show();
						return;
					}
					if (mPlayer != null) {
						mPlayer.stop();
					}
					mPlayer.prepare();
					mPlayer.start();
					myButton_play.setText("播放");
					Toast.makeText(getApplicationContext(), "开始...", Toast.LENGTH_SHORT).show();
				} catch (Exception e) {
					// TODO: handle exception
					Toast.makeText(getApplicationContext(), "Error!", Toast.LENGTH_LONG).show();
					e.printStackTrace();
				}
			}
		});
		myButton_stop.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				try {
					if (!mPlayer.isPlaying() && mPlayer!=null) {
						Toast.makeText(getApplicationContext(), "已经停止.", Toast.LENGTH_SHORT).show();
						return;
					}
					if (mPlayer != null) {
						mPlayer.stop();
						myButton_play.setText("开始");
						Toast.makeText(getApplicationContext(), "停止...", Toast.LENGTH_SHORT).show();
					}
				} catch (Exception e) {
					// TODO: handle exception
					Toast.makeText(getApplicationContext(), "Error!", Toast.LENGTH_LONG).show();
					e.printStackTrace();
				}
			}
		});
	}
}