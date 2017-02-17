package cn.zto.test;
import cn.zto.consumer.ConsumerThd;
public class ClientTest {
	public static void main(String[] args) throws Exception{

		int i=0;    	
		while(i++<1){    	
			ConsumerThd thd=new ConsumerThd();
			thd.sayHello();
			Thread.sleep(1000);
		}


	}}