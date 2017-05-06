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
import org.sample.kotlin.KotlinRunnerString;

import java.util.Random;
import java.util.concurrent.TimeUnit;

@State(Scope.Thread)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class MyBenchmark {

    @Param({"100", "500", "1000", "1250", "1500"})
    private int n = 0;

    private String str = "";

    private Random rnd;

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
        rnd = new Random(42);
        //System.out.println("list prepared");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; ++i) {
            stringBuilder.append((char) ('A' + rnd.nextInt('Z' - 'A')));
        }
        str = stringBuilder.toString();
    }

    @Benchmark
    public long kotlinStringDynamic() {
        return KotlinRunnerDynamic.Companion.maxRepeatablePrefix(str);
    }

    @Benchmark
    public long kotlinString() {
        return KotlinRunnerString.Companion.maxRepeatablePrefix(str);
    }

    @Benchmark
    public long groovyStringStatic() {
        return GroovyRunnerStatic.maxRepeatablePrefix(str);
    }

    @Benchmark
    public long groovyStringTraditional() {
        return GroovyRunnerDynamic.maxRepeatablePrefix(str);
    }

    @Benchmark
    public long groovyStringInvokeDynamic() {
        return GroovyRunnerInvokeDynamic.maxRepeatablePrefix(str);
    }

}
