package com.foo.zuul.filter;


import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

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
    public Object run() throws ZuulException {
        String token = RequestContext.getCurrentContext().getRequest().getParameter("token");
        Optional.ofNullable(token)
                .orElseGet(() -> {
                    RequestContext.getCurrentContext().setSendZuulResponse(false);
                    RequestContext.getCurrentContext().setResponseStatusCode(401);
                    return null;
                });
        return null;
    }
}
