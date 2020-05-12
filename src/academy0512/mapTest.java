package academy0512;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
class Person{
	public String name;
	public int age;
	public Person(int age,String name) {
		super();
		this.age = age;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
}

public class mapTest {

	public static void main(String[] args) {
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		hm.put("���",30);
		hm.put("��",10);
		hm.put("���",40);
		hm.put("����",50);
		System.out.println(hm.keySet());
		System.out.println("1---------------------------");
		for(String key : hm.keySet()) {
			System.out.println(key);
		}
		hm.remove("���");
		System.out.println("2---------------------------");
		Iterator<String> keys = hm.keySet().iterator();
		while(keys.hasNext()) {
			String key = keys.next();
			System.out.println(String.format("key:%s value:%d", key,hm.get(key)));
		}
		System.out.println("3---------------------------");
		hm.replace("����", 500);//����.
		for(String key : hm.keySet()) {
			System.out.println(String.format("key:%s value:%d", key,hm.get(key)));
		}
		System.out.println("4---------------------------");
		System.out.println("������: "+hm.size());
		System.out.println("5---------------------------");
		System.out.println(hm.values());
		System.out.println("6---------------------------");
		HashMap<Person,String> p = new HashMap<Person,String>();
		p.put(new Person(20,"��ö��"),"�ѱ���");
		p.put(new Person(30,"��ȥ��"),"ȥ����");
		p.put(new Person(40,"Tom"),"������");
		for(Person key : p.keySet()) {
			System.out.println(String.format("key:%s value:%s", key,p.get(key)));
		}
	}

	

}
