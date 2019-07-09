package com.mohan.project.easyfilewatcher;

public class StartWatcherExecutorException extends Exception {

    private static final String DEFAULT_MESSAGE = "启动文件监控执行器失败";

    public StartWatcherExecutorException() {
        super(DEFAULT_MESSAGE);
    }

    public StartWatcherExecutorException(String message) {
        super(message);
    }

    public StartWatcherExecutorException(String message, Throwable cause) {
        super(message, cause);
    }

    public StartWatcherExecutorException(Throwable cause) {
        super(cause);
    }

    protected StartWatcherExecutorException(String message, Throwable cause,
                                            boolean enableSuppression,
                                            boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
