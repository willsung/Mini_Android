package com.willsung.drawerlayout;

import java.util.HashMap;  
import java.util.List;  
import java.util.Map;  
   
import android.content.Context;  
import android.view.LayoutInflater;  
import android.view.View;  
import android.view.ViewGroup;  
import android.widget.BaseAdapter;  
import android.widget.TextView;  
   
public class MenuListViewAdapter extends BaseAdapter { 
	
	//����һ���б�List�������洢HashMap��HashMap�е�key��String��valueҲ��String
    private List<HashMap<String, String>> lists;  
    
    //Inflater��������xml�����ļ������ǵ��õĲ����ļ������ص�
    private LayoutInflater mInflater;  
    
    //��������������List����ӳ�䵽View�в���ʾ����
    public MenuListViewAdapter(Context context, List<HashMap<String, String>> dataList) {  
        //��Context�л��һ������������������Ϳ���ʹ��������������xml�����ļ�תΪView����
    	mInflater = LayoutInflater.from(context);  
        lists = dataList;  
    }  
   
    @Override 
    public int getCount() {  
        return lists.size();  
    }  
   
    @Override 
    public Object getItem(int position) {  
        return lists.get(position);  
    }  
   
    @Override 
    public long getItemId(int position) {  
        return position;  
    }  
   
    @Override 
public View getView(final int position, View convertView, ViewGroup parent) {  
        
    	//����һ��ViewHolder�������洢��ͬView��
    	ViewHolder holder = null;  
        if (convertView == null) {  
            holder = new ViewHolder();  
            //convertViewͨ��inflate���ó���Ҫ�Ĳ����ļ�
            convertView = mInflater.inflate(R.layout.main_listitem, null);  
            holder.menu = (TextView) convertView.findViewById(R.id.menu);  
            //setTag()�����ǽ������е����ݣ�Ҳ����View����ViewHolder
            convertView.setTag(holder);  
        } else {  
        	//getTag()�����ǽ�Ŀ��(Ҳ����ViewHolder)�е�����(Ҳ����View)ȡ����
            holder = (ViewHolder) convertView.getTag();  
        }  
        // ���ñ���ɫ  
        //������
        //if(position%2==1){  
        //	convertView.setBackgroundColor(Color.rgb(220, 220, 220));  
        //}
         //ż���� 
        //else {  
        //	convertView.setBackgroundColor(Color.rgb(255, 250, 250));  
        //} 
         
        if (lists.size() > 0) {  //�б�Ϊ��
            final Map<String, String> map = lists.get(position);  
            String number = map.get("menu");  
            holder.menu.setText(number);  
        }  
        return convertView;  
    }  
   
    static class ViewHolder {  
        TextView   menu;    //�˵�����  
    }  
}