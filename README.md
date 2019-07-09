文件监控器
    利用jdk提供的API，WatchService实现。单起一个线程实时监控指定文件夹下的文件变化情况。
使用
void watch(final File file, final boolean subDir, final FileActionCallback callback) throws StartWatcherExecutorException
file       需要监控的文件夹，不能为具体文件路径
subDir     是否需要监控file的子文件
callback   文件发生变化后的回调函数
FileWatcherExecutor.watch(file, true, callback)

