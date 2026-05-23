package Introduction.test2_MovieTicket;

public class Film_show {
    public Film[] Films;

    public Film_show(Film[] Films) {
        this.Films = Films;
    }

    public void printShows() {
        System.out.println("----------系统全部电影信息如下--------------");
        for (int i = 0; i < Films.length; i++) {
            Film m = Films[i];
            System.out.println("电影的编号为：" + m.getId());
            System.out.println("电影的名称为：" + m.getName());
            System.out.println("电影的价格为：" + m.getPrice());
            System.out.println("------------------------------------");
        }
    }

    public void QueryId(int a) {
        for (int i = 0; i < Films.length; i++) {
            Film m = Films[i];
            if (m.getId() == a) {
                System.out.println("电影详情如下:");
                System.out.println("电影的编号为：" + m.getId());
                System.out.println("电影的名称为：" + m.getName());
                System.out.println("电影的价格为：" + m.getPrice());
                System.out.println("电影的评分为：" + m.getScore());
                System.out.println("电影的导演为：" + m.getDirector());
                System.out.println("电影的主演为：" + m.getActor());
                System.out.println("其他信息：" + m.getInfo());
                return;//已经找到了信息,没有必要在执行了;
            }
        }
        System.out.println("没有该电影信息~");
    }
}

