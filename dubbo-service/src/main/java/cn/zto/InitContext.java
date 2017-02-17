package cn.zto;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class InitContext implements ServletContextListener {

	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		
		System.out.println("================容器加载完成========================");
		
	}

	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
		System.out.println("...............销毁容器..........................");
		
	}

	

}
