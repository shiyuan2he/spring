package com.hsy.spring.redis.dao;
import com.hsy.java.util.cache.redis.impl.AbstractSpringStringRedisCacheEnhance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;

//@Repository(value = "stringRedisRepository")
@Component(value = "stringRedisRepository")
public class StringRedisRepository extends AbstractSpringStringRedisCacheEnhance {

    @Autowired StringRedisTemplate stringRedisTemplate;

    private ValueOperations<String, String> stringValueOperations;
    private ListOperations<String, String> listOperations;
    private SetOperations<String, String> setOperations;
    private ZSetOperations<String, String> zSetOperations;
    private HashOperations<String, String, Object> hashOperations;
    private ClusterOperations<String, String> clusterOperations;
    private GeoOperations<String, String> geoOperations;
    private HyperLogLogOperations<String, String> hyperLogLogOperations;
    @PostConstruct
    public void getValueOperation(){
        stringValueOperations = getStringRedisTemplate().opsForValue();
        listOperations = getStringRedisTemplate().opsForList();
        setOperations = getStringRedisTemplate().opsForSet();
        zSetOperations = getStringRedisTemplate().opsForZSet();
        hashOperations = getStringRedisTemplate().opsForHash();
        clusterOperations = getStringRedisTemplate().opsForCluster();
        geoOperations = getStringRedisTemplate().opsForGeo();
        hyperLogLogOperations = getStringRedisTemplate().opsForHyperLogLog();
    }
    @Override
    public StringRedisTemplate getStringRedisTemplate() {
        return stringRedisTemplate;
    }
}
