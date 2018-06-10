package com.example.damo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class mapTest {
	/*//list����
	public static void main(String[] args) {
	  List<String> list=new ArrayList<>();
	  list.add("123");
      list.add("qwe");
      list.add("err");
      System.out.println("1.forѭ��");
      for(int i=0;i<list.size();i++) {
    	  System.out.println(list.get(i));
      }
      System.out.println("2.iterate:");
      Iterator ite=list.iterator();
      while(ite.hasNext()) {
    	  System.out.println(ite.next());
      }
      System.out.println("3.for each");
      for(String string:list) {
    	  System.out.println(string);
      }
     
	}*/
	
	public static void main(String[] args) {
		Map<String, Integer> temap=new HashMap<String, Integer>();
		temap.put("as", 12);
		temap.put("ed", 90);
		temap.put("qa", 67);
		System.out.println("1.��������һ hashmap entrySet() ���� :");
		Iterator it=temap.entrySet().iterator();
		while(it.hasNext()) {
		Map.Entry entry=(Map.Entry) it.next();
		Object key=entry.getKey();
		Object value=entry.getValue();
		System.out.println("key="+key+",value="+value);
		
		}
		System.out.println("");
		
		
		System.out.println("2.���������� Ӧ��������For-Eachѭ��: ");
		for(Map.Entry<String,Integer> entry:temap.entrySet()) {
			String key=entry.getKey().toString();
			String value=entry.getValue().toString();
			System.out.println("key="+key+",value="+value);
		}
		System.out.println("");
		
		System.out.println("3.���������� hashmap keySet() ���� :");
		for(Iterator i=temap.keySet().iterator();i.hasNext();) {
			Object obj=i.next();
			System.out.println(obj);//ѭ�����key
			System.out.println("key=" + obj + ",value=" + temap.get(obj));  
		}
		for(Iterator i=temap.values().iterator();i.hasNext();) {
			Object obj=i.next();
			System.out.println(obj);//ѭ�����value
		}
		
		System.out.println("���������� treemap keySet()���� :");
		for (Object o:temap.keySet()) {
			System.out.println("key=" + o + ",value=" + temap.get(o));
		}
		
		
		System.out.println("java ����Map <String, ArrayList> map = new HashMap<String, ArrayList>();"); 
		Map<String, ArrayList> map=new HashMap<String,ArrayList>();
		Set<String> keys=map.keySet();
		Iterator<String> ite=keys.iterator();
		while(ite.hasNext()) {
			String key=ite.next();
			ArrayList arrayList=map.get(key);
			for(Object o:arrayList) {
				System.out.println(o);
			}
		}
		
		Map<String, List> map1=new HashMap<String,List>();
		for(Map.Entry entry:map1.entrySet()) {
			String key=entry.getKey().toString();
			List<String> list=(List)entry.getValue();
			for(String value:list) {
			System.out.println(key + "====" + value);
			}
		}
		
	}
	
}
