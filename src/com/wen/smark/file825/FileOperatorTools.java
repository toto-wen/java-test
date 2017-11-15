package com.wen.smark.file825;

import java.io.*;

/**
 * @ClassName: FileOperatorTools
 * @Description: 上传下载公用方法
 * @author wen_toto
 * @date 2017/8/28
 */

public class FileOperatorTools {
    /**
     * 私有化该公用类的构造方法
     */
    private FileOperatorTools(){

    }

    /**
     * @Title: fileBinaryUpAndDown
     * @Description: 该方法为二进制流的上传下载操作
     * @author wen_toto
     * @date 2017/8/28
     * @param UpPath 下载资源的文件路径
     * @param DownPath 上传资源的文件路径
     * @return boolean
     * @throws NullPointerException
     * @throws FileNotFoundException
     */
    public static boolean fileBinaryUpAndDown(String UpPath, String DownPath) throws NullPointerException, FileNotFoundException {
        //定义下载文件(fileUp)和上传文件(fileDown）的文件对象
        File fileUp = null, fileDown = null;
        /**
         * 判断定义的下载(UpPath和上传(DownPath文件的路径是否存在
         * 如果不存在则抛出空指针异常,否则进入else中,在else中主要进行文件的创建，
         * 如果下载文件创建不成功则抛出找不到指定文件路径的异常，如果上传文件为创建成功，则
         * 调用createNewFile方法进行文件的创建
         */
        if(UpPath == null || DownPath == null){
            throw new NullPointerException(UpPath+"或"+DownPath+"路径为null");
        }else {
            //调用FileSeparator方法将传入的下载(UpPath)和上传(DownPath)路径变更为符合当前使用的系统的路径格式
            UpPath = FileTools.FileSeparator(UpPath);
            DownPath = FileTools.FileSeparator(DownPath);
            //创建文件(fileUp和fileDown)
            fileUp = new File(UpPath);
            fileDown = new File(DownPath);
            //判断下载(fileUp)文件是否存在,不错在则抛出找不到文件目录异常
            if(!fileUp.exists()){
                throw new FileNotFoundException("指定路径不存在"+UpPath);
            }
            //判断上传(fileDown)文件是否存在，不存在则创建一个新文件用于存储数据，如果为创建成功则捕获异常并提示用户
            if(!fileDown.exists()){
                try {
                    //创建上传文件(fileDown)
                    fileDown.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();

                    return false;
                }
            }
        }
        //定义并初始化输入流bufferedInputStream
        FileInputStream fileInputStream = new FileInputStream(fileUp);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        //定义并初始化输出流bufferedOutputStream
        FileOutputStream fileOutputStream = new FileOutputStream(fileDown);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
        //定义并初始化byte数组，大小为1024
        byte[] bytes = new byte[1024];
        //定义并初始化读取的字节数量
        int length = 0;
        try {
            //循环读取文件
            while ((length  = bufferedInputStream.read(bytes, 0, 1024)) != -1){
                //将读取的文件写入上传文件
                bufferedOutputStream.write(bytes, 0, length);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }finally {
            try {
                //关闭输入流
                if(fileInputStream != null){
                    fileInputStream.close();
                }
                if (bufferedInputStream != null) {
                    bufferedInputStream.close();
                }

                if(fileOutputStream != null){
                    fileOutputStream.flush();
                    fileOutputStream.close();
                }
                if (bufferedOutputStream != null) {
                    //清空输出流的缓存
                    bufferedOutputStream.flush();
                    //关闭输出流
                    bufferedOutputStream.close();
                }
            }catch (IOException e) {
                e.printStackTrace();
            }
        }

        return false;
    }

    /**
     * @Title: FileCharUpAndDown
     * @Description: 该方法为字符流文件的上传下载的实现方法
     * @author wen_toto
     * @date 2017/8/28
     * @param UpPath 下载路径
     * @param DownPath 上传路径
     * @return boolean
     * @throws FileNotFoundException
     * @throws UnsupportedEncodingException
     */
    public static boolean FileCharUpAndDown(String UpPath, String DownPath) throws FileNotFoundException, UnsupportedEncodingException {
        //定义下载文件(fileUp)和上传文件(fileDown）的文件对象
        File fileUp = null, fileDown = null;
        /**
         * 判断定义的下载(UpPath和上传(DownPath文件的路径是否存在
         * 如果不存在则抛出空指针异常,否则进入else中,在else中主要进行文件的创建，
         * 如果下载文件创建不成功则抛出找不到指定文件路径的异常，如果上传文件为创建成功，则
         * 调用createNewFile方法进行文件的创建
         */
        if(UpPath == null || DownPath == null){
            throw new NullPointerException(UpPath+"或"+DownPath+"路径为null");
        }else {
            //调用FileSeparator方法将传入的下载(UpPath)和上传(DownPath)路径变更为符合当前使用的系统的路径格式
            UpPath = FileTools.FileSeparator(UpPath);
            DownPath = FileTools.FileSeparator(DownPath);
            //创建文件(fileUp和fileDown)
            fileUp = new File(UpPath);
            fileDown = new File(DownPath);
            //判断下载(fileUp)文件是否存在,不错在则抛出找不到文件目录异常
            if(!fileUp.exists()){
                throw new FileNotFoundException("指定路径不存在"+UpPath);
            }
            //判断上传(fileDown)文件是否存在，不存在则创建一个新文件用于存储数据，如果为创建成功则捕获异常并提示用户
            if(!fileDown.exists()){
                try {
                    //创建上传文件(fileDown)
                    fileDown.createNewFile();
                } catch (IOException e) {
                    e.printStackTrace();
                    return false;
                }
            }
        }

        try {
            //定义并初始化字符输入流bufferedReader
            FileReaderCharset fileReaderCharset = new FileReaderCharset(fileUp,"utf-8");
            BufferedReader bufferedReader = new BufferedReader(fileReaderCharset);
            //定义并初始化字符流输出流bufferedWrite
            FileOutputStream  fileOutputStream = new FileOutputStream(fileDown, true);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fileOutputStream);
            BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

            try {
                //定义写入的String变量
                String readContent = "";
                //循环读取下载文件
                while ((readContent = bufferedReader.readLine()) != null){
                    //将输入流读取的内容写入上传文件中
                    bufferedWriter.write(readContent);
                }

            } catch (IOException e) {
                e.printStackTrace();
                //操作失败，返回false
                return false;
            }finally {
                try {
                    //关闭输入流
                    if(fileReaderCharset != null){
                        fileReaderCharset.close();
                    }
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                    if(fileOutputStream != null){
                        fileOutputStream.flush();
                        fileOutputStream.close();
                    }
                    if (outputStreamWriter != null){
                        outputStreamWriter.flush();
                        outputStreamWriter.close();
                    }
                    if(bufferedWriter != null){
                        //清空输出流缓存
                        bufferedWriter.flush();
                        //关闭输出流
                        bufferedWriter.close();
                    }
                }catch(IOException e){
                    e.printStackTrace();
                }
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            return false;
        }

        return true;
    }
}
