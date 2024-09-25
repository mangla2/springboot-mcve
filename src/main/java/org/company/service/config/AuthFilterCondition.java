package org.company.service.config;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class AuthFilterCondition implements Condition {

    private static final String IS_AUTH_FILTER_FEATURE_ENABLED = "org.company.service.load.auth.filter";

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String isAuthFilterEnabled = context.getEnvironment().getProperty(IS_AUTH_FILTER_FEATURE_ENABLED);
        return isAuthFilterEnabled != null && isAuthFilterEnabled.equalsIgnoreCase("true");
    }
}
