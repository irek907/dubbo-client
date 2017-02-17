package cn.zto.service.impl;
import cn.zto.service.IProcessData;
public class ProcessDataImpl implements IProcessData {
	public String hello(String name) {
		System.out.println(name);
		return "hello : " + name;
	}

	@Override
	public String sayType(String language) {
		// TODO Auto-generated method stub
		System.out.println("say:"+language);
		return null;
	}}