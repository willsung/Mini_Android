package com.willsung.drawerlayout;

import java.util.ArrayList;  
import java.util.HashMap;
   
public class ListBuiltUtils {  
   
	//������ѡ��������
    public static ArrayList<HashMap<String,String>> getMainMapList(){  
        ArrayList<HashMap<String, String>> tempMapList = new ArrayList<HashMap<String,String>>();  
           
        for(int i=0;i<3;i++){  
            HashMap<String, String> tempMap = new HashMap<String, String>();  
            tempMap.put("menu", "����˵� "+(i+1));  
            tempMapList.add(tempMap);  
        }  
        return tempMapList;  
    }  
    
    //����ÿһ����ó���ҳ����ѡ��������
    public static ArrayList<HashMap<String,String>> getFirstMapList(){  
        ArrayList<HashMap<String, String>> tempMapList = new ArrayList<HashMap<String,String>>();  
           
        for(int i=0;i<2;i++){  
            HashMap<String, String> tempMap = new HashMap<String, String>();  
            tempMap.put("menu", "FirstFragmentѡ�� "+(i+1));  
            tempMapList.add(tempMap);  
        }  
        return tempMapList;  
    }  
    
    public static ArrayList<HashMap<String,String>> getSecondMapList(){  
        ArrayList<HashMap<String, String>> tempMapList = new ArrayList<HashMap<String,String>>();  
           
        for(int i=0;i<2;i++){  
            HashMap<String, String> tempMap = new HashMap<String, String>();  
            tempMap.put("menu", "SecondFragment�˵�  "+(i+1));  
            tempMapList.add(tempMap);  
        }  
        return tempMapList;  
    } 
}
