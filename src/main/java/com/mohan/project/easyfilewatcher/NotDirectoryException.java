package com.mohan.project.easyfilewatcher;

public class NotDirectoryException extends Exception {

    private static final String DEFAULT_MESSAGE = "指定路劲不是一个合法文件夹路劲";

    public NotDirectoryException() {
        super(DEFAULT_MESSAGE);
    }

    public NotDirectoryException(String message) {
        super(message);
    }

    public NotDirectoryException(String message, Throwable cause) {
        super(message, cause);
    }

    public NotDirectoryException(Throwable cause) {
        super(cause);
    }

    protected NotDirectoryException(String message, Throwable cause,
                        boolean enableSuppression,
                        boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
