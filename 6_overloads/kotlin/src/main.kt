package org.sample.kotlin

class Overloads {
    fun method0_1(): Int {
        return 8
    }

    fun method3_3(x: Int, y: Int, z: Int): Int {
        return (x.toString() + y.toString() + z.toString()).length
    }

    fun method3_3(x: Int, y: String, z: Int): Int {
        return (x.toString() + y.toString() + z.toString()).length
    }

    fun method3_3(x: String, y: String, z: Int): Int {
        return (x.toString() + y.toString() + z.toString()).length
    }

    fun method5_5(x: Int, y: Int, z: Int, u: Int, v: Int): Int {
        return (x.toString() + y.toString() + z.toString() + u.toString() + v.toString()).length
    }

    fun method5_5(x: Int, y: String, z: Int, u: String, v: Int): Int {
        return (x.toString() + y.toString() + z.toString() + u.toString() + v.toString()).length
    }

    fun method5_5(x: Int, y: Int, z: String, u: Int, v: Int): Int {
        return (x.toString() + y.toString() + z.toString() + u.toString() + v.toString()).length
    }

    fun method5_5(x: Int, y: String, z: Int, u: Int, v: Int): Int {
        return (x.toString() + y.toString() + z.toString() + u.toString() + v.toString()).length
    }

    fun method5_5(x: String, y: Int, z: Int, u: Int, v: Int): Int {
        return (x.toString() + y.toString() + z.toString() + u.toString() + v.toString()).length
    }

    fun method5_2_default3(x: Int, y: Int, z: Int = 654, u: Int = 46, v: Int = 54): Int {
        return (x.toString() + y.toString() + z.toString() + u.toString() + v.toString()).length
    }

    fun method5_2_default3(x: Int, y: Int, z: String, u: Int = 46, v: Int = 54): Int {
        return (x.toString() + y.toString() + z.toString() + u.toString() + v.toString()).length
    }


    fun method5_10(x: Int, y: Int, z: Int, u: Int, v: Int): Int {
        return (x.toString() + y.toString() + z.toString() + u.toString() + v.toString()).length
    }

    fun method5_10(x: Int, y: String, z: Int, u: String, v: Int): Int {
        return (x.toString() + y.toString() + z.toString() + u.toString() + v.toString()).length
    }

    fun method5_10(x: String, y: Int, z: Int, u: Int, v: String): Int {
        return (x.toString() + y.toString() + z.toString() + u.toString() + v.toString()).length
    }

    fun method5_10(x: Int, y: String, z: Int, u: Int, v: Int): Int {
        return (x.toString() + y.toString() + z.toString() + u.toString() + v.toString()).length
    }

    fun method5_10(x: Int, y: Int, z: String, u: Int, v: Int): Int {
        return (x.toString() + y.toString() + z.toString() + u.toString() + v.toString()).length
    }

    fun method5_10(x: Int, y: Int, z: String, u: String, v: String): Int {
        return (x.toString() + y.toString() + z.toString() + u.toString() + v.toString()).length
    }

    fun method5_10(x: Int, y: Int, z: Int, u: String, v: Int): Int {
        return (x.toString() + y.toString() + z.toString() + u.toString() + v.toString()).length
    }

    fun method5_10(x: Int, y: String, z: Int, u: Int, v: String): Int {
        return (x.toString() + y.toString() + z.toString() + u.toString() + v.toString()).length
    }

    fun method5_10(x: String, y: Int, z: Int, u: Int, v: Int): Int {
        return (x.toString() + y.toString() + z.toString() + u.toString() + v.toString()).length
    }

    fun method5_10(x: String, y: String, z: String, u: Int, v: Int): Int {
        return (x.toString() + y.toString() + z.toString() + u.toString() + v.toString()).length
    }
}

class KotlinRunnerDynamic {
    companion object {
        @JvmStatic
        fun method0_0Proxy(): Int {
            val x: dynamic = Overloads()
            val res: dynamic = 0;
            res += x.method0_1()
            return res
        }

        @JvmStatic
        fun method3_3Proxy(args: List<Any?>): Int {
            val x: dynamic = Overloads()
            var res: dynamic = 0
            for (arg in args) {
                res += x.method3_3(5, arg, 5)
            }
            return res
        }

        @JvmStatic
        fun method5_5Proxy(args: List<Any?>): Int {
            val x: dynamic = Overloads()
            var res: dynamic = 0
            for (arg in args) {
                res += x.method5_5(11, 5, arg, 43, 3434)
            }
            return res
        }

        @JvmStatic
        fun method5_2_default3Proxy(args: List<Any?>): Int {
            val x: dynamic = Overloads()
            var res: dynamic = 0
            for (arg in args) {
                res += x.method5_2_default3(11, 23, arg)
            }
            return res
        }

        @JvmStatic
        fun method5_10Proxy(args: List<Any?>): Int {
            val x: dynamic = Overloads()
            var res: dynamic = 0
            for (arg in args) {
                res += x.method5_10(11, 33, arg, 23232, 55)
            }
            return res
        }
    }
}
