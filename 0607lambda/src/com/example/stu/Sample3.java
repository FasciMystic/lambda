package com.example.stu;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.example.damo.Predicate;
/**
 * ����student �ࡣ����50��ѧ��ʵ�����ɼ����ø����ƣ�ÿ��ѧ���ĳɼ�ֻ�ܴ�scores�����С�
 * ��ѡ��
 * ��Stream��lambd���ʽʵ��ѧ���ɼ�����ͳ�ƣ�ͳ�ƽ������
 * ÿ�ַ����ܹ��ж���ѧ���������ѧ���������ͱ�š�
 * @author Lenovo123
 *
 */
public class Sample3 {

	public static void main(String[] args) {
		
		//ʹ��Stream.generate()����50��ѧ��ʵ��������List
		List<Student> stulist = new ArrayList<>();
		Object[] students=Stream.generate(new StudentSupplier()).limit(50).toArray();
		for(Object object:students) {
			stulist.add((Student)object);
		}
		

	//  List<Student> list1=findSameScore(stulist, p->p.getScore()==60);
	// ���ݷ�������
	//���ɼ���ѧ���������Map����keyΪ�ɼ���valueΪList<Student>
	 Map<Integer,List<Student>> map=stulist.stream().collect(Collectors.groupingBy(Student::getScore));
	 for(Integer i:map.keySet()) {
		 System.out.printf("%d�ֵ�ѧ����%d�ˣ��ֱ��ǣ�\n", i, map.get(i).size());
		 System.out.println("ѧ��\t����");
		 //��ʾÿ���ѧ����Ϣ
		 map.get(i).stream().forEach(x->System.out.println(x.getId() + "\t" + x.getName()));
		 System.out.println("======================");
	 }
}
	 

	// collectorѧ������
	public static List<Student> findSameScore(List<Student> list, Predicate<Student> predict) {
		// ������������
		List<Student> oklist = new ArrayList<>();
		for (Student stu : list) {
			if (predict.test(stu)) {
				oklist.add(stu);
			}
		}
		return oklist;

	}

}
