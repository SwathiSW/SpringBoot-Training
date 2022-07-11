package com.springboot_zuul_api_gateway_server;

import org.springframework.stereotype.Component;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;

@Component
public abstract class CustomZuulFilter extends ZuulFilter {

	@Override
	public Object run() {
		RequestContext ctx = RequestContext.getCurrentContext();
		ctx.addZuulRequestHeader("Test", "TestSample");
		return null;
	}

	@Override
	public boolean shouldFilter() {
		return true;
	}
}
