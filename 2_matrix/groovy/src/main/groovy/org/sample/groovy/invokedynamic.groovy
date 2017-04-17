package org.sample.groovy

class GroovyRunnerInvokeDynamic {
    static matrixSquare(source) {
        def destination = new ArrayList<ArrayList<Integer>>();
        for (i in 0..source.size()-1) {
            destination.add(new ArrayList<Integer>())
            for (j in 0..source.size()-1) {
                destination[i].add(j, 0)
            }
        }


        for (i in 0..source.size()-1) {
            for (j in 0..source.size()-1) {
                for (k in 0..source.size()-1) {
                    def temp = source[i][k] * source[k][j];
                    destination[i][j] = temp + destination[i][j];
                }
            }
        }

        return destination;
    }

    static List<List<Integer>> matrixSquareProxy(List<List<Integer>> source) {
        return matrixSquare(source)
    }
}