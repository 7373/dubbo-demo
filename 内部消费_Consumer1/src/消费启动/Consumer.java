package 消费启动;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import model.User;
import service.Server2_Service;

	public class Consumer {
	 
	    public static void main(String[] args) throws Exception {
	        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
	        context.start();
	 
	        Server2_Service demoService = (Server2_Service)context.getBean("server2"); // 获取远程服务代理
//	        String hello = demoService.sayHello("tom"); // 执行远程方法
//	 
//	        System.out.println( hello ); // 显示调用结果
	        
	        //集合传递测试
	        List list = demoService.getUsers();
	        if(list != null && list.size()>0){
	        	for(int i=0;i<list.size();i++){
	        		User u = (User)list.get(i);
	        		System.out.println("姓名："+u.getName()+"--年龄："+u.getAge()+"性别："+u.getSex());
	        	}
	        }
	        
	    }
	 
	}