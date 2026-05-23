package T03ArrayList_API.数组列表练习.Topic1_搜索数据删除;

import java.util.ArrayList;

public class TraverseAndDeleteTheSameData2 {
    /*    需求:
        现在假如购物车中存储了如下这些商品:Java入门,宁夏枸杞,黑枸杞,人
        字拖,特级枸杞,枸杞子。现在用户不想买枸杞了,选择了批量删除,请完
        成该需求。*/
    public static void main(String[] args) {
        //创建集合
        ArrayList<String> list = new ArrayList<>();
        //添加数据
        list.add("Java入门");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("人字拖");
        list.add("特级枸杞");
        list.add("枸杞子");

        //删除带有"枸杞"的数据
        // 从集合的最后一个元素开始遍历，避免在遍历过程中修改集合大小导致的问题
        for (int i = list.size() - 1; i >= 0; i--) {
            // 获取当前索引对应的元素
            String leng = list.get(i); // 遍历i集合
            // 检查当前元素是否包含"枸杞"
            if (leng.contains("枸杞")) {
                // 如果包含"枸杞"，则从集合中移除该元素
                list.remove(leng);
            }
        }
        // 打印删除后的集合
        System.out.println(list);
    }
}
