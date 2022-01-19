package com.xkcoding.orm.mybatis;

import com.xkcoding.orm.mybatis.entity.User;
import com.xkcoding.orm.mybatis.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author zhouyue01
 * @date 2022/1/19
 */
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserMapper userMapper;

    @Transactional(rollbackFor = Exception.class)
    public void add() {
        userMapper.saveUser(new User());
    }

    public void delete() {
        userMapper.deleteById(122L);
    }
    /**
     * 首先target会被查出来，直接变成原始类。作为后面object的入参。
     * 1.主要是看事务的原理，加注解的chain为1，会构建CglibMethodInvocation，传入target参数等等，然后先执行拦截器链，执行完，也会走到fastclass的invoke方法，跟下面一样。
     * 2.不加注解的方法chain为0，就不会在构建CglibMethodInvocation，直接methodProxy.invoke走入被代理类的FastClass，再强转为原始类的类型（本身也是原始类），就直接走到原始类了。
     * 例外：
     *      如果是使用的enhaner增强的，invoke和invokeSuper还是有区别的。
     */

}
