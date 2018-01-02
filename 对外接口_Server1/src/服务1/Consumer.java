package ����1;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.User;
import service.DemoService;
import service.Server1_Service;
import service.impl.Server1_ServiceImpl;

public class Consumer {

	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] {"consumer1.xml","applicationContext.xml"});
		context.start();

		DemoService demoService = (DemoService) context.getBean("demoService"); // ��ȡԶ�̷������
		System.out.println(demoService);
		// String hello = demoService.sayHello("tom"); // ִ��Զ�̷���
		//
		// System.out.println( hello ); // ��ʾ���ý��

		// ���ϴ��ݲ���
		List<User> list = demoService.getUsers();
		if (list != null && list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				User u = (User) list.get(i);
				System.out.println("������" + u.getName() + "--���䣺" + u.getAge() + "�Ա�" + u.getSex());
			}
		}
		System.in.read(); // ��������˳�

	}

}