package com.foo.springcloud.zuul.filter;


import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
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
        return Optional.ofNullable(context.getRequest().getParameter("token"))
                .orElseGet(() -> {
                    context.setSendZuulResponse(false);
                    context.setResponseStatusCode(401);
                    try {
                        context.getResponse().getWriter().write("token is empty");
                    } catch (Exception e) {
                        context.set("error.status_code", HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
                        context.set("error.exception", e);
                    }
                    return null;
                });
    }
}
