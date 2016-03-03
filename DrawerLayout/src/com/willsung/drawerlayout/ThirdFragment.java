package com.willsung.drawerlayout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class ThirdFragment extends Fragment{
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View view_layout = inflater.inflate(R.layout.layout_third,null);
		//TextView textView = (TextView) view_layout.findViewById(R.id.textView);
		return view_layout;
	}
}
