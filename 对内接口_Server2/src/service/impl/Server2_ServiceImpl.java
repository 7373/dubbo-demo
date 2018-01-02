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
		 u1.setName("这里是对内接口在提供服务");
		 u1.setAge(20);
		 u1.setSex("男");
		 
		 User u2 = new User();
		 u2.setName("这里是对内接口在提供服务");
		 u2.setAge(21);
		 u2.setSex("男");
		 
		 User u3 = new User();
		 u3.setName("这里是对内接口在提供服务");
		 u3.setAge(19);
		 u3.setSex("女");
		 
		 list.add(u1);
		 list.add(u2);
		 list.add(u3);
	     return list;
	 }
}
