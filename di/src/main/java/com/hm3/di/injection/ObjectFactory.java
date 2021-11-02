package com.hm3.di.injection;

import com.hm3.di.injection.exception.InjectionException;

public class ObjectFactory {

    public <T> T createBean(Class<T> clazz) {
        try {
            return clazz.getConstructor().newInstance();
        } catch (ReflectiveOperationException e) {
            throw new InjectionException("Bean creation filed: ", e);
        }
    }
}