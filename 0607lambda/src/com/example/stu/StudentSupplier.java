package com.example.stu;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class StudentSupplier implements Supplier<Student >{
   
	
	@Override
	public Student get() {
		//����ѧ��
		int[] scores = { 60, 70, 75, 80, 85, 90, 95, 100 };
		Student stu=null;
		
		String[] word = { "��", "��", "��", "��", "��", "��", "ѩ", "��", "��", "��", "¬", "��", "��","��","��"};
	    for(int i=1;i<=50;i++) {
	    	//�����������ȡ��ֵ int
	    int index=(int)(Math.random()*scores.length); 
	    String name="";
		   for (int a = 0; a < 3; a++) {
				int j = (int) (Math.random() * word.length);
				name+= word[j];
			}
		 stu=new Student(i, name, scores[index]);
		 
	   // System.out.println(stu.getName()+" "+stu.getScore()); 
	   }
		
	   return stu;
	}
	
	

   
}
