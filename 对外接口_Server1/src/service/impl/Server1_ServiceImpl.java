package service.impl;

import java.util.ArrayList;
import java.util.List;

import model.User;
import service.Server1_Service;

public class Server1_ServiceImpl implements Server1_Service{
	private static List<User> userList;
	
	 public List<User> getUsers() {
		 
		 List<User> list = new ArrayList<User>();
		 User u1 = new User();
		 u1.setName("�����Ƕ���ӿڣ���---");
		 u1.setAge(20);
		 u1.setSex("��");
		 
		 User u2 = new User();
		 u2.setName("�����Ƕ���ӿڣ���---");
		 u2.setAge(21);
		 u2.setSex("��");
		 
		 User u3 = new User();
		 u3.setName("�����Ƕ���ӿڣ���---");
		 u3.setAge(19);
		 u3.setSex("Ů");
		 
		 list.add(u1);
		 list.add(u2);
		 list.add(u3);
	     return list;
	 }
	 public  void setUsers(List<User> user){
		 userList=user;
	 }

}
