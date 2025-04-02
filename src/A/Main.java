package A;

import java.util.HashSet;
import java.util.Objects;

class Person {
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public String toString() {
		return name + "(" + age + "세)";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Person )) return false;
		
		Person p = (Person)obj;
		
		return this.name.equals(p.name) && this.age == p.age;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}
}

public class Main {
    public static void main(String[] args) {
        HashSet<Person> people = new HashSet<>();
        
        people.add(new Person("홍길동", 25));
        people.add(new Person("홍길동", 25));
        people.add(new Person("이몽룡", 30));
        
        System.out.println(people);
    }
}


