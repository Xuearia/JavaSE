package T03作业;

public class Exercise9 {
    public static void main(String[] args) {
        /*
        需求：世界最高山峰是珠穆朗玛峰(8844.43米=8844430毫米)，
        假如我有一张足够大的纸，它的厚度是0.1毫米。
        请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
        */

        // 定义纸张初始厚度为0.1毫米
        double paperHeight = 0.1;
        // 定义珠穆朗玛峰的高度为8844430毫米
        double mountainHeight = 8844430;
        // 初始化折叠次数计数器
        int count = 0;

        // 使用while循环，直到纸张厚度超过珠穆朗玛峰的高度
        while (paperHeight <= mountainHeight) {
            // 每次折叠，纸张厚度翻倍
            paperHeight *= 2;
            // 折叠次数加一
            count++;
        }

        // 输出达到或超过珠穆朗玛峰高度所需的折叠次数
        System.out.println("需要折叠 " + count + " 次才能达到或超过珠穆朗玛峰的高度。");
    }
}
