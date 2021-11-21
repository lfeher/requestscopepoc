package com.lfeher.requestscopepoc.config;

import com.lfeher.requestscopepoc.model.OrganizationData;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Component
@Slf4j
public class OrganizationFilter extends GenericFilterBean {

    @Autowired
    private OrganizationData organizationData;

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        final HttpServletRequest request = (HttpServletRequest) servletRequest;
        final String customer = request.getHeader("customer");

        log.info("[organization filter] doFilter > customer: {}", customer);
        organizationData.setName(customer);

        filterChain.doFilter(servletRequest, servletResponse);
    }
}
