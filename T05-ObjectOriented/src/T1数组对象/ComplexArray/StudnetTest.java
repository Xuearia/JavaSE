package T1数组对象.ComplexArray;
/*
* 定义一个长度为3的数组，数组存储1~3名学生对象作为初始数据，学生对象的学号，姓名各不相同。
学生的属性：学号，姓名，年龄。
要求1：再次添加一个学生对象，并在添加的时候进行学号的唯一性判断。
要求2：添加完毕之后，遍历所有学生信息。
要求3：通过id删除学生信息
如果存在，则删除，如果不存在，则提示删除失败。
要求4：删除完毕之后，遍历所有学生信息。
要求5：查询数组id为“heima002”的学生，如果存在，则将他的年龄+1岁*/
/**
 * 学生测试类
 */
public class StudnetTest {
    /**
     * 主函数
     *
     * @param args 命令行参数
     */
    public static void main(String[] args) {
        // 创建一个学生数组，用于存储学生对象
        Studnet arr[] = new Studnet[3];
        // 实例化三个学生对象
        Studnet studnet1 = new Studnet(1, "小诗诗", 18);
        Studnet studnet2 = new Studnet(2, "小惠惠", 19);
        // Studnet studnet3 = new Studnet(3, "小莉莉", 20);

        // 将学生对象放入数组中
        arr[0] = studnet1;
        arr[1] = studnet2;
        // arr[2] = studnet3;

        // 实例化另一个学生对象
        Studnet studnet4 = new Studnet(4, "小冰冰", 21);

        // 检查新学生对象的ID是否已存在于数组中
        boolean flag = existence(arr, studnet4.getStudentNumber());
        if (flag) {
            System.out.printf("当前id重复,请修改后进行添加!");
        } else {
            // 获取当前数组中已存放的学生数量
            int count = getCount(arr);
            if (count == arr.length) {
                //如果数组已经存满
                //创建新数组,长度是老数组长度+1;
                Studnet[] newArray = creaNewArr(arr);
                newArray[count] = studnet4;
                printArr(newArray);
            } else {
                //如果数组没有存满
                arr[count] = studnet4;
                printArr(arr);

            }
        }
    }

    public static void printArr(Studnet[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Studnet studnet = arr[i];
            if (studnet != null) {
                System.out.printf("%d,%s,%d", studnet.getStudentNumber(), studnet.getName(), studnet.getAge());
            }
        }
    }

    /**
     * 创建一个新的学生数组，长度比原数组多1
     *
     * @param arr 原学生数组
     * @return 新的学生数组
     */
    public static Studnet[] creaNewArr(Studnet[] arr) {
        Studnet[] newArray = new Studnet[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArray[i] = arr[i];
        }
        //把数组返回
        return newArray;
    }

    /**
     * 计算学生数组中已存放的学生数量
     *
     * @param arr 学生数组
     * @return 学生数量
     */
    public static int getCount(Studnet[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                count++;
            }
        }
        return count;
    }

    /**
     * 检查学生数组中是否存在指定ID的学生
     *
     * @param arr 学生数组
     * @param id  要查找的学生ID
     * @return 如果找到指定ID的学生返回true，否则返回false
     */
    public static boolean existence(Studnet[] arr, int id) {
        // 遍历学生数组
        for (int i = 0; i < arr.length; i++) {
            // 依次获取到数组里面的每一个对象
            Studnet leng = arr[i];
            if (leng != null) {
                // 获取数组中学生的学号
                int sid = leng.getStudentNumber();
                // 如果当前学生的学号与要查找的ID相等，返回true
                if (sid == id) {
                    return true;
                }
            }
        }
        // 如果遍历完数组都没有找到匹配的ID，返回false
        return false;
    }
}
