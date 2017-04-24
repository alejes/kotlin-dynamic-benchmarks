package org.sample.kotlin


class KotlinRunnerLongDynamic {
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
        fun fibProxy(n: Long): Long {
            return fib(n)
        }
    }
}

class KotlinRunnerLong {
    companion object {
        @JvmStatic
        fun fib(n: Long): Long {
            if (n < 2) {
                return n
            } else {
                return fib(n - 1) + fib(n - 2)
            }
        }

        @JvmStatic
        fun fibProxy(n: Long): Long {
            return fib(n)
        }
    }
}

