package org.sample;


import org.openjdk.jmh.annotations.*;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.sample.groovy.GroovyRunnerDynamic;
import org.sample.groovy.GroovyRunnerInvokeDynamic;
import org.sample.kotlin.KotlinRunnerDynamic;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class MyBenchmark {
    private static int n = 1000;
    private List<Object> list = new ArrayList<>();

    private static <T> List<T> shuffle(List<T> items) {
        Random rg = new Random();
        for (int i = 0; i < items.size(); ++i) {
            int randomPosition = rg.nextInt(items.size());
            T tmp = items.get(i);
            items.set(i, items.get(randomPosition));
            items.set(randomPosition, tmp);
        }
        return items;
    }

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
        list = new ArrayList<>();
        for (int i = 0; i < n; ++i) {
            list.add("aba");
            list.add(24);
        }
        list = shuffle(list);
    }

    @Benchmark
    public int kotlinDynamicMethod0_0() {
        return KotlinRunnerDynamic.method0_0Proxy();
    }

    @Benchmark
    public int kotlinDynamicMethod3_3() {
        return KotlinRunnerDynamic.method3_3Proxy(list);
    }

    @Benchmark
    public int kotlinDynamicMethod5_2_default3Proxy() {
        return KotlinRunnerDynamic.method5_2_default3Proxy(list);
    }

    @Benchmark
    public int kotlinDynamicMethod5Proxy() {
        return KotlinRunnerDynamic.method5_5Proxy(list);
    }

    @Benchmark
    public int kotlinDynamicMethod5_10() {
        return KotlinRunnerDynamic.method5_10Proxy(list);
    }

    @Benchmark
    public int kotlinDynamicMethod5_15() {
        return KotlinRunnerDynamic.method5_15Proxy(list);
    }

    @Benchmark
    public int kotlinDynamicMethod5_20() {
        return KotlinRunnerDynamic.method5_20Proxy(list);
    }

    @Benchmark
    public int kotlinDynamicMethod7_10() {
        return KotlinRunnerDynamic.method7_10Proxy(list);
    }

    @Benchmark
    public int kotlinDynamicMethod10_10() {
        return KotlinRunnerDynamic.method10_10Proxy(list);
    }

    @Benchmark
    public int kotlinDynamicMethod13_10() {
        return KotlinRunnerDynamic.method13_10Proxy(list);
    }

    @Benchmark
    public int GroovyDynamicMethod0_0() {
        return GroovyRunnerDynamic.method0_0Proxy();
    }

    @Benchmark
    public int GroovyDynamicMethod3_3() {
        return GroovyRunnerDynamic.method3_3Proxy(list);
    }

    @Benchmark
    public int GroovyDynamicMethod5_2_default3Proxy() {
        return GroovyRunnerDynamic.method5_2_default3Proxy(list);
    }

    @Benchmark
    public int GroovyDynamicMethod5Proxy() {
        return GroovyRunnerDynamic.method5_5Proxy(list);
    }

    @Benchmark
    public int GroovyDynamicMethod5_10() {
        return GroovyRunnerDynamic.method5_10Proxy(list);
    }

    @Benchmark
    public int GroovyDynamicMethod5_15() {
        return GroovyRunnerDynamic.method5_15Proxy(list);
    }

    @Benchmark
    public int GroovyDynamicMethod5_20() {
        return GroovyRunnerDynamic.method5_20Proxy(list);
    }

    @Benchmark
    public int GroovyDynamicMethod7_10() {
        return GroovyRunnerDynamic.method7_10Proxy(list);
    }

    @Benchmark
    public int GroovyDynamicMethod10_10() {
        return GroovyRunnerDynamic.method10_10Proxy(list);
    }

    @Benchmark
    public int GroovyDynamicMethod13_10() {
        return GroovyRunnerDynamic.method13_10Proxy(list);
    }

    @Benchmark
    public int GroovyInvokeDynamicMethod0_0() {
        return GroovyRunnerInvokeDynamic.method0_0Proxy();
    }

    @Benchmark
    public int GroovyInvokeDynamicMethod3_3() {
        return GroovyRunnerInvokeDynamic.method3_3Proxy(list);
    }

    @Benchmark
    public int GroovyInvokeDynamicMethod5_2_default3Proxy() {
        return GroovyRunnerInvokeDynamic.method5_2_default3Proxy(list);
    }

    @Benchmark
    public int GroovyInvokeDynamicMethod5Proxy() {
        return GroovyRunnerInvokeDynamic.method5_5Proxy(list);
    }

    @Benchmark
    public int GroovyInvokeDynamicMethod5_10() {
        return GroovyRunnerInvokeDynamic.method5_10Proxy(list);
    }

    @Benchmark
    public int GroovyInvokeDynamicMethod5_15() {
        return GroovyRunnerInvokeDynamic.method5_15Proxy(list);
    }

    @Benchmark
    public int GroovyInvokeDynamicMethod5_20() {
        return GroovyRunnerInvokeDynamic.method5_20Proxy(list);
    }

    @Benchmark
    public int GroovyInvokeDynamicMethod7_10() {
        return GroovyRunnerInvokeDynamic.method7_10Proxy(list);
    }

    @Benchmark
    public int GroovyInvokeDynamicMethod10_10() {
        return GroovyRunnerInvokeDynamic.method10_10Proxy(list);
    }

    @Benchmark
    public int GroovyInvokeDynamicMethod13_10() {
        return GroovyRunnerInvokeDynamic.method13_10Proxy(list);
    }

}
