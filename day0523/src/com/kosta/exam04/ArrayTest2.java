package com.kosta.exam04;

import java.util.ArrayList;

class Person{
	String name;
	int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public void sayHello() {
		System.out.println("hello," +name);
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}


/**
 * 	ArrayList list = new ArrayList();
 * 	와 같이 리스트를 생성하면 리스트에 
 *  온갖 자료형을 담을 수 있어요. 
 *  처음에는 이것이 좋은 줄로만 알았는데 
 * 	컬렉션을 경험 해 보니 결코 좋은것이 아니다 라는 것을 느끼게 됩니다. 
 * 	만약 리스트에 Person도 담고 Shape도 담고 
 *  또, Employee도 담고..  등 
 *  이렇게 되었을 때 리스트에 담긴 데이터의 수 만큼 반복하여 
 *  결국은 그 요소에 따라 일처리를 시켜야 하는데 
 *  각각 자료형이 다르면 일일이 instanceOf 연산자로 물어보고 
 *  형변환  한 후에 해당 클래스이 메소드를 호출해야하는 것은 상당히 
 *  번거러운 일입니다. 
 *  가능하면 Object보다는 내가만든 클래스의 
 *  상속관계에 범위를 제한하도록 권장한다 
 *  즉, 리스트에 담는 자료형은 제한하도록 합니다. 
 *  이것을 "제네릭" 이라고 합니다. 
 *  
 *  ArrayList<Person>  list = new ArrayList<Person>();
 */

public class ArrayTest2 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(100);
		list.add("java");
		list.add(true);
		list.add(new Person("홍길동", 20));
		list.add(2024);
		list.add(new Person("이순신",21));
		for(int i = 0; i < list.size(); i++){
			Object obj = list.get(i);
			System.out.println(obj);
			if(obj instanceof Person) {
				((Person)obj).sayHello();
			}
		}
	}
}
