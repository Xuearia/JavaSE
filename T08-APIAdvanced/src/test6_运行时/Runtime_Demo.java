package test6_运行时;

import java.io.IOException;

public class Runtime_Demo {
    public static void main(String[] args) throws IOException, InterruptedException {
        // 1、public static Runtime getRuntime() 返回与当前Java应用程序关联的运行时对象。
        Runtime r = Runtime.getRuntime();

        // 2、public void exit(int status) 终止当前运行的虚拟机,该参数用作状态代码; 按照惯例，非零状态代码表示异常终止。
        //r.exit(0);

        // 3、public int availableProcessors(): 获取虚拟机能够使用的处理器数。
        System.out.println(r.availableProcessors());

        // 4、public long totalMemory() 返回Java虚拟机中的内存总量。

        System.out.println(r.totalMemory()/1024.0/1024.0+"mb");// 1024 = 1K     1024 * 1024 = 1M

        // 5、public long freeMemory() 返回Java虚拟机中的可用内存量
        System.out.println(r.freeMemory() / 1024.0 / 1024.0 + "MB");

        // 6、public Process exec(String command) 启动某个程序，并返回代表该程序的对象。
        //无法启动?权限不足? 方法一：使用 cmd /c start "" "路径" 来启动快捷方式
        //cmd /c 表示执行完命令后关闭命令行窗口。
        //start "" 是 Windows 命令，用于启动关联的程序，自动解析 .lnk 文件。
        //使用双引号包裹路径，防止空格导致的问题。
        Process p = r.exec("cmd /c start \"\" \"C:\\ProgramData\\Microsoft\\Windows\\Start Menu\\Programs\\夸克.lnk");
         Thread.sleep(3000);//让程序停3秒在向下走
        p.destroy();//销毁!关闭程序


    }
}
