package com.demomic.license.impl.controller.filter;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;

import java.io.IOException;

import static com.demomic.license.impl.controller.filter.UserContext.CORRELATION_ID;

@Component
public class UserContextFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpRequest = (HttpServletRequest) servletRequest;

        UserContextHolder.getContext()
                .setCorrelationId(httpRequest.getHeader(CORRELATION_ID));

        filterChain.doFilter(servletRequest, servletResponse);
    }
}
