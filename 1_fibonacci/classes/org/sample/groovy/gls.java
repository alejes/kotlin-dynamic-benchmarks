Classfile /home/user/Diplom/kotlin-dynamic-benchmarks/1_fibonacci/classes/org/sample/groovy/GroovyRunnerLongStatic.class
  Last modified Apr 17, 2017; size 5036 bytes
  MD5 checksum 231a5096dfcbe2512b3e920e947a0943
  Compiled from "static.groovy"
public class org.sample.groovy.GroovyRunnerLongStatic implements groovy.lang.GroovyObject
  minor version: 0
  major version: 49
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
    #1 = Utf8               org/sample/groovy/GroovyRunnerLongStatic
    #2 = Class              #1            // org/sample/groovy/GroovyRunnerLongStatic
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               groovy/lang/GroovyObject
    #6 = Class              #5            // groovy/lang/GroovyObject
    #7 = Utf8               static.groovy
    #8 = Utf8               $staticClassInfo
    #9 = Utf8               Lorg/codehaus/groovy/reflection/ClassInfo;
   #10 = Utf8               __$stMC
   #11 = Utf8               Z
   #12 = Utf8               metaClass
   #13 = Utf8               Lgroovy/lang/MetaClass;
   #14 = Utf8               $staticClassInfo$
   #15 = Utf8               __timeStamp
   #16 = Utf8               J
   #17 = Utf8               __timeStamp__239_neverHappen1492423956346
   #18 = Utf8               <init>
   #19 = Utf8               ()V
   #20 = NameAndType        #18:#19       // "<init>":()V
   #21 = Methodref          #4.#20        // java/lang/Object."<init>":()V
   #22 = Utf8               $getStaticMetaClass
   #23 = Utf8               ()Lgroovy/lang/MetaClass;
   #24 = NameAndType        #22:#23       // $getStaticMetaClass:()Lgroovy/lang/MetaClass;
   #25 = Methodref          #2.#24        // org/sample/groovy/GroovyRunnerLongStatic.$getStaticMetaClass:()Lgroovy/lang/MetaClass;
   #26 = NameAndType        #12:#13       // metaClass:Lgroovy/lang/MetaClass;
   #27 = Fieldref           #2.#26        // org/sample/groovy/GroovyRunnerLongStatic.metaClass:Lgroovy/lang/MetaClass;
   #28 = Utf8               this
   #29 = Utf8               Lorg/sample/groovy/GroovyRunnerLongStatic;
   #30 = Utf8               fib
   #31 = Utf8               (J)J
   #32 = NameAndType        #30:#31       // fib:(J)J
   #33 = Methodref          #2.#32        // org/sample/groovy/GroovyRunnerLongStatic.fib:(J)J
   #34 = Utf8               n
   #35 = Integer            0
   #36 = Utf8               fibProxy
   #37 = Utf8               getClass
   #38 = Utf8               ()Ljava/lang/Class;
   #39 = NameAndType        #37:#38       // getClass:()Ljava/lang/Class;
   #40 = Methodref          #4.#39        // java/lang/Object.getClass:()Ljava/lang/Class;
   #41 = Utf8               org/codehaus/groovy/runtime/ScriptBytecodeAdapter
   #42 = Class              #41           // org/codehaus/groovy/runtime/ScriptBytecodeAdapter
   #43 = Utf8               initMetaClass
   #44 = Utf8               (Ljava/lang/Object;)Lgroovy/lang/MetaClass;
   #45 = NameAndType        #43:#44       // initMetaClass:(Ljava/lang/Object;)Lgroovy/lang/MetaClass;
   #46 = Methodref          #42.#45       // org/codehaus/groovy/runtime/ScriptBytecodeAdapter.initMetaClass:(Ljava/lang/Object;)Lgroovy/lang/MetaClass;
   #47 = NameAndType        #8:#9         // $staticClassInfo:Lorg/codehaus/groovy/reflection/ClassInfo;
   #48 = Fieldref           #2.#47        // org/sample/groovy/GroovyRunnerLongStatic.$staticClassInfo:Lorg/codehaus/groovy/reflection/ClassInfo;
   #49 = Utf8               org/codehaus/groovy/reflection/ClassInfo
   #50 = Class              #49           // org/codehaus/groovy/reflection/ClassInfo
   #51 = Utf8               getClassInfo
   #52 = Utf8               (Ljava/lang/Class;)Lorg/codehaus/groovy/reflection/ClassInfo;
   #53 = NameAndType        #51:#52       // getClassInfo:(Ljava/lang/Class;)Lorg/codehaus/groovy/reflection/ClassInfo;
   #54 = Methodref          #50.#53       // org/codehaus/groovy/reflection/ClassInfo.getClassInfo:(Ljava/lang/Class;)Lorg/codehaus/groovy/reflection/ClassInfo;
   #55 = Utf8               getMetaClass
   #56 = NameAndType        #55:#23       // getMetaClass:()Lgroovy/lang/MetaClass;
   #57 = Methodref          #50.#56       // org/codehaus/groovy/reflection/ClassInfo.getMetaClass:()Lgroovy/lang/MetaClass;
   #58 = Utf8               this$dist$invoke$1
   #59 = Utf8               (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
   #60 = Utf8               org/codehaus/groovy/runtime/GStringImpl
   #61 = Class              #60           // org/codehaus/groovy/runtime/GStringImpl
   #62 = Utf8               java/lang/String
   #63 = Class              #62           // java/lang/String
   #64 = Utf8
   #65 = String             #64           //
   #66 = Utf8               ([Ljava/lang/Object;[Ljava/lang/String;)V
   #67 = NameAndType        #18:#66       // "<init>":([Ljava/lang/Object;[Ljava/lang/String;)V
   #68 = Methodref          #61.#67       // org/codehaus/groovy/runtime/GStringImpl."<init>":([Ljava/lang/Object;[Ljava/lang/String;)V
   #69 = Utf8               org/codehaus/groovy/runtime/typehandling/ShortTypeHandling
   #70 = Class              #69           // org/codehaus/groovy/runtime/typehandling/ShortTypeHandling
   #71 = Utf8               castToString
   #72 = Utf8               (Ljava/lang/Object;)Ljava/lang/String;
   #73 = NameAndType        #71:#72       // castToString:(Ljava/lang/Object;)Ljava/lang/String;
   #74 = Methodref          #70.#73       // org/codehaus/groovy/runtime/typehandling/ShortTypeHandling.castToString:(Ljava/lang/Object;)Ljava/lang/String;
   #75 = Utf8               despreadList
   #76 = Utf8               ([Ljava/lang/Object;[Ljava/lang/Object;[I)[Ljava/lang/Object;
   #77 = NameAndType        #75:#76       // despreadList:([Ljava/lang/Object;[Ljava/lang/Object;[I)[Ljava/lang/Object;
   #78 = Methodref          #42.#77       // org/codehaus/groovy/runtime/ScriptBytecodeAdapter.despreadList:([Ljava/lang/Object;[Ljava/lang/Object;[I)[Ljava/lang/Object;
   #79 = Utf8               invokeMethodOnCurrentN
   #80 = Utf8               (Ljava/lang/Class;Lgroovy/lang/GroovyObject;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
   #81 = NameAndType        #79:#80       // invokeMethodOnCurrentN:(Ljava/lang/Class;Lgroovy/lang/GroovyObject;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
   #82 = Methodref          #42.#81       // org/codehaus/groovy/runtime/ScriptBytecodeAdapter.invokeMethodOnCurrentN:(Ljava/lang/Class;Lgroovy/lang/GroovyObject;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
   #83 = Utf8               name
   #84 = Utf8               Ljava/lang/String;
   #85 = Utf8               args
   #86 = Utf8               Ljava/lang/Object;
   #87 = Utf8               this$dist$set$1
   #88 = Utf8               (Ljava/lang/String;Ljava/lang/Object;)V
   #89 = Utf8               setGroovyObjectProperty
   #90 = Utf8               (Ljava/lang/Object;Ljava/lang/Class;Lgroovy/lang/GroovyObject;Ljava/lang/String;)V
   #91 = NameAndType        #89:#90       // setGroovyObjectProperty:(Ljava/lang/Object;Ljava/lang/Class;Lgroovy/lang/GroovyObject;Ljava/lang/String;)V
   #92 = Methodref          #42.#91       // org/codehaus/groovy/runtime/ScriptBytecodeAdapter.setGroovyObjectProperty:(Ljava/lang/Object;Ljava/lang/Class;Lgroovy/lang/GroovyObject;Ljava/lang/String;)V
   #93 = Utf8               value
   #94 = Utf8               this$dist$get$1
   #95 = Utf8               (Ljava/lang/String;)Ljava/lang/Object;
   #96 = Utf8               getGroovyObjectProperty
   #97 = Utf8               (Ljava/lang/Class;Lgroovy/lang/GroovyObject;Ljava/lang/String;)Ljava/lang/Object;
   #98 = NameAndType        #96:#97       // getGroovyObjectProperty:(Ljava/lang/Class;Lgroovy/lang/GroovyObject;Ljava/lang/String;)Ljava/lang/Object;
   #99 = Methodref          #42.#98       // org/codehaus/groovy/runtime/ScriptBytecodeAdapter.getGroovyObjectProperty:(Ljava/lang/Class;Lgroovy/lang/GroovyObject;Ljava/lang/String;)Ljava/lang/Object;
  #100 = Utf8               setMetaClass
  #101 = Utf8               (Lgroovy/lang/MetaClass;)V
  #102 = Utf8               invokeMethod
  #103 = Methodref          #2.#56        // org/sample/groovy/GroovyRunnerLongStatic.getMetaClass:()Lgroovy/lang/MetaClass;
  #104 = Utf8               groovy/lang/MetaClass
  #105 = Class              #104          // groovy/lang/MetaClass
  #106 = Utf8               (Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
  #107 = NameAndType        #102:#106     // invokeMethod:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
  #108 = InterfaceMethodref #105.#107     // groovy/lang/MetaClass.invokeMethod:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
  #109 = Utf8               getProperty
  #110 = Utf8               (Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
  #111 = NameAndType        #109:#110     // getProperty:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
  #112 = InterfaceMethodref #105.#111     // groovy/lang/MetaClass.getProperty:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
  #113 = Utf8               setProperty
  #114 = Utf8               (Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
  #115 = NameAndType        #113:#114     // setProperty:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
  #116 = InterfaceMethodref #105.#115     // groovy/lang/MetaClass.setProperty:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
  #117 = Utf8               __$swapInit
  #118 = Utf8               <clinit>
  #119 = NameAndType        #117:#19      // __$swapInit:()V
  #120 = Methodref          #2.#119       // org/sample/groovy/GroovyRunnerLongStatic.__$swapInit:()V
  #121 = Utf8               java/lang/Long
  #122 = Class              #121          // java/lang/Long
  #123 = Utf8               valueOf
  #124 = Utf8               (J)Ljava/lang/Long;
  #125 = NameAndType        #123:#124     // valueOf:(J)Ljava/lang/Long;
  #126 = Methodref          #122.#125     // java/lang/Long.valueOf:(J)Ljava/lang/Long;
  #127 = Utf8               longValue
  #128 = Utf8               ()J
  #129 = NameAndType        #127:#128     // longValue:()J
  #130 = Methodref          #122.#129     // java/lang/Long.longValue:()J
  #131 = NameAndType        #17:#16       // __timeStamp__239_neverHappen1492423956346:J
  #132 = Fieldref           #2.#131       // org/sample/groovy/GroovyRunnerLongStatic.__timeStamp__239_neverHappen1492423956346:J
  #133 = Long               1492423956346l
  #135 = NameAndType        #15:#16       // __timeStamp:J
  #136 = Fieldref           #2.#135       // org/sample/groovy/GroovyRunnerLongStatic.__timeStamp:J
  #137 = Utf8               super$1$notify
  #138 = Utf8               notify
  #139 = NameAndType        #138:#19      // notify:()V
  #140 = Methodref          #4.#139       // java/lang/Object.notify:()V
  #141 = Utf8               super$1$hashCode
  #142 = Utf8               ()I
  #143 = Utf8               hashCode
  #144 = NameAndType        #143:#142     // hashCode:()I
  #145 = Methodref          #4.#144       // java/lang/Object.hashCode:()I
  #146 = Utf8               super$1$toString
  #147 = Utf8               ()Ljava/lang/String;
  #148 = Utf8               toString
  #149 = NameAndType        #148:#147     // toString:()Ljava/lang/String;
  #150 = Methodref          #4.#149       // java/lang/Object.toString:()Ljava/lang/String;
  #151 = Utf8               super$1$clone
  #152 = Utf8               ()Ljava/lang/Object;
  #153 = Utf8               clone
  #154 = NameAndType        #153:#152     // clone:()Ljava/lang/Object;
  #155 = Methodref          #4.#154       // java/lang/Object.clone:()Ljava/lang/Object;
  #156 = Utf8               super$1$wait
  #157 = Utf8               (JI)V
  #158 = Utf8               wait
  #159 = NameAndType        #158:#157     // wait:(JI)V
  #160 = Methodref          #4.#159       // java/lang/Object.wait:(JI)V
  #161 = Utf8               (J)V
  #162 = NameAndType        #158:#161     // wait:(J)V
  #163 = Methodref          #4.#162       // java/lang/Object.wait:(J)V
  #164 = NameAndType        #158:#19      // wait:()V
  #165 = Methodref          #4.#164       // java/lang/Object.wait:()V
  #166 = Utf8               super$1$notifyAll
  #167 = Utf8               notifyAll
  #168 = NameAndType        #167:#19      // notifyAll:()V
  #169 = Methodref          #4.#168       // java/lang/Object.notifyAll:()V
  #170 = Utf8               super$1$equals
  #171 = Utf8               (Ljava/lang/Object;)Z
  #172 = Utf8               equals
  #173 = NameAndType        #172:#171     // equals:(Ljava/lang/Object;)Z
  #174 = Methodref          #4.#173       // java/lang/Object.equals:(Ljava/lang/Object;)Z
  #175 = Utf8               super$1$finalize
  #176 = Utf8               finalize
  #177 = NameAndType        #176:#19      // finalize:()V
  #178 = Methodref          #4.#177       // java/lang/Object.finalize:()V
  #179 = Utf8               super$1$getClass
  #180 = Utf8               $callSiteArray
  #181 = Utf8               Ljava/lang/ref/SoftReference;
  #182 = Utf8               $createCallSiteArray
  #183 = Utf8               ()Lorg/codehaus/groovy/runtime/callsite/CallSiteArray;
  #184 = Utf8               org/codehaus/groovy/runtime/callsite/CallSiteArray
  #185 = Class              #184          // org/codehaus/groovy/runtime/callsite/CallSiteArray
  #186 = Utf8               (Ljava/lang/Class;[Ljava/lang/String;)V
  #187 = NameAndType        #18:#186      // "<init>":(Ljava/lang/Class;[Ljava/lang/String;)V
  #188 = Methodref          #185.#187     // org/codehaus/groovy/runtime/callsite/CallSiteArray."<init>":(Ljava/lang/Class;[Ljava/lang/String;)V
  #189 = Utf8               $getCallSiteArray
  #190 = Utf8               ()[Lorg/codehaus/groovy/runtime/callsite/CallSite;
  #191 = NameAndType        #180:#181     // $callSiteArray:Ljava/lang/ref/SoftReference;
  #192 = Fieldref           #2.#191       // org/sample/groovy/GroovyRunnerLongStatic.$callSiteArray:Ljava/lang/ref/SoftReference;
  #193 = Utf8               java/lang/ref/SoftReference
  #194 = Class              #193          // java/lang/ref/SoftReference
  #195 = Utf8               get
  #196 = NameAndType        #195:#152     // get:()Ljava/lang/Object;
  #197 = Methodref          #194.#196     // java/lang/ref/SoftReference.get:()Ljava/lang/Object;
  #198 = NameAndType        #182:#183     // $createCallSiteArray:()Lorg/codehaus/groovy/runtime/callsite/CallSiteArray;
  #199 = Methodref          #2.#198       // org/sample/groovy/GroovyRunnerLongStatic.$createCallSiteArray:()Lorg/codehaus/groovy/runtime/callsite/CallSiteArray;
  #200 = Utf8               (Ljava/lang/Object;)V
  #201 = NameAndType        #18:#200      // "<init>":(Ljava/lang/Object;)V
  #202 = Methodref          #194.#201     // java/lang/ref/SoftReference."<init>":(Ljava/lang/Object;)V
  #203 = Utf8               array
  #204 = Utf8               [Lorg/codehaus/groovy/runtime/callsite/CallSite;
  #205 = NameAndType        #203:#204     // array:[Lorg/codehaus/groovy/runtime/callsite/CallSite;
  #206 = Fieldref           #185.#205     // org/codehaus/groovy/runtime/callsite/CallSiteArray.array:[Lorg/codehaus/groovy/runtime/callsite/CallSite;
  #207 = Utf8               class$
  #208 = Utf8               (Ljava/lang/String;)Ljava/lang/Class;
  #209 = Utf8               java/lang/Class
  #210 = Class              #209          // java/lang/Class
  #211 = Utf8               forName
  #212 = NameAndType        #211:#208     // forName:(Ljava/lang/String;)Ljava/lang/Class;
  #213 = Methodref          #210.#212     // java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
  #214 = Utf8               java/lang/NoClassDefFoundError
  #215 = Class              #214          // java/lang/NoClassDefFoundError
  #216 = Utf8               java/lang/ClassNotFoundException
  #217 = Class              #216          // java/lang/ClassNotFoundException
  #218 = Utf8               getMessage
  #219 = NameAndType        #218:#147     // getMessage:()Ljava/lang/String;
  #220 = Methodref          #217.#219     // java/lang/ClassNotFoundException.getMessage:()Ljava/lang/String;
  #221 = Utf8               (Ljava/lang/String;)V
  #222 = NameAndType        #18:#221      // "<init>":(Ljava/lang/String;)V
  #223 = Methodref          #215.#222     // java/lang/NoClassDefFoundError."<init>":(Ljava/lang/String;)V
  #224 = Utf8               Code
  #225 = Utf8               LocalVariableTable
  #226 = Utf8               LineNumberTable
  #227 = Utf8               SourceFile
{
  private static org.codehaus.groovy.reflection.ClassInfo $staticClassInfo;
    descriptor: Lorg/codehaus/groovy/reflection/ClassInfo;
    flags: ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC

  public static transient boolean __$stMC;
    descriptor: Z
    flags: ACC_PUBLIC, ACC_STATIC, ACC_TRANSIENT, ACC_SYNTHETIC

  private transient groovy.lang.MetaClass metaClass;
    descriptor: Lgroovy/lang/MetaClass;
    flags: ACC_PRIVATE, ACC_TRANSIENT, ACC_SYNTHETIC

  private static org.codehaus.groovy.reflection.ClassInfo $staticClassInfo$;
    descriptor: Lorg/codehaus/groovy/reflection/ClassInfo;
    flags: ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC

  public static long __timeStamp;
    descriptor: J
    flags: ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC

  public static long __timeStamp__239_neverHappen1492423956346;
    descriptor: J
    flags: ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC

  private static java.lang.ref.SoftReference $callSiteArray;
    descriptor: Ljava/lang/ref/SoftReference;
    flags: ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC

  public org.sample.groovy.GroovyRunnerLongStatic();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: invokespecial #21                 // Method java/lang/Object."<init>":()V
         4: aload_0
         5: invokevirtual #25                 // Method $getStaticMetaClass:()Lgroovy/lang/MetaClass;
         8: astore_1
         9: aload_1
        10: aload_0
        11: swap
        12: putfield      #27                 // Field metaClass:Lgroovy/lang/MetaClass;
        15: aload_1
        16: pop
        17: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            4      13     0  this   Lorg/sample/groovy/GroovyRunnerLongStatic;

  public static long fib(long);
    descriptor: (J)J
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=6, locals=2, args_size=1
         0: lload_0
         1: iconst_2
         2: i2l
         3: lcmp
         4: ifge          11
         7: iconst_1
         8: goto          12
        11: iconst_0
        12: ifeq          20
        15: lload_0
        16: lreturn
        17: goto          36
        20: lload_0
        21: iconst_1
        22: i2l
        23: lsub
        24: invokestatic  #33                 // Method fib:(J)J
        27: lload_0
        28: iconst_2
        29: i2l
        30: lsub
        31: invokestatic  #33                 // Method fib:(J)J
        34: ladd
        35: lreturn
        36: ldc           #35                 // int 0
        38: i2l
        39: lreturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      36     0     n   J
      LineNumberTable:
        line 8: 0
        line 9: 15
        line 11: 20

  public static long fibProxy(long);
    descriptor: (J)J
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=2, args_size=1
         0: lload_0
         1: invokestatic  #33                 // Method fib:(J)J
         4: lreturn
         5: ldc           #35                 // int 0
         7: i2l
         8: lreturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0     n   J
      LineNumberTable:
        line 16: 0

  protected groovy.lang.MetaClass $getStaticMetaClass();
    descriptor: ()Lgroovy/lang/MetaClass;
    flags: ACC_PROTECTED, ACC_SYNTHETIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: invokevirtual #40                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
         4: ldc           #2                  // class org/sample/groovy/GroovyRunnerLongStatic
         6: if_acmpeq     14
         9: aload_0
        10: invokestatic  #46                 // Method org/codehaus/groovy/runtime/ScriptBytecodeAdapter.initMetaClass:(Ljava/lang/Object;)Lgroovy/lang/MetaClass;
        13: areturn
        14: getstatic     #48                 // Field $staticClassInfo:Lorg/codehaus/groovy/reflection/ClassInfo;
        17: astore_1
        18: aload_1
        19: ifnonnull     34
        22: aload_0
        23: invokevirtual #40                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
        26: invokestatic  #54                 // Method org/codehaus/groovy/reflection/ClassInfo.getClassInfo:(Ljava/lang/Class;)Lorg/codehaus/groovy/reflection/ClassInfo;
        29: dup
        30: astore_1
        31: putstatic     #48                 // Field $staticClassInfo:Lorg/codehaus/groovy/reflection/ClassInfo;
        34: aload_1
        35: invokevirtual #57                 // Method org/codehaus/groovy/reflection/ClassInfo.getMetaClass:()Lgroovy/lang/MetaClass;
        38: areturn

  public java.lang.Object this$dist$invoke$1(java.lang.String, java.lang.Object);
    descriptor: (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=9, locals=3, args_size=3
         0: ldc           #2                  // class org/sample/groovy/GroovyRunnerLongStatic
         2: aload_0
         3: new           #61                 // class org/codehaus/groovy/runtime/GStringImpl
         6: dup
         7: iconst_1
         8: anewarray     #4                  // class java/lang/Object
        11: dup
        12: iconst_0
        13: aload_1
        14: aastore
        15: iconst_2
        16: anewarray     #63                 // class java/lang/String
        19: dup
        20: iconst_0
        21: ldc           #65                 // String
        23: aastore
        24: dup
        25: iconst_1
        26: ldc           #65                 // String
        28: aastore
        29: invokespecial #68                 // Method org/codehaus/groovy/runtime/GStringImpl."<init>":([Ljava/lang/Object;[Ljava/lang/String;)V
        32: invokestatic  #74                 // Method org/codehaus/groovy/runtime/typehandling/ShortTypeHandling.castToString:(Ljava/lang/Object;)Ljava/lang/String;
        35: checkcast     #63                 // class java/lang/String
        38: iconst_0
        39: anewarray     #4                  // class java/lang/Object
        42: iconst_1
        43: anewarray     #4                  // class java/lang/Object
        46: dup
        47: iconst_0
        48: aload_2
        49: aastore
        50: iconst_1
        51: newarray       int
        53: dup
        54: iconst_0
        55: iconst_0
        56: iastore
        57: invokestatic  #78                 // Method org/codehaus/groovy/runtime/ScriptBytecodeAdapter.despreadList:([Ljava/lang/Object;[Ljava/lang/Object;[I)[Ljava/lang/Object;
        60: invokestatic  #82                 // Method org/codehaus/groovy/runtime/ScriptBytecodeAdapter.invokeMethodOnCurrentN:(Ljava/lang/Class;Lgroovy/lang/GroovyObject;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
        63: areturn
        64: aconst_null
        65: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      64     0  this   Lorg/sample/groovy/GroovyRunnerLongStatic;
            0      64     1  name   Ljava/lang/String;
            0      64     2  args   Ljava/lang/Object;

  public void this$dist$set$1(java.lang.String, java.lang.Object);
    descriptor: (Ljava/lang/String;Ljava/lang/Object;)V
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=10, locals=4, args_size=3
         0: aload_2
         1: astore_3
         2: aload_3
         3: ldc           #2                  // class org/sample/groovy/GroovyRunnerLongStatic
         5: aload_0
         6: new           #61                 // class org/codehaus/groovy/runtime/GStringImpl
         9: dup
        10: iconst_1
        11: anewarray     #4                  // class java/lang/Object
        14: dup
        15: iconst_0
        16: aload_1
        17: aastore
        18: iconst_2
        19: anewarray     #63                 // class java/lang/String
        22: dup
        23: iconst_0
        24: ldc           #65                 // String
        26: aastore
        27: dup
        28: iconst_1
        29: ldc           #65                 // String
        31: aastore
        32: invokespecial #68                 // Method org/codehaus/groovy/runtime/GStringImpl."<init>":([Ljava/lang/Object;[Ljava/lang/String;)V
        35: invokestatic  #74                 // Method org/codehaus/groovy/runtime/typehandling/ShortTypeHandling.castToString:(Ljava/lang/Object;)Ljava/lang/String;
        38: checkcast     #63                 // class java/lang/String
        41: invokestatic  #92                 // Method org/codehaus/groovy/runtime/ScriptBytecodeAdapter.setGroovyObjectProperty:(Ljava/lang/Object;Ljava/lang/Class;Lgroovy/lang/GroovyObject;Ljava/lang/String;)V
        44: aload_3
        45: pop
        46: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      46     0  this   Lorg/sample/groovy/GroovyRunnerLongStatic;
            0      46     1  name   Ljava/lang/String;
            0      46     2 value   Ljava/lang/Object;

  public java.lang.Object this$dist$get$1(java.lang.String);
    descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=9, locals=2, args_size=2
         0: ldc           #2                  // class org/sample/groovy/GroovyRunnerLongStatic
         2: aload_0
         3: new           #61                 // class org/codehaus/groovy/runtime/GStringImpl
         6: dup
         7: iconst_1
         8: anewarray     #4                  // class java/lang/Object
        11: dup
        12: iconst_0
        13: aload_1
        14: aastore
        15: iconst_2
        16: anewarray     #63                 // class java/lang/String
        19: dup
        20: iconst_0
        21: ldc           #65                 // String
        23: aastore
        24: dup
        25: iconst_1
        26: ldc           #65                 // String
        28: aastore
        29: invokespecial #68                 // Method org/codehaus/groovy/runtime/GStringImpl."<init>":([Ljava/lang/Object;[Ljava/lang/String;)V
        32: invokestatic  #74                 // Method org/codehaus/groovy/runtime/typehandling/ShortTypeHandling.castToString:(Ljava/lang/Object;)Ljava/lang/String;
        35: checkcast     #63                 // class java/lang/String
        38: invokestatic  #99                 // Method org/codehaus/groovy/runtime/ScriptBytecodeAdapter.getGroovyObjectProperty:(Ljava/lang/Class;Lgroovy/lang/GroovyObject;Ljava/lang/String;)Ljava/lang/Object;
        41: areturn
        42: aconst_null
        43: areturn
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      42     0  this   Lorg/sample/groovy/GroovyRunnerLongStatic;
            0      42     1  name   Ljava/lang/String;

  public groovy.lang.MetaClass getMetaClass();
    descriptor: ()Lgroovy/lang/MetaClass;
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field metaClass:Lgroovy/lang/MetaClass;
         4: dup
         5: ifnull        9
         8: areturn
         9: pop
        10: aload_0
        11: dup
        12: invokevirtual #25                 // Method $getStaticMetaClass:()Lgroovy/lang/MetaClass;
        15: putfield      #27                 // Field metaClass:Lgroovy/lang/MetaClass;
        18: aload_0
        19: getfield      #27                 // Field metaClass:Lgroovy/lang/MetaClass;
        22: areturn

  public void setMetaClass(groovy.lang.MetaClass);
    descriptor: (Lgroovy/lang/MetaClass;)V
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #27                 // Field metaClass:Lgroovy/lang/MetaClass;
         5: return

  public java.lang.Object invokeMethod(java.lang.String, java.lang.Object);
    descriptor: (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: invokevirtual #103                // Method getMetaClass:()Lgroovy/lang/MetaClass;
         4: aload_0
         5: aload_1
         6: aload_2
         7: invokeinterface #108,  4          // InterfaceMethod groovy/lang/MetaClass.invokeMethod:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
        12: areturn

  public java.lang.Object getProperty(java.lang.String);
    descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #103                // Method getMetaClass:()Lgroovy/lang/MetaClass;
         4: aload_0
         5: aload_1
         6: invokeinterface #112,  3          // InterfaceMethod groovy/lang/MetaClass.getProperty:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        11: areturn

  public void setProperty(java.lang.String, java.lang.Object);
    descriptor: (Ljava/lang/String;Ljava/lang/Object;)V
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: invokevirtual #103                // Method getMetaClass:()Lgroovy/lang/MetaClass;
         4: aload_0
         5: aload_1
         6: aload_2
         7: invokeinterface #116,  4          // InterfaceMethod groovy/lang/MetaClass.setProperty:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
        12: return

  public static void __$swapInit();
    descriptor: ()V
    flags: ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=0, locals=0, args_size=0
         0: return

  static {};
    descriptor: ()V
    flags: ACC_STATIC
    Code:
      stack=2, locals=2, args_size=0
         0: invokestatic  #120                // Method __$swapInit:()V
         3: lconst_0
         4: invokestatic  #126                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
         7: astore_0
         8: aload_0
         9: invokevirtual #130                // Method java/lang/Long.longValue:()J
        12: putstatic     #132                // Field __timeStamp__239_neverHappen1492423956346:J
        15: aload_0
        16: pop
        17: ldc2_w        #133                // long 1492423956346l
        20: invokestatic  #126                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
        23: astore_1
        24: aload_1
        25: invokevirtual #130                // Method java/lang/Long.longValue:()J
        28: putstatic     #136                // Field __timeStamp:J
        31: aload_1
        32: pop
        33: return

  public void super$1$notify();
    descriptor: ()V
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #140                // Method java/lang/Object.notify:()V
         4: return

  public int super$1$hashCode();
    descriptor: ()I
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #145                // Method java/lang/Object.hashCode:()I
         4: ireturn

  public java.lang.String super$1$toString();
    descriptor: ()Ljava/lang/String;
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #150                // Method java/lang/Object.toString:()Ljava/lang/String;
         4: areturn

  public java.lang.Object super$1$clone();
    descriptor: ()Ljava/lang/Object;
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #155                // Method java/lang/Object.clone:()Ljava/lang/Object;
         4: areturn

  public void super$1$wait(long, int);
    descriptor: (JI)V
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=4, locals=4, args_size=3
         0: aload_0
         1: lload_1
         2: iload_3
         3: invokespecial #160                // Method java/lang/Object.wait:(JI)V
         6: return

  public void super$1$wait(long);
    descriptor: (J)V
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: lload_1
         2: invokespecial #163                // Method java/lang/Object.wait:(J)V
         5: return

  public void super$1$wait();
    descriptor: ()V
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #165                // Method java/lang/Object.wait:()V
         4: return

  public void super$1$notifyAll();
    descriptor: ()V
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #169                // Method java/lang/Object.notifyAll:()V
         4: return

  public boolean super$1$equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #174                // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
         5: ireturn

  public void super$1$finalize();
    descriptor: ()V
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #178                // Method java/lang/Object.finalize:()V
         4: return

  public java.lang.Class super$1$getClass();
    descriptor: ()Ljava/lang/Class;
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #40                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
         4: areturn

  private static org.codehaus.groovy.runtime.callsite.CallSiteArray $createCallSiteArray();
    descriptor: ()Lorg/codehaus/groovy/runtime/callsite/CallSiteArray;
    flags: ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=4, locals=1, args_size=0
         0: ldc           #35                 // int 0
         2: anewarray     #63                 // class java/lang/String
         5: astore_0
         6: new           #185                // class org/codehaus/groovy/runtime/callsite/CallSiteArray
         9: dup
        10: ldc           #2                  // class org/sample/groovy/GroovyRunnerLongStatic
        12: aload_0
        13: invokespecial #188                // Method org/codehaus/groovy/runtime/callsite/CallSiteArray."<init>":(Ljava/lang/Class;[Ljava/lang/String;)V
        16: areturn

  private static org.codehaus.groovy.runtime.callsite.CallSite[] $getCallSiteArray();
    descriptor: ()[Lorg/codehaus/groovy/runtime/callsite/CallSite;
    flags: ACC_PRIVATE, ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=3, locals=1, args_size=0
         0: getstatic     #192                // Field $callSiteArray:Ljava/lang/ref/SoftReference;
         3: ifnull        20
         6: getstatic     #192                // Field $callSiteArray:Ljava/lang/ref/SoftReference;
         9: invokevirtual #197                // Method java/lang/ref/SoftReference.get:()Ljava/lang/Object;
        12: checkcast     #185                // class org/codehaus/groovy/runtime/callsite/CallSiteArray
        15: dup
        16: astore_0
        17: ifnonnull     35
        20: invokestatic  #199                // Method $createCallSiteArray:()Lorg/codehaus/groovy/runtime/callsite/CallSiteArray;
        23: astore_0
        24: new           #194                // class java/lang/ref/SoftReference
        27: dup
        28: aload_0
        29: invokespecial #202                // Method java/lang/ref/SoftReference."<init>":(Ljava/lang/Object;)V
        32: putstatic     #192                // Field $callSiteArray:Ljava/lang/ref/SoftReference;
        35: aload_0
        36: getfield      #206                // Field org/codehaus/groovy/runtime/callsite/CallSiteArray.array:[Lorg/codehaus/groovy/runtime/callsite/CallSite;
        39: areturn

  static java.lang.Class class$(java.lang.String);
    descriptor: (Ljava/lang/String;)Ljava/lang/Class;
    flags: ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=3, locals=2, args_size=1
         0: aload_0
         1: invokestatic  #213                // Method java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
         4: areturn
         5: astore_1
         6: new           #215                // class java/lang/NoClassDefFoundError
         9: dup
        10: aload_1
        11: invokevirtual #220                // Method java/lang/ClassNotFoundException.getMessage:()Ljava/lang/String;
        14: invokespecial #223                // Method java/lang/NoClassDefFoundError."<init>":(Ljava/lang/String;)V
        17: athrow
      Exception table:
         from    to  target type
             0     5     5   Class java/lang/ClassNotFoundException
}
SourceFile: "static.groovy"
