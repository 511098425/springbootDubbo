package org.dubbo.test.consumer;

import java.io.IOException;
import java.util.List;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jsbn.wedding.bus.common.Result;
import com.jsbn.wedding.bus.entity.scheme.Scheme;
import com.jsbn.wedding.bus.service.PlanService;

@SpringBootApplication
public class DubboTestConsumerApplication {

	private static ClassPathXmlApplicationContext context;

	public static void main(String[] args) throws IOException {
		context = new ClassPathXmlApplicationContext(
				new String[] { "classpath:dubbo-consumer.xml" });
		context.start();
/*
		RegistApiService registApiService = (RegistApiService) context.getBean("registApiService"); // 获取远程服务代理
		String hello = registApiService.registerService("注册服务"); // 执行远程方法

		System.out.println(hello); // 显示调用结果
		System.in.read(); */
		
		PlanService planService=(PlanService) context.getBean("planService");
		Result result=planService.getSchemeList();
		List<Scheme>list=(List<Scheme>) result.getData();
		for (Scheme scheme : list) {
			System.out.println("--------"+scheme.getGroom()+"--------"+scheme.getBride()+"-----"+scheme.getHotel());
		}
	}
}
