package org.sample.groovy

import groovy.transform.CompileStatic

@CompileStatic
class OverloadsStatic {
    int method0_1() {
        return 111
    }

    int method3_3(int x, int y, int z) {
        return x.hashCode() + y.hashCode() + z.hashCode()
    }

    int method3_3(int x, String y, int z) {
        return x.hashCode() + y.hashCode() + z.hashCode()
    }

    int method3_3(String x, String y, int z) {
        return x.hashCode() + y.hashCode() + z.hashCode()
    }

    int method5_5(int x, int y, int z, int u, int v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_5(int x, String y, int z, String u, int v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_5(int x, int y, String z, int u, int v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_5(int x, String y, int z, int u, int v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_5(String x, int y, int z, int u, int v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_1_default3(int x, int y, int z = 654, int u = 46, int v = 54) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_10(int x, int y, int z, int u, int v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_10(int x, String y, int z, String u, int v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_10(String x, int y, int z, int u, String v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_10(int x, String y, int z, int u, int v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_10(int x, int y, String z, int u, int v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_10(int x, int y, String z, String u, String v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_10(int x, int y, int z, String u, int v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_10(int x, String y, int z, int u, String v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_10(String x, int y, int z, int u, int v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_10(String x, String y, String z, int u, int v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_15(int x, int y, int z, int u, int v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_15(int x, int y, int z, int u, String v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_15(int x, int y, int z, String u, int v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_15(int x, int y, int z, String u, String v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_15(int x, int y, String z, int u, int v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_15(int x, int y, String z, int u, String v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_15(int x, int y, String z, String u, int v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_15(int x, int y, String z, String u, String v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_15(int x, String y, int z, int u, int v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_15(int x, String y, int z, int u, String v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_15(int x, String y, int z, String u, int v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_15(int x, String y, int z, String u, String v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_15(int x, String y, String z, int u, int v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_15(int x, String y, String z, int u, String v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_15(int x, String y, String z, String u, int v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }


    int method5_20(int x, int y, int z, int u, int v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_20(int x, int y, int z, int u, String v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_20(int x, int y, int z, String u, int v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_20(int x, int y, int z, String u, String v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_20(int x, int y, String z, int u, int v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_20(int x, int y, String z, int u, String v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_20(int x, int y, String z, String u, int v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_20(int x, int y, String z, String u, String v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_20(int x, String y, int z, int u, int v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_20(int x, String y, int z, int u, String v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_20(int x, String y, int z, String u, int v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_20(int x, String y, int z, String u, String v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_20(int x, String y, String z, int u, int v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_20(int x, String y, String z, int u, String v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_20(int x, String y, String z, String u, int v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_20(int x, String y, String z, String u, String v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_20(String x, int y, int z, int u, int v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_20(String x, int y, int z, int u, String v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_20(String x, int y, int z, String u, int v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }

    int method5_20(String x, int y, int z, String u, String v) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode()
    }


    int method10_10(int x, int y, int z, int u, int v, int w, int a, int b, int c, int d) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode() + b.hashCode() + c.hashCode() + d.hashCode()
    }

    int method10_10(int x, int y, int z, int u, int v, int w, int a, int b, int c, String d) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode() + b.hashCode() + c.hashCode() + d.hashCode()
    }

    int method10_10(int x, int y, int z, int u, int v, int w, int a, int b, String c, int d) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode() + b.hashCode() + c.hashCode() + d.hashCode()
    }

    int method10_10(int x, int y, int z, int u, int v, int w, int a, int b, String c, String d) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode() + b.hashCode() + c.hashCode() + d.hashCode()
    }

    int method10_10(int x, int y, int z, int u, int v, int w, int a, String b, int c, int d) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode() + b.hashCode() + c.hashCode() + d.hashCode()
    }

    int method10_10(int x, int y, int z, int u, int v, int w, int a, String b, int c, String d) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode() + b.hashCode() + c.hashCode() + d.hashCode()
    }

    int method10_10(int x, int y, int z, int u, int v, int w, int a, String b, String c, int d) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode() + b.hashCode() + c.hashCode() + d.hashCode()
    }

    int method10_10(int x, int y, int z, int u, int v, int w, int a, String b, String c, String d) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode() + b.hashCode() + c.hashCode() + d.hashCode()
    }

    int method10_10(int x, int y, int z, int u, int v, int w, String a, int b, int c, int d) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode() + b.hashCode() + c.hashCode() + d.hashCode()
    }

    int method10_10(int x, int y, int z, int u, int v, int w, String a, int b, int c, String d) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode() + b.hashCode() + c.hashCode() + d.hashCode()
    }

    int method10_2(int x, int y, int z, int u, int v, int w, int a, int b, int c, int d) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode() + b.hashCode() + c.hashCode() + d.hashCode()
    }

    int method10_2(int x, int y, int z, int u, int v, int w, int a, int b, int c, String d) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode() + b.hashCode() + c.hashCode() + d.hashCode()
    }


    int method13_10(int x, int y, int z, int u, int v, int w, int a, int b, int c, int d, int e, int f, int j) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode() + b.hashCode() + c.hashCode() + d.hashCode() + e.hashCode() + f.hashCode() + j.hashCode()
    }

    int method13_10(int x, int y, int z, int u, int v, int w, int a, int b, int c, int d, int e, int f, String j) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode() + b.hashCode() + c.hashCode() + d.hashCode() + e.hashCode() + f.hashCode() + j.hashCode()
    }

    int method13_10(int x, int y, int z, int u, int v, int w, int a, int b, int c, int d, int e, String f, int j) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode() + b.hashCode() + c.hashCode() + d.hashCode() + e.hashCode() + f.hashCode() + j.hashCode()
    }

    int method13_10(int x, int y, int z, int u, int v, int w, int a, int b, int c, int d, int e, String f, String j) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode() + b.hashCode() + c.hashCode() + d.hashCode() + e.hashCode() + f.hashCode() + j.hashCode()
    }

    int method13_10(int x, int y, int z, int u, int v, int w, int a, int b, int c, int d, String e, int f, int j) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode() + b.hashCode() + c.hashCode() + d.hashCode() + e.hashCode() + f.hashCode() + j.hashCode()
    }

    int method13_10(int x, int y, int z, int u, int v, int w, int a, int b, int c, int d, String e, int f, String j) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode() + b.hashCode() + c.hashCode() + d.hashCode() + e.hashCode() + f.hashCode() + j.hashCode()
    }

    int method13_10(int x, int y, int z, int u, int v, int w, int a, int b, int c, int d, String e, String f, int j) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode() + b.hashCode() + c.hashCode() + d.hashCode() + e.hashCode() + f.hashCode() + j.hashCode()
    }

    int method13_10(int x, int y, int z, int u, int v, int w, int a, int b, int c, int d, String e, String f, String j) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode() + b.hashCode() + c.hashCode() + d.hashCode() + e.hashCode() + f.hashCode() + j.hashCode()
    }

    int method13_10(int x, int y, int z, int u, int v, int w, int a, int b, int c, String d, int e, int f, int j) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode() + b.hashCode() + c.hashCode() + d.hashCode() + e.hashCode() + f.hashCode() + j.hashCode()
    }

    int method13_10(int x, int y, int z, int u, int v, int w, int a, int b, int c, String d, int e, int f, String j) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode() + b.hashCode() + c.hashCode() + d.hashCode() + e.hashCode() + f.hashCode() + j.hashCode()
    }

    int method7_10(int x, int y, int z, int u, int v, int w, int a) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode()
    }

    int method7_10(int x, int y, int z, int u, int v, int w, String a) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode()
    }

    int method7_10(int x, int y, int z, int u, int v, String w, int a) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode()
    }

    int method7_10(int x, int y, int z, int u, int v, String w, String a) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode()
    }

    int method7_10(int x, int y, int z, int u, String v, int w, int a) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode()
    }

    int method7_10(int x, int y, int z, int u, String v, int w, String a) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode()
    }

    int method7_10(int x, int y, int z, int u, String v, String w, int a) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode()
    }

    int method7_10(int x, int y, int z, int u, String v, String w, String a) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode()
    }

    int method7_10(int x, int y, int z, String u, int v, int w, int a) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode()
    }

    int method7_10(int x, int y, int z, String u, int v, int w, String a) {
        return x.hashCode() + y.hashCode() + z.hashCode() + u.hashCode() + v.hashCode() + w.hashCode() + a.hashCode()
    }
}

@CompileStatic
class GroovyRunnerStatic {
    static OverloadsStatic overloads = new OverloadsStatic()

    static int method0_0Proxy() {
        return overloads.method0_1()
    }

    static int method3_3Proxy(int arg1) {
        return overloads.method3_3(5, "eew", arg1)
    }

    static int method5_5Proxy(int arg1) {
        return overloads.method5_5(11, "33d", arg1, "eew", 55)
    }

    static int method5_1_default3Proxy(int arg1) {
        return overloads.method5_1_default3(11, arg1)
    }

    static int method5_10Proxy(int arg1) {
        return overloads.method5_10(11, "33d", arg1, "eew", 55)
    }

    static int method5_15Proxy(int arg1) {
        return overloads.method5_15(11, "33d", arg1, "eew", 55)
    }

    static int method5_20Proxy(int arg1) {
        return overloads.method5_20(11, "33d", arg1, "eew", 55)
    }

    static int method7_10Proxy(int arg1) {
        return overloads.method7_10(11, 11, 11, 11, 11, "ss", arg1)
    }

    static int method10_10Proxy(int arg1) {
        return overloads.method10_10(11, 11, 11, 11, 11, 11, 11, 11, "ss", arg1)
    }

    static int method13_10Proxy(int arg1) {
        return overloads.method13_10(11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, "ss", arg1)
    }
}
