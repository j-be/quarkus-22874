package org.owly.duckdns.quarkus.test.cache.test;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.RestAssured;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.owly.duckdns.quarkus.test.cache.CachingService;

import javax.inject.Inject;

@QuarkusTest
class CachingServiceTest {

    @Inject
    CachingService cachingService;

    @Test
    void testGet() {
        // Prefill cache
        cachingService.get();

        Assertions.assertEquals(
                "hello",
                RestAssured.get("/")
                        .then()
                        .statusCode(200)
                        .extract().asString());
    }
}
