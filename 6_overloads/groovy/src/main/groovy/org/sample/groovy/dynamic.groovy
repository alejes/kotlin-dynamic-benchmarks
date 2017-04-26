package org.sample.groovy

class OverloadsDynamic {
    int method0_1() {
        return 8
    }

    int method3_3(int x, int y, int z) {
        return (x.toString() + y.toString() + z.toString()).length()
    }

    int method3_3(int x, String y, int z) {
        return (x.toString() + y.toString() + z.toString()).length()
    }

    int method3_3(String x, String y, int z) {
        return (x.toString() + y.toString() + z.toString()).length()
    }

    int method5_5(int x, int y, int z, int u, int v) {
        println("int")
        return (x.toString() + y.toString() + z.toString() + u.toString() + v.toString()).length()
    }

    int method5_5(int x, String y, int z, String u, int v) {
        return (x.toString() + y.toString() + z.toString() + u.toString() + v.toString()).length()
    }

    int method5_5(int x, int y, String z, int u, int v) {
        println("string")
        return (x.toString() + y.toString() + z.toString() + u.toString() + v.toString()).length()
    }

    int method5_5(int x, String y, int z, int u, int v) {
        return (x.toString() + y.toString() + z.toString() + u.toString() + v.toString()).length()
    }

    int method5_5(String x, int y, int z, int u, int v) {
        return (x.toString() + y.toString() + z.toString() + u.toString() + v.toString()).length()
    }

    int method5_2_default3(int x, int y, int z = 654, int u = 46, int v = 54) {
        return (x.toString() + y.toString() + z.toString() + u.toString() + v.toString()).length()
    }

    int method5_2_default3(int x, int y, String z, int u = 46, int v = 54) {
        return (x.toString() + y.toString() + z.toString() + u.toString() + v.toString()).length()
    }

    int method5_10(int x, int y, int z, int u, int v) {
        return (x.toString() + y.toString() + z.toString() + u.toString() + v.toString()).length()
    }

    int method5_10(int x, String y, int z, String u, int v) {
        return (x.toString() + y.toString() + z.toString() + u.toString() + v.toString()).length()
    }

    int method5_10(String x, int y, int z, int u, String v) {
        return (x.toString() + y.toString() + z.toString() + u.toString() + v.toString()).length()
    }

    int method5_10(int x, String y, int z, int u, int v) {
        return (x.toString() + y.toString() + z.toString() + u.toString() + v.toString()).length()
    }

    int method5_10(int x, int y, String z, int u, int v) {
        return (x.toString() + y.toString() + z.toString() + u.toString() + v.toString()).length()
    }

    int method5_10(int x, int y, String z, String u, String v) {
        return (x.toString() + y.toString() + z.toString() + u.toString() + v.toString()).length()
    }

    int method5_10(int x, int y, int z, String u, int v) {
        return (x.toString() + y.toString() + z.toString() + u.toString() + v.toString()).length()
    }

    int method5_10(int x, String y, int z, int u, String v) {
        return (x.toString() + y.toString() + z.toString() + u.toString() + v.toString()).length()
    }

    int method5_10(String x, int y, int z, int u, int v) {
        return (x.toString() + y.toString() + z.toString() + u.toString() + v.toString()).length()
    }

    int method5_10(String x, String y, String z, int u, int v) {
        return (x.toString() + y.toString() + z.toString() + u.toString() + v.toString()).length()
    }
}


class GroovyRunnerDynamic {
    static int method0_0Proxy() {
        def x = new OverloadsDynamic()
        def res = 0
        res += x.method0_1()
        return res
    }

    static int method3_3Proxy(List args) {
        def x = new OverloadsDynamic()
        def res = 0
        for (arg in args) {
            res += x.method3_3(5, arg, 5)
        }
        return res
    }

    static int method5_5Proxy(List args) {
        def x = new OverloadsDynamic()
        def res = 0
        for (arg in args) {
            res += x.method5_5(11, 5, arg, 43, 3434)
        }
        return res
    }

    static int method5_2_default3Proxy(List args) {
        def x = new OverloadsDynamic()
        def res = 0
        for (arg in args) {
            res += x.method5_2_default3(11, 23, arg)
        }
        return res
    }

    static int method5_10Proxy(List args) {
        def x = new OverloadsDynamic()
        def res = 0
        for (arg in args) {
            res += x.method5_10(11, 33, arg, 23232, 55)
        }
        return res
    }
}


list = [1, 2, 3, "dewwe", 544]
println(GroovyRunnerDynamic.method5_5Proxy(list))