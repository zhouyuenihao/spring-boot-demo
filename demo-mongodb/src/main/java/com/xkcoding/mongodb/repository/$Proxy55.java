/*
package com.xkcoding.mongodb.repository;

*/
/**
 * @author zhouyue01
 * @date 2021/12/13
 *//*


import org.aopalliance.aop.Advice;
import org.springframework.aop.Advisor;
import org.springframework.aop.TargetSource;
import org.springframework.aop.framework.Advised;
import org.springframework.aop.framework.AopConfigException;
import org.springframework.core.DecoratingProxy;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.Repository;
import org.springframework.transaction.interceptor.TransactionalProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.List;
import java.util.Optional;

public final class $Proxy55 extends Proxy implements ArticleRepository, Repository, TransactionalProxy, Advised, DecoratingProxy {
    private static Method m1;
    private static Method m18;
    private static Method m21;
    private static Method m46;
    private static Method m27;
    private static Method m42;
    private static Method m7;
    private static Method m10;
    private static Method m33;
    private static Method m19;
    private static Method m35;
    private static Method m51;
    private static Method m44;
    private static Method m6;
    private static Method m13;
    private static Method m26;
    private static Method m25;
    private static Method m3;
    private static Method m2;
    private static Method m14;
    private static Method m15;
    private static Method m4;
    private static Method m30;
    private static Method m32;
    private static Method m47;
    private static Method m48;
    private static Method m49;
    private static Method m36;
    private static Method m17;
    private static Method m31;
    private static Method m37;
    private static Method m40;
    private static Method m39;
    private static Method m0;
    private static Method m8;
    private static Method m12;
    private static Method m9;
    private static Method m11;
    private static Method m20;
    private static Method m23;
    private static Method m28;
    private static Method m41;
    private static Method m29;
    private static Method m22;
    private static Method m52;
    private static Method m5;
    private static Method m50;
    private static Method m53;
    private static Method m43;
    private static Method m24;
    private static Method m16;
    private static Method m34;
    private static Method m45;
    private static Method m38;

    public $Proxy55(InvocationHandler var1) {
        super(var1);
    }

    static {
        try {
            m1 = Class.forName("java.lang.Object").getMethod("equals", Class.forName("java.lang.Object"));
            m18 = Class.forName("com.xkcoding.mongodb.repository.ArticleRepository").getMethod("delete", Class.forName("java.lang.Object"));
            m21 = Class.forName("com.xkcoding.mongodb.repository.ArticleRepository").getMethod("deleteAll");
            m46 = Class.forName("org.springframework.aop.framework.Advised").getMethod("isExposeProxy");
            m27 = Class.forName("com.xkcoding.mongodb.repository.ArticleRepository").getMethod("exists", Class.forName("org.springframework.data.domain.Example"));
            m42 = Class.forName("org.springframework.aop.framework.Advised").getMethod("removeAdvisor", Integer.TYPE);
            m7 = Class.forName("com.xkcoding.mongodb.repository.ArticleRepository").getMethod("findAll", Class.forName("org.springframework.data.domain.Example"), Class.forName("org.springframework.data.domain.Sort"));
            m10 = Class.forName("com.xkcoding.mongodb.repository.ArticleRepository").getMethod("findAll", Class.forName("org.springframework.data.domain.Example"), Class.forName("org.springframework.data.domain.Sort"));
            m33 = Class.forName("org.springframework.aop.framework.Advised").getMethod("getProxiedInterfaces");
            m19 = Class.forName("com.xkcoding.mongodb.repository.ArticleRepository").getMethod("save", Class.forName("java.lang.Object"));
            m35 = Class.forName("org.springframework.aop.framework.Advised").getMethod("isInterfaceProxied", Class.forName("java.lang.Class"));
            m51 = Class.forName("org.springframework.aop.framework.Advised").getMethod("removeAdvice", Class.forName("org.aopalliance.aop.Advice"));
            m44 = Class.forName("org.springframework.aop.framework.Advised").getMethod("setExposeProxy", Boolean.TYPE);
            m6 = Class.forName("com.xkcoding.mongodb.repository.ArticleRepository").getMethod("findAll", Class.forName("org.springframework.data.domain.Example"));
            m13 = Class.forName("com.xkcoding.mongodb.repository.ArticleRepository").getMethod("findAll", Class.forName("org.springframework.data.domain.Example"));
            m26 = Class.forName("com.xkcoding.mongodb.repository.ArticleRepository").getMethod("count", Class.forName("org.springframework.data.domain.Example"));
            m25 = Class.forName("com.xkcoding.mongodb.repository.ArticleRepository").getMethod("existsById", Class.forName("java.lang.Object"));
            m3 = Class.forName("com.xkcoding.mongodb.repository.ArticleRepository").getMethod("findByTitleLike", Class.forName("java.lang.String"));
            m2 = Class.forName("java.lang.Object").getMethod("toString");
            m14 = Class.forName("com.xkcoding.mongodb.repository.ArticleRepository").getMethod("saveAll", Class.forName("java.lang.Iterable"));
            m15 = Class.forName("com.xkcoding.mongodb.repository.ArticleRepository").getMethod("saveAll", Class.forName("java.lang.Iterable"));
            m4 = Class.forName("com.xkcoding.mongodb.repository.ArticleRepository").getMethod("insert", Class.forName("java.lang.Iterable"));
            m30 = Class.forName("org.springframework.aop.framework.Advised").getMethod("indexOf", Class.forName("org.aopalliance.aop.Advice"));
            m32 = Class.forName("org.springframework.aop.framework.Advised").getMethod("isFrozen");
            m47 = Class.forName("org.springframework.aop.framework.Advised").getMethod("replaceAdvisor", Class.forName("org.springframework.aop.Advisor"), Class.forName("org.springframework.aop.Advisor"));
            m48 = Class.forName("org.springframework.aop.framework.Advised").getMethod("setPreFiltered", Boolean.TYPE);
            m49 = Class.forName("org.springframework.aop.framework.Advised").getMethod("addAdvisor", Class.forName("org.springframework.aop.Advisor"));
            m36 = Class.forName("org.springframework.aop.framework.Advised").getMethod("isProxyTargetClass");
            m17 = Class.forName("com.xkcoding.mongodb.repository.ArticleRepository").getMethod("count");
            m31 = Class.forName("org.springframework.aop.framework.Advised").getMethod("indexOf", Class.forName("org.springframework.aop.Advisor"));
            m37 = Class.forName("org.springframework.aop.framework.Advised").getMethod("getTargetSource");
            m40 = Class.forName("org.springframework.aop.framework.Advised").getMethod("addAdvice", Integer.TYPE, Class.forName("org.aopalliance.aop.Advice"));
            m39 = Class.forName("org.springframework.aop.framework.Advised").getMethod("addAdvice", Class.forName("org.aopalliance.aop.Advice"));
            m0 = Class.forName("java.lang.Object").getMethod("hashCode");
            m8 = Class.forName("com.xkcoding.mongodb.repository.ArticleRepository").getMethod("findAll", Class.forName("org.springframework.data.domain.Sort"));
            m12 = Class.forName("com.xkcoding.mongodb.repository.ArticleRepository").getMethod("findAll", Class.forName("org.springframework.data.domain.Sort"));
            m9 = Class.forName("com.xkcoding.mongodb.repository.ArticleRepository").getMethod("findAll");
            m11 = Class.forName("com.xkcoding.mongodb.repository.ArticleRepository").getMethod("findAll");
            m20 = Class.forName("com.xkcoding.mongodb.repository.ArticleRepository").getMethod("deleteAll", Class.forName("java.lang.Iterable"));
            m23 = Class.forName("com.xkcoding.mongodb.repository.ArticleRepository").getMethod("deleteById", Class.forName("java.lang.Object"));
            m28 = Class.forName("com.xkcoding.mongodb.repository.ArticleRepository").getMethod("findAll", Class.forName("org.springframework.data.domain.Example"), Class.forName("org.springframework.data.domain.Pageable"));
            m41 = Class.forName("org.springframework.aop.framework.Advised").getMethod("setTargetSource", Class.forName("org.springframework.aop.TargetSource"));
            m29 = Class.forName("com.xkcoding.mongodb.repository.ArticleRepository").getMethod("findOne", Class.forName("org.springframework.data.domain.Example"));
            m22 = Class.forName("com.xkcoding.mongodb.repository.ArticleRepository").getMethod("findById", Class.forName("java.lang.Object"));
            m52 = Class.forName("org.springframework.aop.framework.Advised").getMethod("getTargetClass");
            m5 = Class.forName("com.xkcoding.mongodb.repository.ArticleRepository").getMethod("insert", Class.forName("java.lang.Object"));
            m50 = Class.forName("org.springframework.aop.framework.Advised").getMethod("addAdvisor", Integer.TYPE, Class.forName("org.springframework.aop.Advisor"));
            m53 = Class.forName("org.springframework.core.DecoratingProxy").getMethod("getDecoratedClass");
            m43 = Class.forName("org.springframework.aop.framework.Advised").getMethod("removeAdvisor", Class.forName("org.springframework.aop.Advisor"));
            m24 = Class.forName("com.xkcoding.mongodb.repository.ArticleRepository").getMethod("findAllById", Class.forName("java.lang.Iterable"));
            m16 = Class.forName("com.xkcoding.mongodb.repository.ArticleRepository").getMethod("findAll", Class.forName("org.springframework.data.domain.Pageable"));
            m34 = Class.forName("org.springframework.aop.framework.Advised").getMethod("toProxyConfigString");
            m45 = Class.forName("org.springframework.aop.framework.Advised").getMethod("getAdvisors");
            m38 = Class.forName("org.springframework.aop.framework.Advised").getMethod("isPreFiltered");
        } catch (NoSuchMethodException var2) {
            throw new NoSuchMethodError(var2.getMessage());
        } catch (ClassNotFoundException var3) {
            throw new NoClassDefFoundError(var3.getMessage());
        }
    }

    @Override
    public final long count(Example var1) {
        try {
            return (Long) super.h.invoke(this, m26, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }

    @Override
    public final long count() {
        try {
            return (Long) super.h.invoke(this, m17, (Object[]) null);
        } catch (RuntimeException | Error var2) {
            throw var2;
        } catch (Throwable var3) {
            throw new UndeclaredThrowableException(var3);
        }
    }

    @Override
    public final boolean equals(Object var1) {
        try {
            return (Boolean) super.h.invoke(this, m1, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }

    @Override
    public final String toString() {
        try {
            return (String) super.h.invoke(this, m2, (Object[]) null);
        } catch (RuntimeException | Error var2) {
            throw var2;
        } catch (Throwable var3) {
            throw new UndeclaredThrowableException(var3);
        }
    }

    @Override
    public final int hashCode() {
        try {
            return (Integer) super.h.invoke(this, m0, (Object[]) null);
        } catch (RuntimeException | Error var2) {
            throw var2;
        } catch (Throwable var3) {
            throw new UndeclaredThrowableException(var3);
        }
    }

    @Override
    public final int indexOf(Advice var1) {
        try {
            return (Integer) super.h.invoke(this, m30, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }

    @Override
    public final int indexOf(Advisor var1) {
        try {
            return (Integer) super.h.invoke(this, m31, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }

    */
/*public final void delete(Object var1) {
        try {
            super.h.invoke(this, m18, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }*//*


    */
/*public final Object save(Object var1) {
        try {
            return (Object) super.h.invoke(this, m19, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }*//*


    @Override
    public final List insert(Iterable var1) {
        try {
            return (List) super.h.invoke(this, m4, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }

    */
/*public final Object insert(Object var1) {
        try {
            return (Object) super.h.invoke(this, m5, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }*//*


    @Override
    public final boolean isFrozen() {
        try {
            return (Boolean) super.h.invoke(this, m32, (Object[]) null);
        } catch (RuntimeException | Error var2) {
            throw var2;
        } catch (Throwable var3) {
            throw new UndeclaredThrowableException(var3);
        }
    }

    @Override
    public final boolean exists(Example var1) {
        try {
            return (Boolean) super.h.invoke(this, m27, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }

    */
/*@Override
    public final Iterable findAll() {
        try {
            return (Iterable) super.h.invoke(this, m9, (Object[]) null);
        } catch (RuntimeException | Error var2) {
            throw var2;
        } catch (Throwable var3) {
            throw new UndeclaredThrowableException(var3);
        }
    }*//*


    @Override
    public final List findAll() {
        try {
            return (List) super.h.invoke(this, m11, (Object[]) null);
        } catch (RuntimeException | Error var2) {
            throw var2;
        } catch (Throwable var3) {
            throw new UndeclaredThrowableException(var3);
        }
    }

    */
/*@Override
    public final Iterable findAll(Example var1, Sort var2) {
        try {
            return (Iterable) super.h.invoke(this, m7, new Object[]{var1, var2});
        } catch (RuntimeException | Error var4) {
            throw var4;
        } catch (Throwable var5) {
            throw new UndeclaredThrowableException(var5);
        }
    }*//*


    @Override
    public final Page findAll(Pageable var1) {
        try {
            return (Page) super.h.invoke(this, m16, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }

    @Override
    public final Page findAll(Example var1, Pageable var2) {
        try {
            return (Page) super.h.invoke(this, m28, new Object[]{var1, var2});
        } catch (RuntimeException | Error var4) {
            throw var4;
        } catch (Throwable var5) {
            throw new UndeclaredThrowableException(var5);
        }
    }

    */
/*@Override
    public final Iterable findAll(Sort var1) {
        try {
            return (Iterable) super.h.invoke(this, m8, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }*//*


    @Override
    public final List findAll(Sort var1) {
        try {
            return (List) super.h.invoke(this, m12, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }

    */
/*@Override
    public final Iterable findAll(Example var1) {
        try {
            return (Iterable) super.h.invoke(this, m6, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }*//*


    @Override
    public final List findAll(Example var1, Sort var2) {
        try {
            return (List) super.h.invoke(this, m10, new Object[]{var1, var2});
        } catch (RuntimeException | Error var4) {
            throw var4;
        } catch (Throwable var5) {
            throw new UndeclaredThrowableException(var5);
        }
    }

    @Override
    public final List findAll(Example var1) {
        try {
            return (List) super.h.invoke(this, m13, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }

    @Override
    public final void deleteAll(Iterable var1) {
        try {
            super.h.invoke(this, m20, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }

    @Override
    public final void deleteAll() {
        try {
            super.h.invoke(this, m21, (Object[]) null);
        } catch (RuntimeException | Error var2) {
            throw var2;
        } catch (Throwable var3) {
            throw new UndeclaredThrowableException(var3);
        }
    }

    */
/*@Override
    public final Optional findById(Object var1) {
        try {
            return (Optional) super.h.invoke(this, m22, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }*//*


    */
/*public final void deleteById(Object var1) {
        try {
            super.h.invoke(this, m23, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }*//*


    @Override
    public final List findByTitleLike(String var1) {
        try {
            return (List) super.h.invoke(this, m3, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }

    */
/*@Override
    public final Iterable saveAll(Iterable var1) {
        try {
            return (Iterable) super.h.invoke(this, m15, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }*//*


    @Override
    public final List saveAll(Iterable var1) {
        try {
            return (List) super.h.invoke(this, m14, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }
    @Override
    public final Iterable findAllById(Iterable var1) {
        try {
            return (Iterable) super.h.invoke(this, m24, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }

    */
/*public final boolean existsById(Object var1) {
        try {
            return (Boolean) super.h.invoke(this, m25, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }*//*

    @Override
    public final Optional findOne(Example var1) {
        try {
            return (Optional) super.h.invoke(this, m29, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }
    @Override
    public final Class getDecoratedClass() {
        try {
            return (Class) super.h.invoke(this, m53, (Object[]) null);
        } catch (RuntimeException | Error var2) {
            throw var2;
        } catch (Throwable var3) {
            throw new UndeclaredThrowableException(var3);
        }
    }
    @Override
    public final Class[] getProxiedInterfaces() {
        try {
            return (Class[]) super.h.invoke(this, m33, (Object[]) null);
        } catch (RuntimeException | Error var2) {
            throw var2;
        } catch (Throwable var3) {
            throw new UndeclaredThrowableException(var3);
        }
    }
    @Override
    public final String toProxyConfigString() {
        try {
            return (String) super.h.invoke(this, m34, (Object[]) null);
        } catch (RuntimeException | Error var2) {
            throw var2;
        } catch (Throwable var3) {
            throw new UndeclaredThrowableException(var3);
        }
    }
    @Override
    public final boolean isInterfaceProxied(Class var1) {
        try {
            return (Boolean) super.h.invoke(this, m35, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }
    @Override
    public final boolean isProxyTargetClass() {
        try {
            return (Boolean) super.h.invoke(this, m36, (Object[]) null);
        } catch (RuntimeException | Error var2) {
            throw var2;
        } catch (Throwable var3) {
            throw new UndeclaredThrowableException(var3);
        }
    }
    @Override
    public final TargetSource getTargetSource() {
        try {
            return (TargetSource) super.h.invoke(this, m37, (Object[]) null);
        } catch (RuntimeException | Error var2) {
            throw var2;
        } catch (Throwable var3) {
            throw new UndeclaredThrowableException(var3);
        }
    }
    @Override
    public final boolean isPreFiltered() {
        try {
            return (Boolean) super.h.invoke(this, m38, (Object[]) null);
        } catch (RuntimeException | Error var2) {
            throw var2;
        } catch (Throwable var3) {
            throw new UndeclaredThrowableException(var3);
        }
    }
    @Override
    public final void addAdvice(Advice var1) throws AopConfigException {
        try {
            super.h.invoke(this, m39, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }
    @Override
    public final void addAdvice(int var1, Advice var2) throws AopConfigException {
        try {
            super.h.invoke(this, m40, new Object[]{var1, var2});
        } catch (RuntimeException | Error var4) {
            throw var4;
        } catch (Throwable var5) {
            throw new UndeclaredThrowableException(var5);
        }
    }
    @Override
    public final void setTargetSource(TargetSource var1) {
        try {
            super.h.invoke(this, m41, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }
    @Override
    public final void removeAdvisor(int var1) throws AopConfigException {
        try {
            super.h.invoke(this, m42, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }
    @Override
    public final boolean removeAdvisor(Advisor var1) {
        try {
            return (Boolean) super.h.invoke(this, m43, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }
    @Override
    public final void setExposeProxy(boolean var1) {
        try {
            super.h.invoke(this, m44, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }
    @Override
    public final Advisor[] getAdvisors() {
        try {
            return (Advisor[]) super.h.invoke(this, m45, (Object[]) null);
        } catch (RuntimeException | Error var2) {
            throw var2;
        } catch (Throwable var3) {
            throw new UndeclaredThrowableException(var3);
        }
    }
    @Override
    public final boolean isExposeProxy() {
        try {
            return (Boolean) super.h.invoke(this, m46, (Object[]) null);
        } catch (RuntimeException | Error var2) {
            throw var2;
        } catch (Throwable var3) {
            throw new UndeclaredThrowableException(var3);
        }
    }
    @Override
    public final boolean replaceAdvisor(Advisor var1, Advisor var2) throws AopConfigException {
        try {
            return (Boolean) super.h.invoke(this, m47, new Object[]{var1, var2});
        } catch (RuntimeException | Error var4) {
            throw var4;
        } catch (Throwable var5) {
            throw new UndeclaredThrowableException(var5);
        }
    }
    @Override
    public final void setPreFiltered(boolean var1) {
        try {
            super.h.invoke(this, m48, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }
    @Override
    public final void addAdvisor(Advisor var1) throws AopConfigException {
        try {
            super.h.invoke(this, m49, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }
    @Override
    public final void addAdvisor(int var1, Advisor var2) throws AopConfigException {
        try {
            super.h.invoke(this, m50, new Object[]{var1, var2});
        } catch (RuntimeException | Error var4) {
            throw var4;
        } catch (Throwable var5) {
            throw new UndeclaredThrowableException(var5);
        }
    }
    @Override
    public final Class getTargetClass() {
        try {
            return (Class) super.h.invoke(this, m52, (Object[]) null);
        } catch (RuntimeException | Error var2) {
            throw var2;
        } catch (Throwable var3) {
            throw new UndeclaredThrowableException(var3);
        }
    }
    @Override
    public final boolean removeAdvice(Advice var1) {
        try {
            return (Boolean) super.h.invoke(this, m51, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }
}

*/
