package com.example.damo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PredicateTest {

    public static void main(String[] args) {
    	//����һ
		List<Person> people=new ArrayList<>();
	    people.add(new Person(1, "С��", 19, "���"));
	    people.add(new Person(2, "С��", 10, "���"));
	    people.add(new Person(3, "С��", 2, "���"));
	    people.add(new Person(4, "С��", 10, "���"));
	    
	   
		List<Person> list1=findMatchPerson(people,p->p.getAge()==10);
		System.out.println(list1);
		for(Person pp:list1) {
			System.out.println("����Ϊ10����Ϊ��"+pp.getName());
		}
		
		//���Զ�
		int sum=mapSum0(people, Person::getAge);
		//������
		List<Car> cars=new ArrayList<>();
		for(int i=0;i<5;i++) {
			Car car=new Car();
		    car.setPrice(10000+i*10000+i*10);
		    cars.add(car);
		}
		
		int c=mapSum(cars, Car::getPrice);
		System.out.println("����С�����ļ۸�Ϊ��"+c);
		
	}

    /**
     * @param list
     */
	private static List<Person> findMatchPerson(List<Person> list, Predicate<Person> predict) {
		List<Person> list2=new ArrayList<>();
		for(Person person:list) {
			if(predict.test(person)) {
				list2.add(person);
			}
		}
		return list2;
	}
	//��ϰ��ʹ��function   ����
      public static<T> int mapSum0(List<T> entries,Function<T,Integer> f) {
		int sum=0;
		for(T entry:entries) {
			sum+=f.apply(entry);
		}
		return sum;
		
	}
    
	public static<Car> int mapSum(List<Car> entries,Function<Car,Integer> f) {
		int sum=0;
		for(Car entry:entries) {
			sum+=f.apply(entry);
		}
		return sum;
		
	}


	

}





/*  public static void main(String[] args) {
List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
PredicateTest predicateTest = new PredicateTest();
//�������5������
List<Integer> result = predicateTest.conditionFilter(list, integer -> integer > 5);
result.forEach(System.out::println);
System.out.println("-------");
//������ڵ���5������
result = predicateTest.conditionFilter(list, integer -> integer >= 5);
result.forEach(System.out::println);
System.out.println("-------");
//���С��8������
result = predicateTest.conditionFilter(list, integer -> integer < 8);
result.forEach(System.out::println);
System.out.println("-------");
//�����������
result = predicateTest.conditionFilter(list, integer -> true);
result.forEach(System.out::println);
System.out.println("-------");
}
//�߶ȳ���ķ������壬�����Ը�
public List<Integer> conditionFilter(List<Integer> list, Predicate<Integer> predicate){
return list.stream().filter(predicate).collect(Collectors.toList());
}*/
