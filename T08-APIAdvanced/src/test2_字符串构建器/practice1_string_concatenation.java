package test2_字符串构建器;

/**
 * 该类用于演示如何将整数数组转换为字符串形式。
 */
public class practice1_string_concatenation {
    /**
     * 主函数入口。
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        // 初始化一个整数数组
        int[] a = {12, 13, 14, 15};

        // 调用拼接方法并打印结果
        System.out.println(splicing(a));
    }

    /**
     * 将整数数组转换为特定格式的字符串（如 "[12,13,14,15]"）。
     * 如果输入数组为 null，则返回 null。
     *
     * @param arr 需要被转换的整数数组
     * @return 数组的字符串表示形式；若输入为 null，则返回 null
     */
    public static String splicing(int[] arr) {
        // 判断数组是否为空
        if (arr == null) {
            return null;
        }

        // 创建 StringBuilder 实例以高效构建字符串
        StringBuilder s = new StringBuilder();

        // 添加起始中括号
        s.append("[");

        // 遍历数组，逐个追加元素到 StringBuilder 中
        for (int i = 0; i < arr.length; i++) {
            s.append(arr[i]);

            // 若不是最后一个元素，追加逗号
            if (i < arr.length - 1) {
                s.append(",");
            }
        }

        // 添加结束中括号
        s.append("]");

        // 返回最终的字符串结果
        return s.toString();
    }
}
