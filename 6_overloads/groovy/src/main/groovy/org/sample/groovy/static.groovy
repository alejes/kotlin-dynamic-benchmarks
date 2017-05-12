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

    int method5_1_default3(int x, int y, String z, int u = 46, int v = 54) {
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
}