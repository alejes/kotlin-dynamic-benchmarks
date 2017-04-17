package org.sample.groovy

class GroovyRunnerLongInvokeDynamic {
    static fib(n) {
        if (n < 2) {
            return n
        } else {
            return fib(n - 1) + fib(n - 2)
        }
    }

    static long fibProxy(long n) {
        return (long)fib(n)
    }
}