package com.logger;

import com.sun.media.jfxmedia.logging.Logger;

import java.util.logging.Filter;
import java.util.logging.LogRecord;

public class DummyFilter implements Filter {
    @Override
    public boolean isLoggable(LogRecord logRecord) {
        return !logRecord.getLevel().equals(Logger.INFO);
    }
}
