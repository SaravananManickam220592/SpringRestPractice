package com.example.SpringRestExample.interceptor;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import org.springframework.stereotype.Component;


@Component
public class AppFilter implements Filter {
	
	int hitsCount;
	
	@Override
	public void init(FilterConfig filterconfig) throws ServletException{
		hitsCount =0;
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		hitsCount++;
		
//		System.out.println(request.getRemoteHost());
//		System.out.println(request.getLocalName());
//		System.out.println(request.getLocale());
		
		chain.doFilter(request, response);
		
	}
	
	
}
