package com.wen.smark.file825;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName: FileTools
 * @Description: 该类为文件操作类
 * @author wen_toto
 * @date 2017/8/25
 */

public class FileTools {

    /**
     * @Title: CreateFile
     * @Description: 该方法用于创建文件。
     * @author wen_toto
     * @date 2017/8/25
     * @param FilePath 需创建的文件路径
     * @return File
     */
    public File CreateFile(String FilePath){
        //判断传入的需创建的文件路径是否为null
        if(FilePath != null){
            //格式化路径并返回格式化后的路径
            FilePath = FileSeparator(FilePath);
            //创建文件对象
            File file = new File(FilePath);
            /**
             * 判断该文件是否已经存在，如果存在则返回该文件对象，否则创建新的文件
             */
            if(file.exists()){
                System.out.println("需创建的文件已经存在");
                //返回该文件路径的文件对象
                return file;
            }else {
                System.out.println("该文件还未被创建");
                //获取该文件的上一级目录对象
                File fileParent = file.getParentFile();
                /**
                 * 判断该文件上一级目录是否存在,如果存在，则直接创建该文件，否则进入else进行上级目录的创建，如何再进行该文件
                 * 的创建。。。
                 */
                if(fileParent.exists()){
                    //创建文件
                    try {
                        System.out.println("正在创建该文件");
                        //调用createNewFile()方法创建文件
                        file.createNewFile();
                        System.out.println("文件创建成功");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }else {
                    System.out.println("创建该文件的一个或者多个上级目录");
                    //调用mkdirs()方法创建目录
                    fileParent.mkdirs();
                    System.out.println("该文件的一个或者多个上级目录创建完成");
                    System.out.println("创建文件");
                    //调用createNewFile()方法创建文件
                    try {
                        //调用createNewFile()方法创建文件
                        file.createNewFile();
                        System.out.println("文件创建成功");
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                return file;
            }
        }else {
            //抛出空指针异常
            throw new NullPointerException();
        }
    }

    /**
     * @Title: BuilderDirectory
     * @Description: 该方法用于创建文件目录，可创建一个或者多个层级目录，该方法不提供文件的创建。只提供目录的创建
     * @author wen_toto
     * @date 2017/8/25
     * @param DirectoryPath 传入的文件目录路径
     * @return File
     */
    public File  BuilderDirectory(String DirectoryPath) throws NullPointerException{
        //判断传入的路径是否为空,如不为空则进入if进行目录或文件的创建
        if(DirectoryPath != null){
            //格式化路径并返回格式化后的路径
            DirectoryPath = FileSeparator(DirectoryPath);
            //创建File对象并使用传入的路径DirectoryPath来初始化该对象
            File file = new File(DirectoryPath);
            /**
             * 判断该目录是否已经存在，如不存在则进行创建。如存在则返回该路径的文件对象
             */
            if(file.exists()){
                System.out.println("该目录已经存在，不需要创建!!");
                //返回目录的对象
                return file;
            }else {
                System.out.println("正在为您创建该文件目录或文件");
                //创建目录
                file.mkdirs();
                System.out.println("已经成功创建该目录结构");
                //返回新建目录的文件对象
                return file;
            }
        }else {
            throw new NullPointerException();
        }
    }

    /**
     * @Title: FileSeparator
     * @Description: 该方法为私有类型，只适用于本类，不允许其他类调用.用于是传入的路径符合当前使用系统的规范
     * @author wen_toto
     * @date 2017/8/25
     * @param DirectoryPath 传入的路径
     * @return String
     */
    public static String FileSeparator(String DirectoryPath) throws NullPointerException{
        //判断传入的参数是否为null
        if(DirectoryPath != null){
            /**
             * 检测传入的文件路径的分隔符类型，并根据不同的分隔符类型来进行不同的操作系统的路径格式的格式化
             * 其中File.separator字段的功能是返回当前所使用的操作系统所使用的路径的统一分隔符，使用String类对象的replace()方法
             * 来重新格式化传入的路径，以使其能够适应当前使用的操作系统的文件路径规则.if语句中用于判断路径的分隔符是否为当前系统
             * 所使用的分隔符，如果不是，则进入相应的if中进行格式化
             */
            if(DirectoryPath.contains("\\") && File.separator.equals("/")){
                // 将路径中的\替换成/
                DirectoryPath = DirectoryPath.replace("\\", File.separator);
            }else if (DirectoryPath.contains("/") && File.separator.equals("\\")){
                //将路径中的"/"替换成"\"
                DirectoryPath = DirectoryPath.replace("/", File.separator);
            }
            return DirectoryPath;
        }else{
            //抛出空指针异常
            throw new NullPointerException();
        }
    }

    public void FileField(File file){
        System.out.println("输出该文件或者目录的一些基本设置:");
        System.out.println("文件路径："+file.getPath());
        System.out.println("文件名称："+file.getName());
        System.out.println("文件上一级路径："+file.getParent());
        System.out.println("文件的绝对路径："+file.getAbsolutePath());
        System.out.println("文件的路径："+file.getPath());
        System.out.println("文件能否执行："+file.canExecute());
        System.out.println("文件能否读取："+file.canRead());
        System.out.println("文件能否被写入："+file.canWrite());
        System.out.println("是否为绝对路径："+file.isAbsolute());
        System.out.println("是否为目录："+file.isDirectory());
        System.out.println("是否为文件："+file.isFile());
        System.out.println("是否为隐藏文件："+file.isHidden());
    }

}
