package T05while循环;

/**
 * This class demonstrates the calculation of how many times a standard A4 paper needs to be folded to exceed the height of Mount Everest.
 */
public class WhileDemo2 {
    public static void main(String[] args) {
/*
        假设一张标准的A4纸厚度约为0.1毫米。每次将纸对折后，其厚度会翻倍。珠穆朗玛峰的高度约为8848米。
        问题
        计算纸张对折多少次后，其厚度能够超过珠穆朗玛峰的高度？
        输出每次对折后的纸张厚度，直到超过珠穆朗玛峰的高度为止。
*/
        //纸的厚度
        double PaperHight = 0.1;
        //珠穆朗玛峰的高度
        double MountainHight = 8848.0;

        //累计对折次数
        double accumulate = 0;
        //当纸的厚度小于等于珠穆朗玛峰的高度时，继续对折
        while (PaperHight <= MountainHight) {

            //每次对折后，纸的厚度翻倍
            PaperHight = PaperHight * 2;
            //对折次数累计
            accumulate++;
        }
        //输出对折次数和最终纸的厚度
        System.out.println("计算纸张对折" + accumulate + "次后，其厚度能够超过珠穆朗玛峰的高度" + "高度为:" + PaperHight);
    }
}
