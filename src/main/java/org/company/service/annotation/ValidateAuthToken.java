package org.company.service.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import org.company.service.config.AuthFilterCondition;
import org.springframework.context.annotation.Conditional;

/**
 * @ValidateAuthToken
 * Should be used for if method execution needs access token validation.
 * */

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD, ElementType.TYPE})
@Conditional(AuthFilterCondition.class)
public @interface ValidateAuthToken {
}
