package org.sample.groovy

import java.util.stream.Collectors


class MyComplexInvokeDynamic {
    double re = 0
    double im = 0

    MyComplexInvokeDynamic(double re) {
        this.re = re
    }

    MyComplexInvokeDynamic(double re, double im) {
        this.re = re
        this.im = im
    }

    MyComplexInvokeDynamic multiply(MyComplexInvokeDynamic other) {
        return new MyComplexInvokeDynamic(this.re * other.re - this.im * other.im,
                this.im * other.re + other.im * this.re)
    }

    MyComplexInvokeDynamic plus(MyComplexInvokeDynamic other) {
        return new MyComplexInvokeDynamic(this.re + other.re, this.im + other.im)
    }

    MyComplexInvokeDynamic minus(MyComplexInvokeDynamic other) {
        return new MyComplexInvokeDynamic(this.re - other.re, this.im - other.im)
    }

    MyComplexInvokeDynamic div(MyComplexInvokeDynamic other) {
        double re2 = other.re * other.re
        double im2 = other.im * other.im
        double denominator = re2 + im2

        return new MyComplexInvokeDynamic((this.re * other.re + this.im * other.im) / denominator,
                (this.im * other.re - other.im * this.re) / denominator)
    }


    String toString() {
        return "{$re;$im}"
    }
}


class GroovyRunnerInvokeDynamic {
    static fft(a, invert) {
        def n = a.size()
        if (n == 1) return
        def size = ((int) n).intdiv(2).intValue()
        def a0 = new ArrayList<MyComplexInvokeDynamic>(size)
        for (i in 0..size - 1) {
            a0.add(new MyComplexInvokeDynamic(0.0))
        }
        def a1 = new ArrayList<MyComplexInvokeDynamic>(size)
        for (i in 0..size - 1) {
            a1.add(new MyComplexInvokeDynamic(0.0))
        }
        def i = 0
        def j = 0
        while (i < n) {
            a0[j] = a[i]
            a1[j] = a[i + 1]
            i += 2
            ++j
        }
        fft(a0, invert)
        fft(a1, invert)
        def ang = 2 * Math.PI / n * ((invert) ? -1 : 1)
        def w = new MyComplexInvokeDynamic(1.0)
        def wn = new MyComplexInvokeDynamic(Math.cos(ang), Math.sin(ang))
        i = 0
        while (i < n / 2) {
            a[i] = a0[i] + w * a1[i]
            a[(i + (((int) n).intdiv(2))).intValue()] = a0[i] - w * a1[i]
            if (invert) {
                a[i] /= new MyComplexInvokeDynamic(2.0)
                a[(i + (((int) n).intdiv(2))).intValue()] /= new MyComplexInvokeDynamic(2.0)
            }
            w *= wn
            ++i
        }
    }

    static List<Double> fftProxy(List<Double> list) {
        List<MyComplexInvokeDynamic> complexList = list.stream().map { new MyComplexInvokeDynamic(it) }.collect(Collectors.toList())
        fft(complexList, false)
        return complexList.stream().map { it.re }.collect(Collectors.toList())
    }
}
