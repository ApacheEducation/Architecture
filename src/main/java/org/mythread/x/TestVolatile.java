package org.mythread.x;

/**
 * Created by yanghai on 16-5-15.
 */
class Test{
    public void dis(){
        System.out.println("ok");
    }
}
public class TestVolatile {
//    static volatile boolean flag=true;
    static boolean flag=true;
    static Test t=null;
    public static void main(String[] args) throws InterruptedException {

        new Thread(){
            public void run(){
                int i=0;
                while (flag){
                    i++;
                }
                t.dis();
            }
        }.start();
        new Thread(){
            public void run(){
                t=new Test();
                flag=false;
            }
        }.start();
    }
}

//Code:
//        [Entry Point]
//        [Verified Entry Point]
//        [Constants]
//        # {method} 'run' '()V' in 'org/mythread/x/TestVolatile$1'
//        0x00007f8fe10628a0: callq  0x00007f8fec9d05d0  ;   {runtime_call}
//        0x00007f8fe10628a5: nopw   0x0(%rax,%rax,1)
//        0x00007f8fe10628b0: mov    %eax,-0x14000(%rsp)
//        0x00007f8fe10628b7: push   %rbp
//        0x00007f8fe10628b8: sub    $0x10,%rsp
//        0x00007f8fe10628bc: mov    (%rsi),%ebp
//        0x00007f8fe10628be: mov    %rsi,%rdi
//        0x00007f8fe10628c1: mov    $0x7f8feca67d00,%r10
//        0x00007f8fe10628cb: callq  *%r10
//        0x00007f8fe10628ce: mov    $0xd75066e8,%r10   ;   {oop(a 'java/lang/Class' = 'org/mythread/x/TestVolatile')}
//        0x00007f8fe10628d8: movzbl 0x5c(%r10),%r10d
//        0x00007f8fe10628dd: test   %r10d,%r10d
//        0x00007f8fe10628e0: je     0x00007f8fe10628ec  ;*goto
//        ; - org.mythread.x.TestVolatile$1::run@11 (line 20)
//        0x00007f8fe10628e2: inc    %ebp               ; OopMap{off=68}
//        ;*goto
//        ; - org.mythread.x.TestVolatile$1::run@11 (line 20)
//        0x00007f8fe10628e4: test   %eax,0xcbe6716(%rip)        # 0x00007f8fedc49000
//        ;*goto
//        ; - org.mythread.x.TestVolatile$1::run@11 (line 20)
//        ;   {poll}
//        0x00007f8fe10628ea: jmp    0x00007f8fe10628e2  ;*getstatic flag
//        ; - org.mythread.x.TestVolatile$1::run@2 (line 19)
//        0x00007f8fe10628ec: mov    $0xffffff86,%esi
//        0x00007f8fe10628f1: xchg   %ax,%ax
//        0x00007f8fe10628f3: callq  0x00007f8fe1039320  ; OopMap{off=88}
//        ;*getstatic flag
//        ; - org.mythread.x.TestVolatile$1::run@2 (line 19)
//        ;   {runtime_call}
//        0x00007f8fe10628f8: callq  0x00007f8fec9d05d0  ;*getstatic flag
//        ; - org.mythread.x.TestVolatile$1::run@2 (line 19)
//        ;   {runtime_call}
//        0x00007f8fe10628fd: callq  0x00007f8fec9d05d0  ;   {runtime_call}
//        0x00007f8fe1062902: hlt
//        0x00007f8fe1062903: hlt
//        0x00007f8fe1062904: hlt
//        0x00007f8fe1062905: hlt
//        0x00007f8fe1062906: hlt
//        0x00007f8fe1062907: hlt
//        0x00007f8fe1062908: hlt
//        0x00007f8fe1062909: hlt
//        0x00007f8fe106290a: hlt
//        0x00007f8fe106290b: hlt
//        0x00007f8fe106290c: hlt
//        0x00007f8fe106290d: hlt
//        0x00007f8fe106290e: hlt
//        0x00007f8fe106290f: hlt
//        0x00007f8fe1062910: hlt
//        0x00007f8fe1062911: hlt
//        0x00007f8fe1062912: hlt
//        0x00007f8fe1062913: hlt
//        0x00007f8fe1062914: hlt
//        0x00007f8fe1062915: hlt
//        0x00007f8fe1062916: hlt
//        0x00007f8fe1062917: hlt
//        0x00007f8fe1062918: hlt
//        0x00007f8fe1062919: hlt
//        0x00007f8fe106291a: hlt
//        0x00007f8fe106291b: hlt
//        0x00007f8fe106291c: hlt
//        0x00007f8fe106291d: hlt
//        0x00007f8fe106291e: hlt
//        0x00007f8fe106291f: hlt
//        [Exception Handler]
//        [Stub Code]
//        0x00007f8fe1062920: jmpq   0x00007f8fe105f1a0  ;   {no_reloc}
//        [Deopt Handler Code]
//        0x00007f8fe1062925: callq  0x00007f8fe106292a
//        0x00007f8fe106292a: subq   $0x5,(%rsp)
//        0x00007f8fe106292f: jmpq   0x00007f8fe1038f00  ;   {runtime_call}
//        0x00007f8fe1062934: hlt
//        0x00007f8fe1062935: hlt
//        0x00007f8fe1062936: hlt
//        0x00007f8fe1062937: hlt


//Code:
//        [Entry Point]
//        [Verified Entry Point]
//        [Constants]
//        # {method} 'run' '()V' in 'org/mythread/x/TestVolatile$1'
//        0x00007fa4d9063600: callq  0x00007fa4e3ce15d0  ;   {runtime_call}
//        0x00007fa4d9063605: nopw   0x0(%rax,%rax,1)
//        0x00007fa4d9063610: mov    %eax,-0x14000(%rsp)
//        0x00007fa4d9063617: push   %rbp
//        0x00007fa4d9063618: sub    $0x20,%rsp
//        0x00007fa4d906361c: mov    (%rsi),%ebp
//        0x00007fa4d906361e: mov    %rsi,%rdi
//        0x00007fa4d9063621: mov    $0x7fa4e3d78d00,%r10
//        0x00007fa4d906362b: callq  *%r10              ;*getstatic flag
//        ; - org.mythread.x.TestVolatile$1::run@2 (line 19)
//        0x00007fa4d906362e: mov    $0xd75065d8,%r10   ;   {oop(a 'java/lang/Class' = 'org/mythread/x/TestVolatile')}
//        0x00007fa4d9063638: jmp    0x00007fa4d9063648
//        0x00007fa4d906363a: nopw   0x0(%rax,%rax,1)
//        0x00007fa4d9063640: inc    %ebp               ; OopMap{r10=Oop off=66}
//        ok                                ;*goto
//        ; - org.mythread.x.TestVolatile$1::run@11 (line 20)
//        0x00007fa4d9063642: test   %eax,0xbef69b8(%rip)        # 0x00007fa4e4f5a000
//        ;   {poll}
//        0x00007fa4d9063648: movzbl 0x5c(%r10),%r8d    ;*getstatic flag
//
//        ; - org.mythread.x.TestVolatile$1::run@2 (line 19)
//        0x00007fa4d906364d: test   %r8d,%r8d
//        0x00007fa4d9063650: jne    0x00007fa4d9063640  ;*ifeq
//        ; - org.mythread.x.TestVolatile$1::run@5 (line 19)
//        0x00007fa4d9063652: mov    $0xffffff75,%esi
//        0x00007fa4d9063657: mov    %r8d,(%rsp)
//        0x00007fa4d906365b: callq  0x00007fa4d9039320  ; OopMap{off=96}
//        ;*ifeq
//        ; - org.mythread.x.TestVolatile$1::run@5 (line 19)
//        ;   {runtime_call}
//        0x00007fa4d9063660: callq  0x00007fa4e3ce15d0  ;*ifeq
//        ; - org.mythread.x.TestVolatile$1::run@5 (line 19)
//        ;   {runtime_call}
//        0x00007fa4d9063665: hlt
//        0x00007fa4d9063666: hlt
//        0x00007fa4d9063667: hlt
//        0x00007fa4d9063668: hlt
//        0x00007fa4d9063669: hlt
//        0x00007fa4d906366a: hlt
//        0x00007fa4d906366b: hlt
//        0x00007fa4d906366c: hlt
//        0x00007fa4d906366d: hlt
//        0x00007fa4d906366e: hlt
//        0x00007fa4d906366f: hlt
//        0x00007fa4d9063670: hlt
//        0x00007fa4d9063671: hlt
//        0x00007fa4d9063672: hlt
//        0x00007fa4d9063673: hlt
//        0x00007fa4d9063674: hlt
//        0x00007fa4d9063675: hlt
//        0x00007fa4d9063676: hlt
//        0x00007fa4d9063677: hlt
//        0x00007fa4d9063678: hlt
//        0x00007fa4d9063679: hlt
//        0x00007fa4d906367a: hlt
//        0x00007fa4d906367b: hlt
//        0x00007fa4d906367c: hlt
//        0x00007fa4d906367d: hlt
//        0x00007fa4d906367e: hlt
//        0x00007fa4d906367f: hlt
//        [Exception Handler]
//        [Stub Code]
//        0x00007fa4d9063680: jmpq   0x00007fa4d905f1a0  ;   {no_reloc}
//        [Deopt Handler Code]
//        0x00007fa4d9063685: callq  0x00007fa4d906368a
//        0x00007fa4d906368a: subq   $0x5,(%rsp)
//        0x00007fa4d906368f: jmpq   0x00007fa4d9038f00  ;   {runtime_call}
//        0x00007fa4d9063694: hlt
//        0x00007fa4d9063695: hlt
//        0x00007fa4d9063696: hlt
//        0x00007fa4d9063697: hlt
