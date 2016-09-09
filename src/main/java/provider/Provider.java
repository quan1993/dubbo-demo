package provider;

import java.io.IOException;

import org.I0Itec.zkclient.exception.ZkNoNodeException;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Provider {

	
	public static void main(String[] args) throws IOException {

		try{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
		context.start();
		context.registerShutdownHook();
		}catch(ZkNoNodeException e){
			
		}
		
		
		System.in.read();//为保证服务一直开着，利用输入流的阻塞模拟，这种方法块直到输入数据是可用的,才结束的流检测,或抛出异常。
		
		
	}

}
