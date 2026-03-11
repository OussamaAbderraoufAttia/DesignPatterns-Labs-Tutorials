package com.esi.designpatterns;

import java.io.IOException;
import java.io.Writer;

public class EncryptedWriter extends Writer {
    private Writer decoratedWriter;

    public EncryptedWriter(Writer writer) {
        super(writer);
        this.decoratedWriter = writer;
    }

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        char[] encrypted = new char[len];
        for (int i = 0; i < len; i++) {
            encrypted[i] = (char) (cbuf[off + i] + 1); // Simple shift encryption
        }
        decoratedWriter.write(encrypted, 0, len);
    }

    @Override
    public void flush() throws IOException {
        decoratedWriter.flush();
    }

    @Override
    public void close() throws IOException {
        decoratedWriter.close();
    }
}
