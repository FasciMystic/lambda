package com.example.stu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.example.damo.Predicate;
/**
 * 定义student 类。创建50个学生实例，成绩采用赋分制，每个学生的成绩只能从scores数组中、
 * 挑选，
 * 用Stream和lambd表达式实现学生成绩分组统计，统计结果包括
 * 每种分数总共有多少学生，并输出学生的姓名和编号。
 * @author Lenovo123
 *
 */
public class Sample3 {

	public static void main(String[] args) {
		
		//使用Stream.generate()创建50个学生实例并存入List
		List<Student> stulist = new ArrayList<>();
		Object[] students=Stream.generate(new StudentSupplier()).limit(50).toArray();
		for(Object object:students) {
			stulist.add((Student)object);
		}
		

	//  List<Student> list1=findSameScore(stulist, p->p.getScore()==60);
	// 根据分数分组
	//按成绩将学生分组存入Map——key为成绩，value为List<Student>
	 Map<Integer,List<Student>> map=stulist.stream().collect(Collectors.groupingBy(Student::getScore));
	 for(Integer i:map.keySet()) {
		 System.out.printf("%d分的学生有%d人，分别是：\n", i, map.get(i).size());
		 System.out.println("学号\t姓名");
		 //显示每组的学生信息
		 map.get(i).stream().forEach(x->System.out.println(x.getId() + "\t" + x.getName()));
		 System.out.println("======================");
	 }
}
	 

	// collector学生分组
	public static List<Student> findSameScore(List<Student> list, Predicate<Student> predict) {
		// 符合条件数组
		List<Student> oklist = new ArrayList<>();
		for (Student stu : list) {
			if (predict.test(stu)) {
				oklist.add(stu);
			}
		}
		return oklist;

	}

}
