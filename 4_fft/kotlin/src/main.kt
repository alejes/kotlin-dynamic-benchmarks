package org.sample.kotlin

import java.util.stream.Collectors

class MyComplex(val re: Double, val im: Double) {

    constructor(re: Double) : this(re, 0.0)

    constructor(re: Int) : this(re.toDouble(), 0.0)

    constructor(re: Int, im: Int) : this(re.toDouble(), im.toDouble())


    operator fun times(other: MyComplex): MyComplex {
        return MyComplex(this.re * other.re - this.im * other.im,
                this.re * other.im + this.im * other.re)
    }

    operator fun plus(other: MyComplex): MyComplex {
        return MyComplex(this.re + other.re, this.im + other.im)
    }

    operator fun minus(other: MyComplex): MyComplex {
        return MyComplex(this.re - other.re, this.im - other.im)
    }

    operator fun div(other: MyComplex): MyComplex {
        val re2 = other.re * other.re
        val im2 = other.im * other.im
        val denominator = re2 + im2
        return MyComplex((this.re * other.re + this.im * other.im) / denominator,
                (this.im * other.re - this.re * other.im) / denominator)
    }

    override fun toString(): String {
        return "{$re;$im}"
    }
}

class KotlinRunnerStatic {
    companion object {
        @JvmStatic
        fun fft(a: MutableList<MyComplex>, invert: Boolean) {
            val n = a.size;
            if (n == 1) return
            val a0 = MutableList(n / 2, { _ -> MyComplex(0.0) })
            val a1 = MutableList(n / 2, { _ -> MyComplex(0.0) })
            var i = 0
            var j = 0
            while (i < n) {
                a0[j] = a[i]
                a1[j] = a[i + 1]
                i += 2
                ++j
            }
            fft(a0, invert)
            fft(a1, invert)
            val ang = 2 * Math.PI / n * (if (invert) -1 else 1)
            var w = MyComplex(1.0)
            val wn = MyComplex(Math.cos(ang), Math.sin(ang))
            i = 0
            while (i < n / 2) {
                a[i] = a0[i] + w * a1[i]
                a[i + n / 2] = a0[i] - w * a1[i]
                if (invert) {
                    a[i] /= MyComplex(2.0)
                    a[i + n / 2] /= MyComplex(2.0)
                }
                w *= wn
                ++i
            }
        }

        @JvmStatic
        fun fftProxy(list: MutableList<Double>): MutableList<Double> {
            val complexList = list.stream().map { MyComplex(it) }.collect(Collectors.toList())
            fft(complexList, false)
            return complexList.stream().map { it.re }.collect(Collectors.toList())
        }
    }
}


class KotlinRunnerDynamic {
    companion object {
        @JvmStatic
        fun fft(a: dynamic, invert: dynamic) {
            val n: dynamic = a.size;
            if (n == 1) return
            val a0: dynamic = MutableList(n / 2, { _ -> MyComplex(0.0) })
            val a1: dynamic = MutableList(n / 2, { _ -> MyComplex(0.0) })
            var i: dynamic = 0
            var j: dynamic = 0
            while (i < n) {
                a0[j] = a[i]
                a1[j] = a[i + 1]
                i += 2
                ++j
            }
            fft(a0, invert)
            fft(a1, invert)
            val pi2: dynamic = 2 * Math.PI
            val ang: dynamic = pi2 / n * (if (invert) -1 else 1)
            var w: dynamic = MyComplex(1.0)
            val wn: dynamic = MyComplex(Math.cos(ang), Math.sin(ang))
            val zero: dynamic = 0
            i = zero
            while (i < n / 2) {
                a[i] = a0[i] + w * a1[i]
                a[i + n / 2] = a0[i] - w * a1[i]
                if (invert) {
                    a[i] /= MyComplex(2.0)
                    a[i + n / 2] /= MyComplex(2.0)
                }
                w *= wn
                ++i
            }
        }

        @JvmStatic
        fun fftProxy(list: MutableList<Double>): MutableList<Double> {
            val complexList = list.stream().map { MyComplex(it) }.collect(Collectors.toList())
            fft(complexList, false)
            return complexList.stream().map { it.re }.collect(Collectors.toList())
        }
    }
}
