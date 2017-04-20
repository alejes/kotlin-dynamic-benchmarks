package org.sample.kotlin

class KotlinRunnerString {
    companion object {
        @JvmStatic
        fun z_function(s: String): List<Int> {
            val n = s.length;
            val z: MutableList<Int> = MutableList(n, { _ -> 0 })
            var l = 0
            var r = 0
            for (i in 1 until n) {
                if (i <= r)
                    z[i] = minOf(r - i + 1, z[i - l]);
                while (i + z[i] < n && s[z[i]] == s[i + z[i]]) {
                    z[i] = z[i].inc()
                }
                if (i + z[i] - 1 > r)
                    l = i
                r = i + z[i] - 1;
            }

            return z;
        }

        @JvmStatic
        fun maxRepeatablePrefix(str: String): Int {
            val z = z_function(str)
            // max is extension :(
            var max = z[0]
            for (element in z) {
                max = maxOf(max, element)
            }
            return max
        }
    }
}

class KotlinRunnerDynamic {
    companion object {
        @JvmStatic
        fun z_function(s: dynamic): dynamic {
            val n = s.length;
            val z: dynamic = MutableList(n, { _ -> 0 })
            var l: dynamic = 0
            var r: dynamic = 0
            for (i: dynamic in 1 until n) {
                if (i <= r)
                    z[i] = minOf<dynamic>(r - i + 1, z[i - l]);
                while (i + z[i] < n && s[z[i]] == s[i + z[i]]) {
                    z[i]++
                }
                if (i + z[i] - 1 > r)
                    l = i
                r = i + z[i] - 1;
            }

            return z;
        }

        @JvmStatic
        fun maxRepeatablePrefix(str: String): Int {
            val z = z_function(str)
            // max is extension :(
            var max = z[0]
            for (element in z) {
                max = maxOf<dynamic>(max, element)
            }
            return max
        }
    }
}
