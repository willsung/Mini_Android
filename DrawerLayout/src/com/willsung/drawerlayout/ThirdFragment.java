package com.willsung.drawerlayout;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

public class ThirdFragment extends Fragment{
	private ListView listView;
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		View layout = inflater.inflate(R.layout.layout_third,null);
		listView = (ListView)layout.findViewById(R.id.thirdFragmentListView);
		MenuListViewAdapter adapter = new MenuListViewAdapter(getActivity(), ListBuiltUtils.getSubMapList(3));
		listView.setAdapter(adapter);
		return layout;
	}
}
