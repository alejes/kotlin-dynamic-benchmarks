package org.sample.groovy

class GroovyRunnerDynamic {
    static z_function(s) {
        def n = s.length()
        def z = new ArrayList<Integer>(n)
        for (i in 1..n)
            z.add(0)
        def l = 0
        def r = 0
        for (i in 1..(n - 1)) {
            if (i <= r)
                z[i] = Math.min(r - i + 1, z[i - l]);
            while (i + z[i] < n
                    && s[z[i]] == s[i + z[i]]) {
                z[i]++
            }
            if (i + z[i] - 1 > r)
                l = i
            r = i + z[i] - 1;
        }

        return z;
    }

    static int maxRepeatablePrefix(String str) {
        def z = z_function(str)
        def max = z[0]
        for (element in z) {
            max = Math.max(max, element)
        }
        return (int) max
    }
}