package org.sample.groovy

class OverloadsInvokeDynamic {
    String method0_1() {
        return "OK"
    }

    String method3_3(int x, int y, int z) {
        return x.toString() + y.toString() + z.toString()
    }

    String method3_3(int x, String y, int z) {
        return x.toString() + y.toString() + z.toString()
    }

    String method3_3(String x, String y, int z) {
        return x.toString() + y.toString() + z.toString()
    }

    String method5_5(int x, int y, int z, int u, int v) {
        return x.toString() + y.toString() + z.toString() + u.toString() + v.toString()
    }

    String method5_5(int x, String y, int z, String u, int v) {
        return x.toString() + y.toString() + z.toString() + u.toString() + v.toString()
    }

    String method5_5(int x, int y, String z, int u, int v) {
        return x.toString() + y.toString() + z.toString() + u.toString() + v.toString()
    }

    String method5_5(int x, String y, int z, int u, int v) {
        return x.toString() + y.toString() + z.toString() + u.toString() + v.toString()
    }

    String method5_5(String x, int y, int z, int u, int v) {
        return x.toString() + y.toString() + z.toString() + u.toString() + v.toString()
    }

    String method5_1_default3(int x, int y, int z = 654, int u = 46, int v = 54) {
        return x.toString() + y.toString() + z.toString() + u.toString() + v.toString()
    }

    String method5_10(int x, int y, int z, int u, int v) {
        return x.toString() + y.toString() + z.toString() + u.toString() + v.toString()
    }

    String method5_10(int x, String y, int z, String u, int v) {
        return x.toString() + y.toString() + z.toString() + u.toString() + v.toString()
    }

    String method5_10(String x, int y, int z, int u, String v) {
        return x.toString() + y.toString() + z.toString() + u.toString() + v.toString()
    }

    String method5_10(int x, String y, int z, int u, int v) {
        return x.toString() + y.toString() + z.toString() + u.toString() + v.toString()
    }

    String method5_10(int x, int y, String z, int u, int v) {
        return x.toString() + y.toString() + z.toString() + u.toString() + v.toString()
    }

    String method5_10(int x, int y, String z, String u, String v) {
        return x.toString() + y.toString() + z.toString() + u.toString() + v.toString()
    }

    String method5_10(int x, int y, int z, String u, int v) {
        return x.toString() + y.toString() + z.toString() + u.toString() + v.toString()
    }

    String method5_10(int x, String y, int z, int u, String v) {
        return x.toString() + y.toString() + z.toString() + u.toString() + v.toString()
    }

    String method5_10(String x, int y, int z, int u, int v) {
        return x.toString() + y.toString() + z.toString() + u.toString() + v.toString()
    }

    String method5_10(String x, String y, String z, int u, int v) {
        return x.toString() + y.toString() + z.toString() + u.toString() + v.toString()
    }
}


class GroovyRunnerInvokeDynamic {
    static overloads = new OverloadsDynamic()

    static String method0_0Proxy() {
        return overloads.method0_1()
    }

    static String method3_3Proxy(int arg1) {
        return overloads.method3_3(5, "eew", arg1)
    }

    static String method5_5Proxy(int arg1) {
        return overloads.method5_5(11, "33d", arg1, "eew", 55)
    }

    static String method5_1_default3Proxy(int arg1) {
        return overloads.method5_1_default3(11, arg1)
    }

    static String method5_10Proxy(int arg1) {
        return overloads.method5_10(11, "33d", arg1, "eew", 55)
    }
}
