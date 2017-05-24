package org.sample.groovy

class GroovyRunnerInvokeDynamic {
    static overloads = new OverloadsStatic()

    static int method0_0Proxy() {
        def res = 0
        res += overloads.method0_1()
        return res
    }

    static int method3_3Proxy(List args) {
        def res = 0
        for (arg in args) {
            res += overloads.method3_3(5, arg, 5)
        }
        return res
    }

    static int method5_5Proxy(List args) {
        def res = 0
        for (arg in args) {
            res += overloads.method5_5(11, 5, arg, 43, 3434)
        }
        return res
    }

    static int method5_2_default3Proxy(List args) {
        def res = 0
        for (arg in args) {
            res += overloads.method5_1_default3(11, 23, arg)
        }
        return res
    }

    static int method5_10Proxy(List args) {
        def res = 0
        for (arg in args) {
            res += overloads.method5_10(11, 33, arg, 23232, 55)
        }
        return res
    }

    static int method5_15Proxy(List args) {
        def res = 0
        for (arg1 in args) {
            res += overloads.method5_15(11, "33d", arg1, "eew", 55)
        }
        return res
    }

    static int method5_20Proxy(List args) {
        def res = 0
        for (arg1 in args) {
            res += overloads.method5_20(11, "33d", arg1, "eew", 55)
        }
        return res
    }

    static int method7_10Proxy(List args) {
        def res = 0
        for (arg1 in args) {
            res += overloads.method7_10(11, 11, 11, 11, 11, 1, arg1)
        }
        return res
    }

    static int method10_10Proxy(List args) {
        def res = 0
        for (arg1 in args) {
            res += overloads.method10_10(11, 11, 11, 11, 11, 11, 11, 11, 1, arg1)
        }
        return res
    }

    static int method13_10Proxy(List args) {
        def res = 0
        for (arg1 in args) {
            res += overloads.method13_10(11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, arg1)
        }
        return res
    }
}
