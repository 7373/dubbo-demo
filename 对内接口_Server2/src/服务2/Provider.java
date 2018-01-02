package 服务2;

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
        Server1_Service server1_Service = (Server1_Service)context.getBean("server1"); // 获取远程服务代理
//        String hello = demoService.sayHello("tom"); // 执行远程方法
// 
//        System.out.println( hello ); // 显示调用结果
        
        //集合传递测试
        List<User> list = server1_Service.getUsers();
        if(list != null && list.size()>0){
        	for(int i=0;i<list.size();i++){
        		User u = (User)list.get(i);
        		System.out.println("姓名："+u.getName()+"--年龄："+u.getAge()+"性别："+u.getSex());
        	}
        }
        System.in.read(); // 按任意键退出
    }
 
}