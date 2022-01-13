# Reproducer for Quarkus issue 22874

This is a small reproducer project for Quarkus issue [#22874](https://github.com/quarkusio/quarkus/issues/22874).

# Reproduce

## Failure on 2.6.2.Final

Run the test on Quarkus `2.6.2.Final`
```
./mvnw clean test
```

This fails with `IllegalStateException`.

## Success on 2.5.4.Final

Run the test on Quarkus `2.5.4.Final`
```
./mvnw clean test -Dquarkus.platform.version=2.5.4.Final
```

This works fine.
