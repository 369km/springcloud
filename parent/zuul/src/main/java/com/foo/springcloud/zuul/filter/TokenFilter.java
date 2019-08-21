package com.foo.springcloud.zuul.filter;


import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;
import java.util.Optional;

@Component
public class TokenFilter extends ZuulFilter {
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        RequestContext context = RequestContext.getCurrentContext();
        try {
            Optional.ofNullable(context.getRequest().getParameter("token")).orElseThrow(() -> new RuntimeException("token not exist"));
        } catch (Exception e) {
            context.set("error.status_code", HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
            context.set("error.exception", e);
        }
        return null;
    }
}
