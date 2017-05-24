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

    fun method7_10(x: Int, y: Int, z: Int, u: Int, v: Int, w: Int, a: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode()
    }

    fun method7_10(x: Int, y: Int, z: Int, u: Int, v: Int, w: Int, a: String): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode()
    }

    fun method7_10(x: Int, y: Int, z: Int, u: Int, v: Int, w: String, a: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode()
    }

    fun method7_10(x: Int, y: Int, z: Int, u: Int, v: Int, w: String, a: String): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode()
    }

    fun method7_10(x: Int, y: Int, z: Int, u: Int, v: String, w: Int, a: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode()
    }

    fun method7_10(x: Int, y: Int, z: Int, u: Int, v: String, w: Int, a: String): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode()
    }

    fun method7_10(x: Int, y: Int, z: Int, u: Int, v: String, w: String, a: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode()
    }

    fun method7_10(x: Int, y: Int, z: Int, u: Int, v: String, w: String, a: String): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode()
    }

    fun method7_10(x: Int, y: Int, z: Int, u: String, v: Int, w: Int, a: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode()
    }

    fun method7_10(x: Int, y: Int, z: Int, u: String, v: Int, w: Int, a: String): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode()
    }

    fun method10_10(x: Int, y: Int, z: Int, u: Int, v: Int, w: Int, a: Int, b: Int, c: Int, d: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode() + b.hashCode() + c.hashCode() + d.hashCode()
    }

    fun method10_10(x: Int, y: Int, z: Int, u: Int, v: Int, w: Int, a: Int, b: Int, c: Int, d: String): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode() + b.hashCode() + c.hashCode() + d.hashCode()
    }

    fun method10_10(x: Int, y: Int, z: Int, u: Int, v: Int, w: Int, a: Int, b: Int, c: String, d: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode() + b.hashCode() + c.hashCode() + d.hashCode()
    }

    fun method10_10(x: Int, y: Int, z: Int, u: Int, v: Int, w: Int, a: Int, b: Int, c: String, d: String): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode() + b.hashCode() + c.hashCode() + d.hashCode()
    }

    fun method10_10(x: Int, y: Int, z: Int, u: Int, v: Int, w: Int, a: Int, b: String, c: Int, d: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode() + b.hashCode() + c.hashCode() + d.hashCode()
    }

    fun method10_10(x: Int, y: Int, z: Int, u: Int, v: Int, w: Int, a: Int, b: String, c: Int, d: String): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode() + b.hashCode() + c.hashCode() + d.hashCode()
    }

    fun method10_10(x: Int, y: Int, z: Int, u: Int, v: Int, w: Int, a: Int, b: String, c: String, d: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode() + b.hashCode() + c.hashCode() + d.hashCode()
    }

    fun method10_10(x: Int, y: Int, z: Int, u: Int, v: Int, w: Int, a: Int, b: String, c: String, d: String): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode() + b.hashCode() + c.hashCode() + d.hashCode()
    }

    fun method10_10(x: Int, y: Int, z: Int, u: Int, v: Int, w: Int, a: String, b: Int, c: Int, d: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode() + b.hashCode() + c.hashCode() + d.hashCode()
    }

    fun method10_10(x: Int, y: Int, z: Int, u: Int, v: Int, w: Int, a: String, b: Int, c: Int, d: String): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode() + b.hashCode() + c.hashCode() + d.hashCode()
    }


    fun method5_20(x: Int, y: Int, z: Int, u: Int, v: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_20(x: Int, y: Int, z: Int, u: Int, v: String): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_20(x: Int, y: Int, z: Int, u: String, v: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_20(x: Int, y: Int, z: Int, u: String, v: String): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_20(x: Int, y: Int, z: String, u: Int, v: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_20(x: Int, y: Int, z: String, u: Int, v: String): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_20(x: Int, y: Int, z: String, u: String, v: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_20(x: Int, y: Int, z: String, u: String, v: String): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_20(x: Int, y: String, z: Int, u: Int, v: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_20(x: Int, y: String, z: Int, u: Int, v: String): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_20(x: Int, y: String, z: Int, u: String, v: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_20(x: Int, y: String, z: Int, u: String, v: String): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_20(x: Int, y: String, z: String, u: Int, v: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_20(x: Int, y: String, z: String, u: Int, v: String): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_20(x: Int, y: String, z: String, u: String, v: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_20(x: Int, y: String, z: String, u: String, v: String): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_20(x: String, y: Int, z: Int, u: Int, v: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_20(x: String, y: Int, z: Int, u: Int, v: String): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_20(x: String, y: Int, z: Int, u: String, v: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_20(x: String, y: Int, z: Int, u: String, v: String): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_15(x: Int, y: Int, z: Int, u: Int, v: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_15(x: Int, y: Int, z: Int, u: Int, v: String): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_15(x: Int, y: Int, z: Int, u: String, v: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_15(x: Int, y: Int, z: Int, u: String, v: String): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_15(x: Int, y: Int, z: String, u: Int, v: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_15(x: Int, y: Int, z: String, u: Int, v: String): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_15(x: Int, y: Int, z: String, u: String, v: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_15(x: Int, y: Int, z: String, u: String, v: String): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_15(x: Int, y: String, z: Int, u: Int, v: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_15(x: Int, y: String, z: Int, u: Int, v: String): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_15(x: Int, y: String, z: Int, u: String, v: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_15(x: Int, y: String, z: Int, u: String, v: String): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_15(x: Int, y: String, z: String, u: Int, v: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_15(x: Int, y: String, z: String, u: Int, v: String): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method5_15(x: Int, y: String, z: String, u: String, v: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    fun method13_10(x: Int, y: Int, z: Int, u: Int, v: Int, w: Int, a: Int, b: Int, c: Int, d: Int, e: Int, f: Int, j: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode() + b.hashCode() + c.hashCode() + d.hashCode() + e.hashCode() + f.hashCode() + j.hashCode()
    }

    fun method13_10(x: Int, y: Int, z: Int, u: Int, v: Int, w: Int, a: Int, b: Int, c: Int, d: Int, e: Int, f: Int, j: String): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode() + b.hashCode() + c.hashCode() + d.hashCode() + e.hashCode() + f.hashCode() + j.hashCode()
    }

    fun method13_10(x: Int, y: Int, z: Int, u: Int, v: Int, w: Int, a: Int, b: Int, c: Int, d: Int, e: Int, f: String, j: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode() + b.hashCode() + c.hashCode() + d.hashCode() + e.hashCode() + f.hashCode() + j.hashCode()
    }

    fun method13_10(x: Int, y: Int, z: Int, u: Int, v: Int, w: Int, a: Int, b: Int, c: Int, d: Int, e: Int, f: String, j: String): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode() + b.hashCode() + c.hashCode() + d.hashCode() + e.hashCode() + f.hashCode() + j.hashCode()
    }

    fun method13_10(x: Int, y: Int, z: Int, u: Int, v: Int, w: Int, a: Int, b: Int, c: Int, d: Int, e: String, f: Int, j: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode() + b.hashCode() + c.hashCode() + d.hashCode() + e.hashCode() + f.hashCode() + j.hashCode()
    }

    fun method13_10(x: Int, y: Int, z: Int, u: Int, v: Int, w: Int, a: Int, b: Int, c: Int, d: Int, e: String, f: Int, j: String): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode() + b.hashCode() + c.hashCode() + d.hashCode() + e.hashCode() + f.hashCode() + j.hashCode()
    }

    fun method13_10(x: Int, y: Int, z: Int, u: Int, v: Int, w: Int, a: Int, b: Int, c: Int, d: Int, e: String, f: String, j: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode() + b.hashCode() + c.hashCode() + d.hashCode() + e.hashCode() + f.hashCode() + j.hashCode()
    }

    fun method13_10(x: Int, y: Int, z: Int, u: Int, v: Int, w: Int, a: Int, b: Int, c: Int, d: Int, e: String, f: String, j: String): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode() + b.hashCode() + c.hashCode() + d.hashCode() + e.hashCode() + f.hashCode() + j.hashCode()
    }

    fun method13_10(x: Int, y: Int, z: Int, u: Int, v: Int, w: Int, a: Int, b: Int, c: Int, d: String, e: Int, f: Int, j: Int): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode() + b.hashCode() + c.hashCode() + d.hashCode() + e.hashCode() + f.hashCode() + j.hashCode()
    }

    fun method13_10(x: Int, y: Int, z: Int, u: Int, v: Int, w: Int, a: Int, b: Int, c: Int, d: String, e: Int, f: Int, j: String): Int {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode() + b.hashCode() + c.hashCode() + d.hashCode() + e.hashCode() + f.hashCode() + j.hashCode()
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

        @JvmStatic
        fun method5_15Proxy(arg1: Int): Int {
            return overloads.method5_15(11, "33d", arg1, "eew", 55)
        }

        @JvmStatic
        fun method5_20Proxy(arg1: Int): Int {
            return overloads.method5_20(11, "33d", arg1, "eew", 55)
        }

        @JvmStatic
        fun method7_10Proxy(arg1: Int): Int {
            return overloads.method7_10(11, 11, 11, 11, 11, "ss", arg1)
        }

        @JvmStatic
        fun method10_10Proxy(arg1: Int): Int {
            return overloads.method10_10(11, 11, 11, 11, 11, 11, 11, 11, "ss", arg1)
        }

        @JvmStatic
        fun method13_10Proxy(arg1: Int): Int {
            return overloads.method13_10(11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, "ss", arg1)
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

        @JvmStatic
        fun method5_15Proxy(arg1: Int): Int {
            return overloads.method5_15(11, "33d", arg1, "eew", 55)
        }

        @JvmStatic
        fun method5_20Proxy(arg1: Int): Int {
            return overloads.method5_20(11, "33d", arg1, "eew", 55)
        }

        @JvmStatic
        fun method7_10Proxy(arg1: Int): Int {
            return overloads.method7_10(11, 11, 11, 11, 11, "ss", arg1)
        }

        @JvmStatic
        fun method10_10Proxy(arg1: Int): Int {
            return overloads.method10_10(11, 11, 11, 11, 11, 11, 11, 11, "ss", arg1)
        }

        @JvmStatic
        fun method13_10Proxy(arg1: Int): Int {
            return overloads.method13_10(11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, "ss", arg1)
        }
    }
}

