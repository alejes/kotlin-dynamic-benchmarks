package org.sample.kotlin

class KotlinRunnerDynamic {
    companion object {
        @JvmStatic
        fun fib(n: dynamic): dynamic {
            if (n < 2) {
                return n
            } else {
                return fib(n - 1) + fib(n - 2)
            }
        }
        @JvmStatic
        fun fibProxy(n: Int): Int {
            return fib(n)
        }
    }
}

class KotlinRunnerInt {
    companion object {
        @JvmStatic
        fun fib(n: Int): Int {
            if (n < 2) {
                return n
            } else {
                return fib(n - 1) + fib(n - 2)
            }
        }
        @JvmStatic
        fun fibProxy(n: Int): Int {
            return fib(n)
        }
    }
}
