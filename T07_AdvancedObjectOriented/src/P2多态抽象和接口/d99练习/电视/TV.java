package P2多态抽象和接口.d99练习.电视;

public class TV {
    public String name;

    public TV() {
    }

    public TV(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void play(String channel) {
        System.out.printf("%s电视正在播放%s节目", name, channel);
    }
}
