package 服务1;

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

		DemoService demoService = (DemoService) context.getBean("demoService"); // 获取远程服务代理
		System.out.println(demoService);
		// String hello = demoService.sayHello("tom"); // 执行远程方法
		//
		// System.out.println( hello ); // 显示调用结果

		// 集合传递测试
		List<User> list = demoService.getUsers();
		if (list != null && list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				User u = (User) list.get(i);
				System.out.println("姓名：" + u.getName() + "--年龄：" + u.getAge() + "性别：" + u.getSex());
			}
		}
		System.in.read(); // 按任意键退出

	}

}