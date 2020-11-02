package com.study.java;

import com.study.entity.Student;

import java.util.ArrayList;
import java.util.Arrays;

public class HelloWorld {
    //模板六：prsf
    private static final Student STU = new Student();
    //同类型：psf
    public static final int NUM =1;
    //同类型：psfi
    public static final int XX =0;
    //同类型：psfs
    public static final String  NATION = "CHINA";

    //模板一：psvm
    public static void main(String[] args) {

        //模板二：sout
        System.out.println();
        //变形1：soutp
        System.out.println("args = " + Arrays.deepToString(args));
        //变形2：soutm (打印方法名称）
        System.out.println("HelloWorld.main");
        //变形3：soutv （打印最近的变量）
        int num = 2;
        System.out.println("num = " + num);
        //xxx.sout(num.sout)
        System.out.println(num);


        //模板三：fori
        for (int i = 0; i <args.length ; i++) {

        }
        //变形1：iter
        for (String arg : args) {
            
        }
        //变形2：itar
        String[]  strs = {"zs", "ls", "ww"};
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];

        }
        for (int i = 0; i < strs.length; i++) {
            String str = strs[i];
        }
        
        //模板四:list.for  (下面的例子输入：strlist.for)
        ArrayList<String> strlist = new ArrayList<>();
        for (String s : strlist) {

        }
        //变形1：list.fori
        for (int i = 0; i < strlist.size(); i++) {

        }
        //变形2：list.forr   （reserve，倒序遍历）
        for (int i = strlist.size() - 1; i >= 0; i--) {

        }

        //模板五：ifn  (对就近变量进行判断是否为null）
        String  str =null;
        if (str == null) {

        }
        //变形1：inn  (对就近变量进行判断是否不为null）
        if (str != null) {

        }
        //变形2：xxx.nn
        if (str != null) {

        }
        //变形3：xxx.null
        if (str == null) {

        }

    }
}
