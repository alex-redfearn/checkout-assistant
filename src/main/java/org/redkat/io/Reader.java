package org.redkat.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Reader {
    
    private BufferedReader reader;

    public Reader(InputStream inputStream) {
        this.reader = new BufferedReader(new InputStreamReader(inputStream));
    }

    public String readLine() throws IOException {
        return this.reader.readLine();
    }
}
