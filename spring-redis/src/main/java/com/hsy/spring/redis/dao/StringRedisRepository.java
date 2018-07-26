package com.hsy.spring.redis.dao;
import com.hsy.java.util.cache.redis.impl.AbstractSpringStringRedisCacheEnhance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.*;
import org.springframework.stereotype.Repository;

@Repository(value = "stringRedisRepository")
public class StringRedisRepository extends AbstractSpringStringRedisCacheEnhance {

    @Autowired StringRedisTemplate stringRedisTemplate;

    @Override
    public StringRedisTemplate getStringRedisTemplate() {
        return stringRedisTemplate;
    }

    @Override
    public RedisTemplate<String, Object> getRedisTemplate() {
        return null;
    }
}
