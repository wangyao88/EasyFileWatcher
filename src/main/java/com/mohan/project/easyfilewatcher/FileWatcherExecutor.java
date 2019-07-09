package com.mohan.project.easyfilewatcher;

import java.io.File;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class FileWatcherExecutor {

    public static void watch(final File file, final boolean subDir, final FileActionCallback callback) throws StartWatcherExecutorException {
        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        scheduledExecutorService.submit(() -> new FileWatcher(file, false, callback));
        System.out.println("正在监视文件夹:" + file.getAbsolutePath() + "的变化");
    }
}
