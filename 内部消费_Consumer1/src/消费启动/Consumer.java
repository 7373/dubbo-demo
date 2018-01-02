package ��������;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.User;
import service.Server2_Service;

	public class Consumer {
	 
	    public static void main(String[] args) throws Exception {
	        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
	        context.start();
	 
	        Server2_Service demoService = (Server2_Service)context.getBean("server2"); // ��ȡԶ�̷������
//	        String hello = demoService.sayHello("tom"); // ִ��Զ�̷���
//	 
//	        System.out.println( hello ); // ��ʾ���ý��
	        
	        //���ϴ��ݲ���
	        List list = demoService.getUsers();
	        if(list != null && list.size()>0){
	        	for(int i=0;i<list.size();i++){
	        		User u = (User)list.get(i);
	        		System.out.println("������"+u.getName()+"--���䣺"+u.getAge()+"�Ա�"+u.getSex());
	        	}
	        }
	        
	    }
	 
	}