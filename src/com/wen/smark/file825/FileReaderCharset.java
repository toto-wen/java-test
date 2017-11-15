package com.wen.smark.file825;

import java.io.*;
import java.nio.charset.Charset;

/**
 * Created by wen_toto on 2017/8/28.
 */

public class FileReaderCharset extends InputStreamReader {
    public FileReaderCharset(File file, String cs) throws FileNotFoundException, UnsupportedEncodingException {
        super(new FileInputStream(file  ), cs);
    }

    public FileReaderCharset(String filePath, Charset cs) throws FileNotFoundException {
        super(new FileInputStream(filePath), cs);
    }
}
