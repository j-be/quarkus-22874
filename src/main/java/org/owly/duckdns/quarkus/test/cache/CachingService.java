package org.owly.duckdns.quarkus.test.cache;

import io.quarkus.cache.CacheResult;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CachingService {
    @CacheResult(cacheName = "counterCache")
    public int get() {
        return -1;
    }
}
