package org.sample.groovy

class GroovyRunnerInvokeDynamic {
    static x = new OverloadsStatic()

    static int method0_0Proxy() {
        def res = 0
        res += x.method0_1()
        return res
    }

    static int method3_3Proxy(List args) {
        def res = 0
        for (arg in args) {
            res += x.method3_3(5, arg, 5)
        }
        return res
    }

    static int method5_5Proxy(List args) {
        def res = 0
        for (arg in args) {
            res += x.method5_5(11, 5, arg, 43, 3434)
        }
        return res
    }

    static int method5_2_default3Proxy(List args) {
        def res = 0
        for (arg in args) {
            res += x.method5_1_default3(11, 23, arg)
        }
        return res
    }

    static int method5_10Proxy(List args) {
        def res = 0
        for (arg in args) {
            res += x.method5_10(11, 33, arg, 23232, 55)
        }
        return res
    }
}
