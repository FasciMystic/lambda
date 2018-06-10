package com.example.stu;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class StudentSupplier implements Supplier<Student >{
   
	
	@Override
	public Student get() {
		//生成学生
		int[] scores = { 60, 70, 75, 80, 85, 90, 95, 100 };
		Student stu=null;
		
		String[] word = { "张", "琳", "霍", "清", "兰", "蓝", "雪", "飞", "冰", "若", "卢", "媚", "冬","鹏","楷"};
	    for(int i=1;i<=50;i++) {
	    	//从数组中随机取数值 int
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
