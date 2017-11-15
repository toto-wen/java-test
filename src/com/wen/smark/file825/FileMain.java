package com.wen.smark.file825;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: FileMain
 * @Description: 该类为程序运行接口main方法的实现类
 * @author wen_toto
 * @date 2017/8/25
 */

public class FileMain {

    /**
     * @Title: main
     * @Description: 程序的入口函数
     * @author wen_toto
     * @date 2017/8/25
     * @param args 参数
     */
    public static void main(String[] args){
        //文件test.doc的绝对路径
        String testdoc = "C:\\testx\\file\\test.doc";
        //文件test.txt的绝对路径
        String testtxt = "C:/testx/file/test.txt";
        //创建文件操作类对象
        FileTools fileTools = new FileTools();
        //创建test.doc文件
        File fileDoc = fileTools.CreateFile(testdoc);
        //输出test.doc文件的一些属性
        fileTools.FileField(fileDoc);
        //创建test.txt文件
        File fileTxt = fileTools.CreateFile(testtxt);
        //输出test.txt文件的一些属性
        fileTools.FileField(fileTxt);
        InputStream inputStream = null;
        InputStreamReader inputStreamReader = null;
        try {
            inputStream = new FileInputStream(fileTxt);
//            byte[] bytes = new byte[1024];
//                while (inputStream.read(bytes, 0, bytes.length) != -1){
//                    String s = new String(bytes);
//                    System.out.println(s);
//                }
            inputStreamReader = new InputStreamReader(inputStream, "gbk");
            char[] chars = new char[1024];
            while (inputStreamReader.read(chars, 0, 512) != -1){
                System.out.println(chars);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                inputStream.close();
                inputStreamReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        //第一种用Date类
        Date date = new Date(fileDoc.lastModified());
        System.out.println(simpleDateFormat.format(date));
        //第二种
        System.out.println(simpleDateFormat.format(fileDoc.lastModified()));
//        if(file.exists()){
//            System.out.println("已存在");
//            System.out.println(file.getPath());
//        }else {
//            System.out.println(file.getPath()+"该目录不存在,以为你自动创建该目录结构");
//            file.mkdirs();
//            System.out.println(file.getPath());
//        }

//        System.out.println(new FileTools().BuilderDirectory("E:/test/ppp/xiao"));

    }

}
