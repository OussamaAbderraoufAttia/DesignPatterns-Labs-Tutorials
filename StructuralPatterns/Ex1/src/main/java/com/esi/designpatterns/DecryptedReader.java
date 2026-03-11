package com.esi.designpatterns;

import java.io.IOException;
import java.io.Reader;

public class DecryptedReader extends Reader {
    private Reader decoratedReader;

    public DecryptedReader(Reader reader) {
        super(reader);
        this.decoratedReader = reader;
    }

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        int charsRead = decoratedReader.read(cbuf, off, len);
        if (charsRead != -1) {
            for (int i = 0; i < charsRead; i++) {
                cbuf[off + i] = (char) (cbuf[off + i] - 1); // Simple shift decryption
            }
        }
        return charsRead;
    }

    @Override
    public void close() throws IOException {
        decoratedReader.close();
    }
}
