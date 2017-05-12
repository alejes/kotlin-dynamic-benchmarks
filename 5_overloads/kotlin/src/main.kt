package org.sample.kotlin

class Overloads {
    fun method0_1(): Int {
        return 111
    }

    fun method3_3(x: Int, y: Int, z: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode()
    }

    fun method3_3(x: Int, y: String, z: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode()
    }

    fun method3_3(x: String, y: String, z: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode()
    }

    fun method5_5(x: Int, y: Int, z: Int, u: Int, v: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_5(x: Int, y: String, z: Int, u: String, v: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_5(x: Int, y: Int, z: String, u: Int, v: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_5(x: Int, y: String, z: Int, u: Int, v: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_5(x: String, y: Int, z: Int, u: Int, v: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_1_default3(x: Int, y: Int, z: Int = 654, u: Int = 46, v: Int = 54): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }


    fun method5_10(x: Int, y: Int, z: Int, u: Int, v: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_10(x: Int, y: String, z: Int, u: String, v: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_10(x: String, y: Int, z: Int, u: Int, v: String): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_10(x: Int, y: String, z: Int, u: Int, v: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_10(x: Int, y: Int, z: String, u: Int, v: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_10(x: Int, y: Int, z: String, u: String, v: String): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_10(x: Int, y: Int, z: Int, u: String, v: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_10(x: Int, y: String, z: Int, u: Int, v: String): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_10(x: String, y: Int, z: Int, u: Int, v: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_10(x: String, y: String, z: String, u: Int, v: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }
}

class KotlinRunnerStatic {
    companion object {
        val overloads = Overloads()
        @JvmStatic
        fun method0_0Proxy(): Int {
            return overloads.method0_1()
        }

        @JvmStatic
        fun method3_3Proxy(arg1: Int): Int {
            return overloads.method3_3(5, "eew", arg1)
        }

        @JvmStatic
        fun method5_5Proxy(arg1: Int): Int {
            return overloads.method5_5(11, "33d", 5, "eew", arg1)
        }

        @JvmStatic
        fun method5_1_default3Proxy(arg1: Int): Int {
            return overloads.method5_1_default3(11, arg1)
        }

        @JvmStatic
        fun method5_10Proxy(arg1: Int): Int {
            return overloads.method5_10(11, "33d", arg1, "eew", 55)
        }
    }
}

class KotlinRunnerDynamic {
    companion object {
        val overloads: dynamic = Overloads()
        @JvmStatic
        fun method0_0Proxy(): Int {
            return overloads.method0_1()
        }

        @JvmStatic
        fun method3_3Proxy(arg1: Int): Int {
            return overloads.method3_3(5, "eew", arg1)
        }

        @JvmStatic
        fun method5_5Proxy(arg1: Int): Int {
            return overloads.method5_5(11, "33d", 5, "eew", arg1)
        }

        @JvmStatic
        fun method5_1_default3Proxy(arg1: Int): Int {
            return overloads.method5_1_default3(11, arg1)
        }

        @JvmStatic
        fun method5_10Proxy(arg1: Int): Int {
            return overloads.method5_10(11, "33d", arg1, "eew", 55)
        }
    }
}

