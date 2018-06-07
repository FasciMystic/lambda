package com.example.damo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PredicateTest {

    public static void main(String[] args) {
    	//测试一
		List<Person> people=new ArrayList<>();
	    people.add(new Person(1, "小白", 19, "暑假"));
	    people.add(new Person(2, "小蓝", 10, "暑假"));
	    people.add(new Person(3, "小绿", 2, "暑假"));
	    people.add(new Person(4, "小红", 10, "暑假"));
	    
	   
		List<Person> list1=findMatchPerson(people,p->p.getAge()==10);
		System.out.println(list1);
		for(Person pp:list1) {
			System.out.println("年龄为10的人为："+pp.getName());
		}
		
		//测试二
		int sum=mapSum0(people, Person::getAge);
		//测试三
		List<Car> cars=new ArrayList<>();
		for(int i=0;i<5;i++) {
			Car car=new Car();
		    car.setPrice(10000+i*10000+i*10);
		    cars.add(car);
		}
		
		int c=mapSum(cars, Car::getPrice);
		System.out.println("所有小汽车的价格为："+c);
		
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
	//练习和使用function   泛型
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
//输出大于5的数字
List<Integer> result = predicateTest.conditionFilter(list, integer -> integer > 5);
result.forEach(System.out::println);
System.out.println("-------");
//输出大于等于5的数字
result = predicateTest.conditionFilter(list, integer -> integer >= 5);
result.forEach(System.out::println);
System.out.println("-------");
//输出小于8的数字
result = predicateTest.conditionFilter(list, integer -> integer < 8);
result.forEach(System.out::println);
System.out.println("-------");
//输出所有数字
result = predicateTest.conditionFilter(list, integer -> true);
result.forEach(System.out::println);
System.out.println("-------");
}
//高度抽象的方法定义，复用性高
public List<Integer> conditionFilter(List<Integer> list, Predicate<Integer> predicate){
return list.stream().filter(predicate).collect(Collectors.toList());
}*/
