package com.xkcoding.orm.mybatis;


import com.xkcoding.orm.mybatis.entity.User;
import com.xkcoding.orm.mybatis.mapper.UserMapper;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.List;

/**
 * @author zhouyue01
 * @date 2021/12/10
 */
public final class $Proxy63 extends Proxy implements UserMapper {
    private static Method m1;
    private static Method m2;
    private static Method m4;
    private static Method m5;
    private static Method m6;
    private static Method m0;
    private static Method m3;

    public $Proxy63(InvocationHandler var1) {
        super(var1);
    }

    static {
        try {
            m1 = Class.forName("java.lang.Object").getMethod("equals", Class.forName("java.lang.Object"));
            m2 = Class.forName("java.lang.Object").getMethod("toString");
            m4 = Class.forName("com.xkcoding.orm.mybatis.mapper.UserMapper").getMethod("selectAllUser");
            m5 = Class.forName("com.xkcoding.orm.mybatis.mapper.UserMapper").getMethod("selectUserById", Class.forName("java.lang.Long"));
            m6 = Class.forName("com.xkcoding.orm.mybatis.mapper.UserMapper").getMethod("deleteById", Class.forName("java.lang.Long"));
            m0 = Class.forName("java.lang.Object").getMethod("hashCode");
            m3 = Class.forName("com.xkcoding.orm.mybatis.mapper.UserMapper").getMethod("saveUser", Class.forName("com.xkcoding.orm.mybatis.entity.User"));
        } catch (NoSuchMethodException var2) {
            throw new NoSuchMethodError(var2.getMessage());
        } catch (ClassNotFoundException var3) {
            throw new NoClassDefFoundError(var3.getMessage());
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
    public final int saveUser(User var1) {
        try {
            return (Integer) super.h.invoke(this, m3, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }

    @Override
    public final List selectAllUser() {
        try {
            return (List) super.h.invoke(this, m4, (Object[]) null);
        } catch (RuntimeException | Error var2) {
            throw var2;
        } catch (Throwable var3) {
            throw new UndeclaredThrowableException(var3);
        }
    }

    @Override
    public final User selectUserById(Long var1) {
        try {
            return (User) super.h.invoke(this, m5, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }

    @Override
    public final int deleteById(Long var1) {
        try {
            return (Integer) super.h.invoke(this, m6, new Object[]{var1});
        } catch (RuntimeException | Error var3) {
            throw var3;
        } catch (Throwable var4) {
            throw new UndeclaredThrowableException(var4);
        }
    }
}
