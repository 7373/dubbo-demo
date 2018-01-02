package ����2;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.User;
import service.Server1_Service;
import service.Server2_Service;

public class Provider {
 
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {
        		"consumer2.xml",
        		"applicationContext.xml",
        		});
        context.start();
        Server1_Service server1_Service = (Server1_Service)context.getBean("server1"); // ��ȡԶ�̷������
//        String hello = demoService.sayHello("tom"); // ִ��Զ�̷���
// 
//        System.out.println( hello ); // ��ʾ���ý��
        
        //���ϴ��ݲ���
        List<User> list = server1_Service.getUsers();
        if(list != null && list.size()>0){
        	for(int i=0;i<list.size();i++){
        		User u = (User)list.get(i);
        		System.out.println("������"+u.getName()+"--���䣺"+u.getAge()+"�Ա�"+u.getSex());
        	}
        }
        System.in.read(); // ��������˳�
    }
 
}