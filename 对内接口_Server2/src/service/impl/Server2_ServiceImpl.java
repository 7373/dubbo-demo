package service.impl;

import java.util.ArrayList;
import java.util.List;

import model.User;
import service.Server2_Service;

public class Server2_ServiceImpl implements Server2_Service{
	
	 public String sayHello(String name) {
	        return "Hello " + name;
	 }
	 public List getUsers() {
		 List<User> list = new ArrayList<User>();
		 User u1 = new User();
		 u1.setName("�����Ƕ��ڽӿ����ṩ����");
		 u1.setAge(20);
		 u1.setSex("��");
		 
		 User u2 = new User();
		 u2.setName("�����Ƕ��ڽӿ����ṩ����");
		 u2.setAge(21);
		 u2.setSex("��");
		 
		 User u3 = new User();
		 u3.setName("�����Ƕ��ڽӿ����ṩ����");
		 u3.setAge(19);
		 u3.setSex("Ů");
		 
		 list.add(u1);
		 list.add(u2);
		 list.add(u3);
	     return list;
	 }
}
