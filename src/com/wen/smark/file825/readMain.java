package com.wen.smark.file825;

import java.io.*;

/**
 * Created by wen_toto on 2017/8/28.
 */

public class readMain {
    public static void main(String args[]){

        FileOutputStream fileOutputStream = null;
        BufferedOutputStream bufferedOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream("C:/testx/file/test.txt",true);
            String s = "我是说？";
            byte[] bytes = s.getBytes();
            fileOutputStream.write(bytes);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally{
            try{
                if(fileOutputStream != null){
                    fileOutputStream.close();
                }
            }catch(IOException e){
                e.printStackTrace();
            }
        }

//        OutputStreamWriter  fileWriter = null;
//        try {
//            fileWriter = new OutputStreamWriter(new FileOutputStream("C:/testx/file/test.txt",true), "gbk");
//            fileWriter.write("肖世杰的小鸡鸡!");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }finally {
//            try {
//                if (fileWriter != null) {
//                    fileWriter.close();
//                }
//            }catch(IOException e){
//                e.printStackTrace();
//            }
//        }

        FileReaderCharset fileReaderCharset = null;
        try {
            fileReaderCharset = new FileReaderCharset("C:/testx/file/test.txt","utf-8");
            char[] bytes = new char[1024];
            while (fileReaderCharset.read(bytes, 0, bytes.length) != -1){
                String byteStr = new String(bytes);
                System.out.println(byteStr);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch(IOException e){
            e.printStackTrace();
        }finally{
            try {
                if(fileReaderCharset != null){
                    fileReaderCharset.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
