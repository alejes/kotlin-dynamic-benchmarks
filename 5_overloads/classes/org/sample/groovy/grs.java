Classfile /home/user/Diplom/kotlin-dynamic-benchmarks/5_overloads/classes/org/sample/groovy/GroovyRunnerStatic.class
  Last modified May 10, 2017; size 5651 bytes
  MD5 checksum 56c4b5242666908afa4e9ba46a22067c
  Compiled from "static.groovy"
public class org.sample.groovy.GroovyRunnerStatic implements groovy.lang.GroovyObject
  minor version: 0
  major version: 51
  flags: ACC_PUBLIC, ACC_SUPER
Constant pool:
    #1 = Utf8               org/sample/groovy/GroovyRunnerStatic
    #2 = Class              #1            // org/sample/groovy/GroovyRunnerStatic
    #3 = Utf8               java/lang/Object
    #4 = Class              #3            // java/lang/Object
    #5 = Utf8               groovy/lang/GroovyObject
    #6 = Class              #5            // groovy/lang/GroovyObject
    #7 = Utf8               static.groovy
    #8 = Utf8               overloads
    #9 = Utf8               Lorg/sample/groovy/OverloadsDynamic;
   #10 = Utf8               $staticClassInfo
   #11 = Utf8               Lorg/codehaus/groovy/reflection/ClassInfo;
   #12 = Utf8               __$stMC
   #13 = Utf8               Z
   #14 = Utf8               metaClass
   #15 = Utf8               Lgroovy/lang/MetaClass;
   #16 = Utf8               $staticClassInfo$
   #17 = Utf8               __timeStamp
   #18 = Utf8               J
   #19 = Utf8               __timeStamp__239_neverHappen1494440730360
   #20 = Utf8               <init>
   #21 = Utf8               ()V
   #22 = NameAndType        #20:#21       // "<init>":()V
   #23 = Methodref          #4.#22        // java/lang/Object."<init>":()V
   #24 = Utf8               $getStaticMetaClass
   #25 = Utf8               ()Lgroovy/lang/MetaClass;
   #26 = NameAndType        #24:#25       // $getStaticMetaClass:()Lgroovy/lang/MetaClass;
   #27 = Methodref          #2.#26        // org/sample/groovy/GroovyRunnerStatic.$getStaticMetaClass:()Lgroovy/lang/MetaClass;
   #28 = NameAndType        #14:#15       // metaClass:Lgroovy/lang/MetaClass;
   #29 = Fieldref           #2.#28        // org/sample/groovy/GroovyRunnerStatic.metaClass:Lgroovy/lang/MetaClass;
   #30 = Utf8               this
   #31 = Utf8               Lorg/sample/groovy/GroovyRunnerStatic;
   #32 = Utf8               method0_0Proxy
   #33 = Utf8               ()Ljava/lang/String;
   #34 = NameAndType        #8:#9         // overloads:Lorg/sample/groovy/OverloadsDynamic;
   #35 = Fieldref           #2.#34        // org/sample/groovy/GroovyRunnerStatic.overloads:Lorg/sample/groovy/OverloadsDynamic;
   #36 = Utf8               org/sample/groovy/OverloadsDynamic
   #37 = Class              #36           // org/sample/groovy/OverloadsDynamic
   #38 = Utf8               method0_1
   #39 = NameAndType        #38:#33       // method0_1:()Ljava/lang/String;
   #40 = Methodref          #37.#39       // org/sample/groovy/OverloadsDynamic.method0_1:()Ljava/lang/String;
   #41 = Utf8               java/lang/Throwable
   #42 = Class              #41           // java/lang/Throwable
   #43 = Utf8               method3_3Proxy
   #44 = Utf8               (I)Ljava/lang/String;
   #45 = Utf8               eew
   #46 = String             #45           // eew
   #47 = Utf8               method3_3
   #48 = Utf8               (ILjava/lang/String;I)Ljava/lang/String;
   #49 = NameAndType        #47:#48       // method3_3:(ILjava/lang/String;I)Ljava/lang/String;
   #50 = Methodref          #37.#49       // org/sample/groovy/OverloadsDynamic.method3_3:(ILjava/lang/String;I)Ljava/lang/String;
   #51 = Utf8               arg1
   #52 = Utf8               I
   #53 = Utf8               method5_5Proxy
   #54 = Utf8               33d
   #55 = String             #54           // 33d
   #56 = Utf8               method5_5
   #57 = Utf8               (ILjava/lang/String;ILjava/lang/String;I)Ljava/lang/String;
   #58 = NameAndType        #56:#57       // method5_5:(ILjava/lang/String;ILjava/lang/String;I)Ljava/lang/String;
   #59 = Methodref          #37.#58       // org/sample/groovy/OverloadsDynamic.method5_5:(ILjava/lang/String;ILjava/lang/String;I)Ljava/lang/String;
   #60 = Utf8               method5_1_default3Proxy
   #61 = Utf8               method5_1_default3
   #62 = Utf8               (II)Ljava/lang/String;
   #63 = NameAndType        #61:#62       // method5_1_default3:(II)Ljava/lang/String;
   #64 = Methodref          #37.#63       // org/sample/groovy/OverloadsDynamic.method5_1_default3:(II)Ljava/lang/String;
   #65 = Utf8               method5_10Proxy
   #66 = Utf8               method5_10
   #67 = NameAndType        #66:#57       // method5_10:(ILjava/lang/String;ILjava/lang/String;I)Ljava/lang/String;
   #68 = Methodref          #37.#67       // org/sample/groovy/OverloadsDynamic.method5_10:(ILjava/lang/String;ILjava/lang/String;I)Ljava/lang/String;
   #69 = Utf8               getClass
   #70 = Utf8               ()Ljava/lang/Class;
   #71 = NameAndType        #69:#70       // getClass:()Ljava/lang/Class;
   #72 = Methodref          #4.#71        // java/lang/Object.getClass:()Ljava/lang/Class;
   #73 = Utf8               org/codehaus/groovy/runtime/ScriptBytecodeAdapter
   #74 = Class              #73           // org/codehaus/groovy/runtime/ScriptBytecodeAdapter
   #75 = Utf8               initMetaClass
   #76 = Utf8               (Ljava/lang/Object;)Lgroovy/lang/MetaClass;
   #77 = NameAndType        #75:#76       // initMetaClass:(Ljava/lang/Object;)Lgroovy/lang/MetaClass;
   #78 = Methodref          #74.#77       // org/codehaus/groovy/runtime/ScriptBytecodeAdapter.initMetaClass:(Ljava/lang/Object;)Lgroovy/lang/MetaClass;
   #79 = NameAndType        #10:#11       // $staticClassInfo:Lorg/codehaus/groovy/reflection/ClassInfo;
   #80 = Fieldref           #2.#79        // org/sample/groovy/GroovyRunnerStatic.$staticClassInfo:Lorg/codehaus/groovy/reflection/ClassInfo;
   #81 = Utf8               org/codehaus/groovy/reflection/ClassInfo
   #82 = Class              #81           // org/codehaus/groovy/reflection/ClassInfo
   #83 = Utf8               getClassInfo
   #84 = Utf8               (Ljava/lang/Class;)Lorg/codehaus/groovy/reflection/ClassInfo;
   #85 = NameAndType        #83:#84       // getClassInfo:(Ljava/lang/Class;)Lorg/codehaus/groovy/reflection/ClassInfo;
   #86 = Methodref          #82.#85       // org/codehaus/groovy/reflection/ClassInfo.getClassInfo:(Ljava/lang/Class;)Lorg/codehaus/groovy/reflection/ClassInfo;
   #87 = Utf8               getMetaClass
   #88 = NameAndType        #87:#25       // getMetaClass:()Lgroovy/lang/MetaClass;
   #89 = Methodref          #82.#88       // org/codehaus/groovy/reflection/ClassInfo.getMetaClass:()Lgroovy/lang/MetaClass;
   #90 = Utf8               this$dist$invoke$1
   #91 = Utf8               (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
   #92 = Utf8               org/codehaus/groovy/runtime/GStringImpl
   #93 = Class              #92           // org/codehaus/groovy/runtime/GStringImpl
   #94 = Utf8               java/lang/String
   #95 = Class              #94           // java/lang/String
   #96 = Utf8
   #97 = String             #96           //
   #98 = Utf8               ([Ljava/lang/Object;[Ljava/lang/String;)V
   #99 = NameAndType        #20:#98       // "<init>":([Ljava/lang/Object;[Ljava/lang/String;)V
  #100 = Methodref          #93.#99       // org/codehaus/groovy/runtime/GStringImpl."<init>":([Ljava/lang/Object;[Ljava/lang/String;)V
  #101 = Utf8               org/codehaus/groovy/vmplugin/v7/IndyInterface
  #102 = Class              #101          // org/codehaus/groovy/vmplugin/v7/IndyInterface
  #103 = Utf8               bootstrap
  #104 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;I)Ljava/lang/invoke/CallSite;
  #105 = NameAndType        #103:#104     // bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;I)Ljava/lang/invoke/CallSite;
  #106 = Methodref          #102.#105     // org/codehaus/groovy/vmplugin/v7/IndyInterface.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;I)Ljava/lang/invoke/CallSite;
  #107 = MethodHandle       #6:#106       // invokestatic org/codehaus/groovy/vmplugin/v7/IndyInterface.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;I)Ljava/lang/invoke/CallSite;
  #108 = Utf8               ()
  #109 = String             #108          // ()
  #110 = Integer            0
  #111 = Utf8               cast
  #112 = Utf8               (Lgroovy/lang/GString;)Ljava/lang/String;
  #113 = NameAndType        #111:#112     // cast:(Lgroovy/lang/GString;)Ljava/lang/String;
  #114 = InvokeDynamic      #0:#113       // #0:cast:(Lgroovy/lang/GString;)Ljava/lang/String;
  #115 = Utf8               despreadList
  #116 = Utf8               ([Ljava/lang/Object;[Ljava/lang/Object;[I)[Ljava/lang/Object;
  #117 = NameAndType        #115:#116     // despreadList:([Ljava/lang/Object;[Ljava/lang/Object;[I)[Ljava/lang/Object;
  #118 = Methodref          #74.#117      // org/codehaus/groovy/runtime/ScriptBytecodeAdapter.despreadList:([Ljava/lang/Object;[Ljava/lang/Object;[I)[Ljava/lang/Object;
  #119 = Utf8               invokeMethodOnCurrentN
  #120 = Utf8               (Ljava/lang/Class;Lgroovy/lang/GroovyObject;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
  #121 = NameAndType        #119:#120     // invokeMethodOnCurrentN:(Ljava/lang/Class;Lgroovy/lang/GroovyObject;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
  #122 = Methodref          #74.#121      // org/codehaus/groovy/runtime/ScriptBytecodeAdapter.invokeMethodOnCurrentN:(Ljava/lang/Class;Lgroovy/lang/GroovyObject;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
  #123 = Utf8               name
  #124 = Utf8               Ljava/lang/String;
  #125 = Utf8               args
  #126 = Utf8               Ljava/lang/Object;
  #127 = Utf8               this$dist$set$1
  #128 = Utf8               (Ljava/lang/String;Ljava/lang/Object;)V
  #129 = Utf8               setGroovyObjectProperty
  #130 = Utf8               (Ljava/lang/Object;Ljava/lang/Class;Lgroovy/lang/GroovyObject;Ljava/lang/String;)V
  #131 = NameAndType        #129:#130     // setGroovyObjectProperty:(Ljava/lang/Object;Ljava/lang/Class;Lgroovy/lang/GroovyObject;Ljava/lang/String;)V
  #132 = Methodref          #74.#131      // org/codehaus/groovy/runtime/ScriptBytecodeAdapter.setGroovyObjectProperty:(Ljava/lang/Object;Ljava/lang/Class;Lgroovy/lang/GroovyObject;Ljava/lang/String;)V
  #133 = Utf8               value
  #134 = Utf8               this$dist$get$1
  #135 = Utf8               (Ljava/lang/String;)Ljava/lang/Object;
  #136 = Utf8               getGroovyObjectProperty
  #137 = Utf8               (Ljava/lang/Class;Lgroovy/lang/GroovyObject;Ljava/lang/String;)Ljava/lang/Object;
  #138 = NameAndType        #136:#137     // getGroovyObjectProperty:(Ljava/lang/Class;Lgroovy/lang/GroovyObject;Ljava/lang/String;)Ljava/lang/Object;
  #139 = Methodref          #74.#138      // org/codehaus/groovy/runtime/ScriptBytecodeAdapter.getGroovyObjectProperty:(Ljava/lang/Class;Lgroovy/lang/GroovyObject;Ljava/lang/String;)Ljava/lang/Object;
  #140 = Utf8               groovy/lang/MetaClass
  #141 = Class              #140          // groovy/lang/MetaClass
  #142 = Utf8               setMetaClass
  #143 = Utf8               (Lgroovy/lang/MetaClass;)V
  #144 = Utf8               invokeMethod
  #145 = Methodref          #2.#88        // org/sample/groovy/GroovyRunnerStatic.getMetaClass:()Lgroovy/lang/MetaClass;
  #146 = Utf8               (Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
  #147 = NameAndType        #144:#146     // invokeMethod:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
  #148 = InterfaceMethodref #141.#147     // groovy/lang/MetaClass.invokeMethod:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
  #149 = Utf8               getProperty
  #150 = Utf8               (Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
  #151 = NameAndType        #149:#150     // getProperty:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
  #152 = InterfaceMethodref #141.#151     // groovy/lang/MetaClass.getProperty:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
  #153 = Utf8               setProperty
  #154 = Utf8               (Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
  #155 = NameAndType        #153:#154     // setProperty:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
  #156 = InterfaceMethodref #141.#155     // groovy/lang/MetaClass.setProperty:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
  #157 = Utf8               __$swapInit
  #158 = Utf8               <clinit>
  #159 = NameAndType        #157:#21      // __$swapInit:()V
  #160 = Methodref          #2.#159       // org/sample/groovy/GroovyRunnerStatic.__$swapInit:()V
  #161 = Utf8               java/lang/Long
  #162 = Class              #161          // java/lang/Long
  #163 = Utf8               valueOf
  #164 = Utf8               (J)Ljava/lang/Long;
  #165 = NameAndType        #163:#164     // valueOf:(J)Ljava/lang/Long;
  #166 = Methodref          #162.#165     // java/lang/Long.valueOf:(J)Ljava/lang/Long;
  #167 = Utf8               longValue
  #168 = Utf8               ()J
  #169 = NameAndType        #167:#168     // longValue:()J
  #170 = Methodref          #162.#169     // java/lang/Long.longValue:()J
  #171 = NameAndType        #19:#18       // __timeStamp__239_neverHappen1494440730360:J
  #172 = Fieldref           #2.#171       // org/sample/groovy/GroovyRunnerStatic.__timeStamp__239_neverHappen1494440730360:J
  #173 = Long               1494440730360l
  #175 = NameAndType        #17:#18       // __timeStamp:J
  #176 = Fieldref           #2.#175       // org/sample/groovy/GroovyRunnerStatic.__timeStamp:J
  #177 = Methodref          #37.#22       // org/sample/groovy/OverloadsDynamic."<init>":()V
  #178 = Utf8               getOverloads
  #179 = Utf8               ()Lorg/sample/groovy/OverloadsDynamic;
  #180 = Utf8               setOverloads
  #181 = Utf8               (Lorg/sample/groovy/OverloadsDynamic;)V
  #182 = Utf8               super$1$notify
  #183 = Utf8               notify
  #184 = NameAndType        #183:#21      // notify:()V
  #185 = Methodref          #4.#184       // java/lang/Object.notify:()V
  #186 = Utf8               super$1$hashCode
  #187 = Utf8               ()I
  #188 = Utf8               hashCode
  #189 = NameAndType        #188:#187     // hashCode:()I
  #190 = Methodref          #4.#189       // java/lang/Object.hashCode:()I
  #191 = Utf8               super$1$toString
  #192 = Utf8               toString
  #193 = NameAndType        #192:#33      // toString:()Ljava/lang/String;
  #194 = Methodref          #4.#193       // java/lang/Object.toString:()Ljava/lang/String;
  #195 = Utf8               super$1$clone
  #196 = Utf8               ()Ljava/lang/Object;
  #197 = Utf8               clone
  #198 = NameAndType        #197:#196     // clone:()Ljava/lang/Object;
  #199 = Methodref          #4.#198       // java/lang/Object.clone:()Ljava/lang/Object;
  #200 = Utf8               super$1$wait
  #201 = Utf8               (JI)V
  #202 = Utf8               wait
  #203 = NameAndType        #202:#201     // wait:(JI)V
  #204 = Methodref          #4.#203       // java/lang/Object.wait:(JI)V
  #205 = Utf8               (J)V
  #206 = NameAndType        #202:#205     // wait:(J)V
  #207 = Methodref          #4.#206       // java/lang/Object.wait:(J)V
  #208 = NameAndType        #202:#21      // wait:()V
  #209 = Methodref          #4.#208       // java/lang/Object.wait:()V
  #210 = Utf8               super$1$notifyAll
  #211 = Utf8               notifyAll
  #212 = NameAndType        #211:#21      // notifyAll:()V
  #213 = Methodref          #4.#212       // java/lang/Object.notifyAll:()V
  #214 = Utf8               super$1$equals
  #215 = Utf8               (Ljava/lang/Object;)Z
  #216 = Utf8               equals
  #217 = NameAndType        #216:#215     // equals:(Ljava/lang/Object;)Z
  #218 = Methodref          #4.#217       // java/lang/Object.equals:(Ljava/lang/Object;)Z
  #219 = Utf8               super$1$finalize
  #220 = Utf8               finalize
  #221 = NameAndType        #220:#21      // finalize:()V
  #222 = Methodref          #4.#221       // java/lang/Object.finalize:()V
  #223 = Utf8               super$1$getClass
  #224 = Utf8               class$
  #225 = Utf8               (Ljava/lang/String;)Ljava/lang/Class;
  #226 = Utf8               java/lang/Class
  #227 = Class              #226          // java/lang/Class
  #228 = Utf8               forName
  #229 = NameAndType        #228:#225     // forName:(Ljava/lang/String;)Ljava/lang/Class;
  #230 = Methodref          #227.#229     // java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
  #231 = Utf8               java/lang/NoClassDefFoundError
  #232 = Class              #231          // java/lang/NoClassDefFoundError
  #233 = Utf8               java/lang/ClassNotFoundException
  #234 = Class              #233          // java/lang/ClassNotFoundException
  #235 = Utf8               getMessage
  #236 = NameAndType        #235:#33      // getMessage:()Ljava/lang/String;
  #237 = Methodref          #234.#236     // java/lang/ClassNotFoundException.getMessage:()Ljava/lang/String;
  #238 = Utf8               (Ljava/lang/String;)V
  #239 = NameAndType        #20:#238      // "<init>":(Ljava/lang/String;)V
  #240 = Methodref          #232.#239     // java/lang/NoClassDefFoundError."<init>":(Ljava/lang/String;)V
  #241 = Utf8               Code
  #242 = Utf8               LocalVariableTable
  #243 = Utf8               LineNumberTable
  #244 = Utf8               StackMapTable
  #245 = Utf8               BootstrapMethods
  #246 = Utf8               SourceFile
{
  private static org.sample.groovy.OverloadsDynamic overloads;
    descriptor: Lorg/sample/groovy/OverloadsDynamic;
    flags: ACC_PRIVATE, ACC_STATIC

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

  public static long __timeStamp__239_neverHappen1494440730360;
    descriptor: J
    flags: ACC_PUBLIC, ACC_STATIC, ACC_SYNTHETIC

  public org.sample.groovy.GroovyRunnerStatic();
    descriptor: ()V
    flags: ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: invokespecial #23                 // Method java/lang/Object."<init>":()V
         4: aload_0
         5: invokevirtual #27                 // Method $getStaticMetaClass:()Lgroovy/lang/MetaClass;
         8: astore_1
         9: aload_1
        10: aload_0
        11: swap
        12: putfield      #29                 // Field metaClass:Lgroovy/lang/MetaClass;
        15: aload_1
        16: pop
        17: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            4      13     0  this   Lorg/sample/groovy/GroovyRunnerStatic;

  public static java.lang.String method0_0Proxy();
    descriptor: ()Ljava/lang/String;
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #35                 // Field overloads:Lorg/sample/groovy/OverloadsDynamic;
         3: invokevirtual #40                 // Method org/sample/groovy/OverloadsDynamic.method0_1:()Ljava/lang/String;
         6: areturn
         7: nop
         8: athrow
      LineNumberTable:
        line 93: 0
      StackMapTable: number_of_entries = 1
        frame_type = 71 /* same_locals_1_stack_item */
          stack = [ class java/lang/Throwable ]

  public static java.lang.String method3_3Proxy(int);
    descriptor: (I)Ljava/lang/String;
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=4, locals=1, args_size=1
         0: getstatic     #35                 // Field overloads:Lorg/sample/groovy/OverloadsDynamic;
         3: iconst_5
         4: ldc           #46                 // String eew
         6: iload_0
         7: invokevirtual #50                 // Method org/sample/groovy/OverloadsDynamic.method3_3:(ILjava/lang/String;I)Ljava/lang/String;
        10: areturn
        11: nop
        12: athrow
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      11     0  arg1   I
      LineNumberTable:
        line 97: 0
      StackMapTable: number_of_entries = 1
        frame_type = 255 /* full_frame */
          offset_delta = 11
          locals = []
          stack = [ class java/lang/Throwable ]

  public static java.lang.String method5_5Proxy(int);
    descriptor: (I)Ljava/lang/String;
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=6, locals=1, args_size=1
         0: getstatic     #35                 // Field overloads:Lorg/sample/groovy/OverloadsDynamic;
         3: bipush        11
         5: ldc           #55                 // String 33d
         7: iload_0
         8: ldc           #46                 // String eew
        10: bipush        55
        12: invokevirtual #59                 // Method org/sample/groovy/OverloadsDynamic.method5_5:(ILjava/lang/String;ILjava/lang/String;I)Ljava/lang/String;
        15: areturn
        16: nop
        17: athrow
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  arg1   I
      LineNumberTable:
        line 101: 0
      StackMapTable: number_of_entries = 1
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = []
          stack = [ class java/lang/Throwable ]

  public static java.lang.String method5_1_default3Proxy(int);
    descriptor: (I)Ljava/lang/String;
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=3, locals=1, args_size=1
         0: getstatic     #35                 // Field overloads:Lorg/sample/groovy/OverloadsDynamic;
         3: bipush        11
         5: iload_0
         6: invokevirtual #64                 // Method org/sample/groovy/OverloadsDynamic.method5_1_default3:(II)Ljava/lang/String;
         9: areturn
        10: nop
        11: athrow
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      10     0  arg1   I
      LineNumberTable:
        line 105: 0
      StackMapTable: number_of_entries = 1
        frame_type = 255 /* full_frame */
          offset_delta = 10
          locals = []
          stack = [ class java/lang/Throwable ]

  public static java.lang.String method5_10Proxy(int);
    descriptor: (I)Ljava/lang/String;
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=6, locals=1, args_size=1
         0: getstatic     #35                 // Field overloads:Lorg/sample/groovy/OverloadsDynamic;
         3: bipush        11
         5: ldc           #55                 // String 33d
         7: iload_0
         8: ldc           #46                 // String eew
        10: bipush        55
        12: invokevirtual #68                 // Method org/sample/groovy/OverloadsDynamic.method5_10:(ILjava/lang/String;ILjava/lang/String;I)Ljava/lang/String;
        15: areturn
        16: nop
        17: athrow
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      16     0  arg1   I
      LineNumberTable:
        line 109: 0
      StackMapTable: number_of_entries = 1
        frame_type = 255 /* full_frame */
          offset_delta = 16
          locals = []
          stack = [ class java/lang/Throwable ]

  protected groovy.lang.MetaClass $getStaticMetaClass();
    descriptor: ()Lgroovy/lang/MetaClass;
    flags: ACC_PROTECTED, ACC_SYNTHETIC
    Code:
      stack=2, locals=2, args_size=1
         0: aload_0
         1: invokevirtual #72                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
         4: ldc           #2                  // class org/sample/groovy/GroovyRunnerStatic
         6: if_acmpeq     14
         9: aload_0
        10: invokestatic  #78                 // Method org/codehaus/groovy/runtime/ScriptBytecodeAdapter.initMetaClass:(Ljava/lang/Object;)Lgroovy/lang/MetaClass;
        13: areturn
        14: getstatic     #80                 // Field $staticClassInfo:Lorg/codehaus/groovy/reflection/ClassInfo;
        17: astore_1
        18: aload_1
        19: ifnonnull     34
        22: aload_0
        23: invokevirtual #72                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
        26: invokestatic  #86                 // Method org/codehaus/groovy/reflection/ClassInfo.getClassInfo:(Ljava/lang/Class;)Lorg/codehaus/groovy/reflection/ClassInfo;
        29: dup
        30: astore_1
        31: putstatic     #80                 // Field $staticClassInfo:Lorg/codehaus/groovy/reflection/ClassInfo;
        34: aload_1
        35: invokevirtual #89                 // Method org/codehaus/groovy/reflection/ClassInfo.getMetaClass:()Lgroovy/lang/MetaClass;
        38: areturn
      StackMapTable: number_of_entries = 2
        frame_type = 14 /* same */
        frame_type = 252 /* append */
          offset_delta = 19
          locals = [ class org/codehaus/groovy/reflection/ClassInfo ]

  public java.lang.Object this$dist$invoke$1(java.lang.String, java.lang.Object);
    descriptor: (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=9, locals=3, args_size=3
         0: ldc           #2                  // class org/sample/groovy/GroovyRunnerStatic
         2: aload_0
         3: new           #93                 // class org/codehaus/groovy/runtime/GStringImpl
         6: dup
         7: iconst_1
         8: anewarray     #4                  // class java/lang/Object
        11: dup
        12: iconst_0
        13: aload_1
        14: aastore
        15: iconst_2
        16: anewarray     #95                 // class java/lang/String
        19: dup
        20: iconst_0
        21: ldc           #97                 // String
        23: aastore
        24: dup
        25: iconst_1
        26: ldc           #97                 // String
        28: aastore
        29: invokespecial #100                // Method org/codehaus/groovy/runtime/GStringImpl."<init>":([Ljava/lang/Object;[Ljava/lang/String;)V
        32: invokedynamic #114,  0            // InvokeDynamic #0:cast:(Lgroovy/lang/GString;)Ljava/lang/String;
        37: iconst_0
        38: anewarray     #4                  // class java/lang/Object
        41: iconst_1
        42: anewarray     #4                  // class java/lang/Object
        45: dup
        46: iconst_0
        47: aload_2
        48: aastore
        49: iconst_1
        50: newarray       int
        52: dup
        53: iconst_0
        54: iconst_0
        55: iastore
        56: invokestatic  #118                // Method org/codehaus/groovy/runtime/ScriptBytecodeAdapter.despreadList:([Ljava/lang/Object;[Ljava/lang/Object;[I)[Ljava/lang/Object;
        59: invokestatic  #122                // Method org/codehaus/groovy/runtime/ScriptBytecodeAdapter.invokeMethodOnCurrentN:(Ljava/lang/Class;Lgroovy/lang/GroovyObject;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;
        62: areturn
        63: nop
        64: athrow
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      63     0  this   Lorg/sample/groovy/GroovyRunnerStatic;
            0      63     1  name   Ljava/lang/String;
            0      63     2  args   Ljava/lang/Object;
      StackMapTable: number_of_entries = 1
        frame_type = 255 /* full_frame */
          offset_delta = 63
          locals = []
          stack = [ class java/lang/Throwable ]

  public void this$dist$set$1(java.lang.String, java.lang.Object);
    descriptor: (Ljava/lang/String;Ljava/lang/Object;)V
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=10, locals=4, args_size=3
         0: aload_2
         1: astore_3
         2: aload_3
         3: ldc           #2                  // class org/sample/groovy/GroovyRunnerStatic
         5: aload_0
         6: new           #93                 // class org/codehaus/groovy/runtime/GStringImpl
         9: dup
        10: iconst_1
        11: anewarray     #4                  // class java/lang/Object
        14: dup
        15: iconst_0
        16: aload_1
        17: aastore
        18: iconst_2
        19: anewarray     #95                 // class java/lang/String
        22: dup
        23: iconst_0
        24: ldc           #97                 // String
        26: aastore
        27: dup
        28: iconst_1
        29: ldc           #97                 // String
        31: aastore
        32: invokespecial #100                // Method org/codehaus/groovy/runtime/GStringImpl."<init>":([Ljava/lang/Object;[Ljava/lang/String;)V
        35: invokedynamic #114,  0            // InvokeDynamic #0:cast:(Lgroovy/lang/GString;)Ljava/lang/String;
        40: invokestatic  #132                // Method org/codehaus/groovy/runtime/ScriptBytecodeAdapter.setGroovyObjectProperty:(Ljava/lang/Object;Ljava/lang/Class;Lgroovy/lang/GroovyObject;Ljava/lang/String;)V
        43: aload_3
        44: pop
        45: return
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      45     0  this   Lorg/sample/groovy/GroovyRunnerStatic;
            0      45     1  name   Ljava/lang/String;
            0      45     2 value   Ljava/lang/Object;

  public java.lang.Object this$dist$get$1(java.lang.String);
    descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=9, locals=2, args_size=2
         0: ldc           #2                  // class org/sample/groovy/GroovyRunnerStatic
         2: aload_0
         3: new           #93                 // class org/codehaus/groovy/runtime/GStringImpl
         6: dup
         7: iconst_1
         8: anewarray     #4                  // class java/lang/Object
        11: dup
        12: iconst_0
        13: aload_1
        14: aastore
        15: iconst_2
        16: anewarray     #95                 // class java/lang/String
        19: dup
        20: iconst_0
        21: ldc           #97                 // String
        23: aastore
        24: dup
        25: iconst_1
        26: ldc           #97                 // String
        28: aastore
        29: invokespecial #100                // Method org/codehaus/groovy/runtime/GStringImpl."<init>":([Ljava/lang/Object;[Ljava/lang/String;)V
        32: invokedynamic #114,  0            // InvokeDynamic #0:cast:(Lgroovy/lang/GString;)Ljava/lang/String;
        37: invokestatic  #139                // Method org/codehaus/groovy/runtime/ScriptBytecodeAdapter.getGroovyObjectProperty:(Ljava/lang/Class;Lgroovy/lang/GroovyObject;Ljava/lang/String;)Ljava/lang/Object;
        40: areturn
        41: nop
        42: athrow
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      41     0  this   Lorg/sample/groovy/GroovyRunnerStatic;
            0      41     1  name   Ljava/lang/String;
      StackMapTable: number_of_entries = 1
        frame_type = 255 /* full_frame */
          offset_delta = 41
          locals = []
          stack = [ class java/lang/Throwable ]

  public groovy.lang.MetaClass getMetaClass();
    descriptor: ()Lgroovy/lang/MetaClass;
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=2, locals=1, args_size=1
         0: aload_0
         1: getfield      #29                 // Field metaClass:Lgroovy/lang/MetaClass;
         4: dup
         5: ifnull        9
         8: areturn
         9: pop
        10: aload_0
        11: dup
        12: invokevirtual #27                 // Method $getStaticMetaClass:()Lgroovy/lang/MetaClass;
        15: putfield      #29                 // Field metaClass:Lgroovy/lang/MetaClass;
        18: aload_0
        19: getfield      #29                 // Field metaClass:Lgroovy/lang/MetaClass;
        22: areturn
      StackMapTable: number_of_entries = 1
        frame_type = 73 /* same_locals_1_stack_item */
          stack = [ class groovy/lang/MetaClass ]

  public void setMetaClass(groovy.lang.MetaClass);
    descriptor: (Lgroovy/lang/MetaClass;)V
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #29                 // Field metaClass:Lgroovy/lang/MetaClass;
         5: return

  public java.lang.Object invokeMethod(java.lang.String, java.lang.Object);
    descriptor: (Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: invokevirtual #145                // Method getMetaClass:()Lgroovy/lang/MetaClass;
         4: aload_0
         5: aload_1
         6: aload_2
         7: invokeinterface #148,  4          // InterfaceMethod groovy/lang/MetaClass.invokeMethod:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;
        12: areturn

  public java.lang.Object getProperty(java.lang.String);
    descriptor: (Ljava/lang/String;)Ljava/lang/Object;
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=3, locals=2, args_size=2
         0: aload_0
         1: invokevirtual #145                // Method getMetaClass:()Lgroovy/lang/MetaClass;
         4: aload_0
         5: aload_1
         6: invokeinterface #152,  3          // InterfaceMethod groovy/lang/MetaClass.getProperty:(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
        11: areturn

  public void setProperty(java.lang.String, java.lang.Object);
    descriptor: (Ljava/lang/String;Ljava/lang/Object;)V
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=4, locals=3, args_size=3
         0: aload_0
         1: invokevirtual #145                // Method getMetaClass:()Lgroovy/lang/MetaClass;
         4: aload_0
         5: aload_1
         6: aload_2
         7: invokeinterface #156,  4          // InterfaceMethod groovy/lang/MetaClass.setProperty:(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
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
      stack=2, locals=3, args_size=0
         0: invokestatic  #160                // Method __$swapInit:()V
         3: lconst_0
         4: invokestatic  #166                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
         7: astore_0
         8: aload_0
         9: invokevirtual #170                // Method java/lang/Long.longValue:()J
        12: putstatic     #172                // Field __timeStamp__239_neverHappen1494440730360:J
        15: aload_0
        16: pop
        17: ldc2_w        #173                // long 1494440730360l
        20: invokestatic  #166                // Method java/lang/Long.valueOf:(J)Ljava/lang/Long;
        23: astore_1
        24: aload_1
        25: invokevirtual #170                // Method java/lang/Long.longValue:()J
        28: putstatic     #176                // Field __timeStamp:J
        31: aload_1
        32: pop
        33: new           #37                 // class org/sample/groovy/OverloadsDynamic
        36: dup
        37: invokespecial #177                // Method org/sample/groovy/OverloadsDynamic."<init>":()V
        40: astore_2
        41: aload_2
        42: putstatic     #35                 // Field overloads:Lorg/sample/groovy/OverloadsDynamic;
        45: aload_2
        46: pop
        47: return
      LineNumberTable:
        line 90: 33

  public static org.sample.groovy.OverloadsDynamic getOverloads();
    descriptor: ()Lorg/sample/groovy/OverloadsDynamic;
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=0, args_size=0
         0: getstatic     #35                 // Field overloads:Lorg/sample/groovy/OverloadsDynamic;
         3: areturn

  public static void setOverloads(org.sample.groovy.OverloadsDynamic);
    descriptor: (Lorg/sample/groovy/OverloadsDynamic;)V
    flags: ACC_PUBLIC, ACC_STATIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: putstatic     #35                 // Field overloads:Lorg/sample/groovy/OverloadsDynamic;
         4: return

  public void super$1$notify();
    descriptor: ()V
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #185                // Method java/lang/Object.notify:()V
         4: return

  public int super$1$hashCode();
    descriptor: ()I
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #190                // Method java/lang/Object.hashCode:()I
         4: ireturn

  public java.lang.String super$1$toString();
    descriptor: ()Ljava/lang/String;
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #194                // Method java/lang/Object.toString:()Ljava/lang/String;
         4: areturn

  public java.lang.Object super$1$clone();
    descriptor: ()Ljava/lang/Object;
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #199                // Method java/lang/Object.clone:()Ljava/lang/Object;
         4: areturn

  public void super$1$wait(long, int);
    descriptor: (JI)V
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=4, locals=4, args_size=3
         0: aload_0
         1: lload_1
         2: iload_3
         3: invokespecial #204                // Method java/lang/Object.wait:(JI)V
         6: return

  public void super$1$wait(long);
    descriptor: (J)V
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=3, locals=3, args_size=2
         0: aload_0
         1: lload_1
         2: invokespecial #207                // Method java/lang/Object.wait:(J)V
         5: return

  public void super$1$wait();
    descriptor: ()V
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #209                // Method java/lang/Object.wait:()V
         4: return

  public void super$1$notifyAll();
    descriptor: ()V
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #213                // Method java/lang/Object.notifyAll:()V
         4: return

  public boolean super$1$equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: invokespecial #218                // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
         5: ireturn

  public void super$1$finalize();
    descriptor: ()V
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #222                // Method java/lang/Object.finalize:()V
         4: return

  public java.lang.Class super$1$getClass();
    descriptor: ()Ljava/lang/Class;
    flags: ACC_PUBLIC, ACC_SYNTHETIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: invokespecial #72                 // Method java/lang/Object.getClass:()Ljava/lang/Class;
         4: areturn

  static java.lang.Class class$(java.lang.String);
    descriptor: (Ljava/lang/String;)Ljava/lang/Class;
    flags: ACC_STATIC, ACC_SYNTHETIC
    Code:
      stack=3, locals=2, args_size=1
         0: aload_0
         1: invokestatic  #230                // Method java/lang/Class.forName:(Ljava/lang/String;)Ljava/lang/Class;
         4: areturn
         5: astore_1
         6: new           #232                // class java/lang/NoClassDefFoundError
         9: dup
        10: aload_1
        11: invokevirtual #237                // Method java/lang/ClassNotFoundException.getMessage:()Ljava/lang/String;
        14: invokespecial #240                // Method java/lang/NoClassDefFoundError."<init>":(Ljava/lang/String;)V
        17: athrow
      Exception table:
         from    to  target type
             0     5     5   Class java/lang/ClassNotFoundException
      StackMapTable: number_of_entries = 1
        frame_type = 69 /* same_locals_1_stack_item */
          stack = [ class java/lang/ClassNotFoundException ]
}
BootstrapMethods:
  0: #107 invokestatic org/codehaus/groovy/vmplugin/v7/IndyInterface.bootstrap:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;I)Ljava/lang/invoke/CallSite;
    Method arguments:
      #109 ()
      #110 0
SourceFile: "static.groovy"
