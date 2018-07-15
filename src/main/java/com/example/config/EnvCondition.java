package com.example.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

import java.util.Map;

public class EnvCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Map<String, Object> attr = metadata.getAnnotationAttributes(DatabaseType.class.getName());
        String value = (String) attr.get("value");
        String dbType = System.getProperty("dbType","mongodb");
        return dbType != null && dbType.equalsIgnoreCase(value);
    }
}
