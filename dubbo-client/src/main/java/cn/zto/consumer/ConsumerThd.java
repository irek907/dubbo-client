package cn.zto.consumer;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tangzongyun.facade.user.IUserService;

public class ConsumerThd{
	public void sayHello() throws Exception{
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(	
				new String[] {"applicationConsumer.xml"});
		context.start();
		IUserService demoService=(IUserService) context.getBean("com.tangzongyun.facade.user.IUserService");
		System.out.println(demoService.findOne("1"));
	}
	public static void main(String[] args) throws Exception {
		/*String a = "com.tangzongyun.facade.user.IUserService";
		String methodname = "findOne";
		String pvalue = "1";

		Object object=Class.forName(a);
		System.out.println(object);

		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(	
				new String[] {"applicationConsumer.xml"});
		context.start();

		Object demoService=(Object) context.getBean("com.tangzongyun.facade.user.IUserService");

		Class c = Class.forName(a);//得到对象
		
		System.out.println(c);
		
		Object obj=demoService;//获取到方法对象,假设方法的参数是一个int,String,method名为getAge
		
		System.out.println(obj);
		
		Method s1 = c.getMethod(methodname, new Class[] {String.class});
		//获得参数Object
		Object[] arguments = new Object[]{new String("1")};
		//执行方法
		Object s=s1.invoke(obj , arguments);
		System.out.println(s);
		*/
		test("com.tangzongyun.facade.user.IUserService","findOne","1");

	}	
	/**
	 * 
	 * @param iName
	 * @param mName
	 * @param pValue json字符串
	 * 返回json字符串
	 * @throws NoSuchMethodException
	 * @throws SecurityException
	 * @throws ClassNotFoundException
	 * @throws IllegalAccessException
	 * @throws IllegalArgumentException
	 * @throws InvocationTargetException
	 */
	public static void test(String iName,String mName,String pValue) throws NoSuchMethodException, SecurityException, ClassNotFoundException, IllegalAccessException, IllegalArgumentException, InvocationTargetException{
		
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(	
				new String[] {"applicationConsumer.xml"});
		context.start();
		Object getInstance=(Object) context.getBean(iName);
		
		//通过class获取方法
		Class cLass = Class.forName(iName);//得到class
		Method s1 = cLass.getMethod(mName, new Class[] {String.class});
		
		
		//参数列表
		Object[] arguments = new Object[]{new String("1")};
		//执行方法
		Object s=s1.invoke(getInstance , arguments);
		//
		System.out.println(s);
	}

}