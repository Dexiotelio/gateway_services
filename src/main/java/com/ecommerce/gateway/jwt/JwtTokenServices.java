package com.ecommerce.gateway.jwt;

import org.springframework.stereotype.Service;

@Service
public class JwtTokenServices {
    private final String SECRET_KEY;
    private final long EXPIRATION_TIME = 15 * 60 * 1000;
}
