package T01高级循环;

public class 跳过循环演示1 {
    public static void main(String[] args) {
        //1.跳过循环
        //小明买了10个包子 再吃第三个是发现有虫子 于是丢了 吃下一个 吃
        // 到第要吃第 8个时吃饱了 不吃了
        for (int i = 1; i <= 10; i++) {
            if (i == 3) {
                continue;
            }else if(i == 8){
                break;
            }
            System.out.println("小明吃了第" + i + "个包子");
        }
    }
}
