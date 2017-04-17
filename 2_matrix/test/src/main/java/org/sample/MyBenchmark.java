package org.sample;


import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.sample.groovy.GroovyRunnerDynamic;
import org.sample.groovy.GroovyRunnerInvokeDynamic;
import org.sample.groovy.GroovyRunnerStatic;
import org.sample.kotlin.KotlinRunnerDynamic;
import org.sample.kotlin.KotlinRunnerStatic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class MyBenchmark {

    @Param({"10", "20", "30"})
    private int n = 0;

    private List<List<Integer>> list;
    private Random rnd = new Random();

    public static void main(String[] args) throws RunnerException {
        Options opt = new OptionsBuilder()
                .include(MyBenchmark.class.getSimpleName())
                .warmupIterations(5)
                .measurementIterations(5)
                .forks(1)
                .jvmArgs("-Xmx16m")
                .build();

        new Runner(opt).run();
    }

    @Setup(Level.Trial)
    public void prepare() {
        list = new ArrayList<>(n);
        for (int i = 0; i < n; ++i) {
            list.add(rnd.ints().limit(n).boxed().collect(Collectors.toList()));
        }
    }

    @Benchmark
    public List<List<Integer>> kotlinDynamic() {
        return KotlinRunnerDynamic.Companion.matrixSquareProxy(list);
    }

    @Benchmark
    public List<List<Integer>> kotlinInt() {
        return KotlinRunnerStatic.Companion.matrixSquareProxy(list);
    }

    @Benchmark
    public List<List<Integer>> groovyIntStatic() {
        return GroovyRunnerStatic.matrixSquareProxy(list);
    }

    @Benchmark
    public List<List<Integer>> groovyTraditional() {
        return GroovyRunnerDynamic.matrixSquareProxy(list);
    }

    @Benchmark
    public List<List<Integer>> groovyInvokeDynamic() {
        return GroovyRunnerInvokeDynamic.matrixSquareProxy(list);
    }

}
