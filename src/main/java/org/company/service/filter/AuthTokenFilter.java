package org.company.service.filter;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.company.service.config.AuthFilterCondition;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

/**
 * ValidateAuthTokenAspect
 * It is used for wiring the advice on the custom annotation(validateAuthToken),
 * check if the token is present and validate it else throw exception
 * */
@Aspect
@Component
@Conditional(AuthFilterCondition.class)
public class AuthTokenFilter {

    public static final String ACCESS_TOKEN_HEADER = "accessToken";

    @Before("@annotation(org.company.service.annotation.ValidateAuthToken)")
    public void doBefore(JoinPoint joinPoint) {
        System.out.println("Reaching Aspect");
    }
}
