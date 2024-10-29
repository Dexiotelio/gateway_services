package com.ecommerce.gateway.filer;

import com.ecommerce.gateway.jwt.JwtTokenServices;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class JwtFiler extends OncePerRequestFilter {
    private final JwtTokenServices jwtTokenServices;

    @Autowired
    public JwtFiler(JwtTokenServices jwtTokenServices) {
        this.jwtTokenServices = jwtTokenServices;
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

    }
}
