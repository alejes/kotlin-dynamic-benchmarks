package org.sample.kotlin


class KotlinRunnerDynamic {
    companion object {
        @JvmStatic
        fun matrixSquare(source: dynamic): dynamic {
            val destination: dynamic = mutableListOf<MutableList<Int>>();
            for (i in 0..source.size-1) {
                destination.add(mutableListOf<Int>())
                for (j in 0..source.size-1) {
                    destination[i].add(j, 0)
                }
            }


            for (i in 0..source.size-1) {
                for (j in 0..source.size-1) {
                    for (k in 0..source.size-1) {
                        destination[i][j] += source[i][k] * source[k][j]
                    }
                }
            }

            return destination;
        }

        @JvmStatic
        fun matrixSquareProxy(source: List<List<Int>>): List<List<Int>>
            = matrixSquare(source)
    }
}

class KotlinRunnerStatic {
    companion object {
        @JvmStatic
        fun matrixSquare(source: List<List<Int>>): List<List<Int>> {
            val destination: MutableList<MutableList<Int>> = mutableListOf<MutableList<Int>>();
            for (i in 0..source.size-1) {
                destination.add(mutableListOf<Int>())
                for (j in 0..source.size-1) {
                    destination[i].add(j, 0)
                }
            }


            for (i in 0..source.size-1) {
                for (j in 0..source.size-1) {
                    for (k in 0..source.size-1) {
                        destination[i][j] += source[i][k] * source[k][j]
                    }
                }
            }

            return destination;
        }

        @JvmStatic
        fun matrixSquareProxy(source: List<List<Int>>): List<List<Int>>
            = matrixSquare(source)
    }
}
