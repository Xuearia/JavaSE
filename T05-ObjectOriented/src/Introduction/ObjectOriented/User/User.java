package Introduction.ObjectOriented.User;

public class User {
    //定义属性
    private String username;//用户名
    private String password;//密码
    private String confirmPassword;//确认密码
    private String mail;//邮箱
    private String sex;//性别
    private String age;//年龄


    public User() {
    }

    public User(String username, String password, String confirmPassword, String mail, String sex, String age) {
        this.username = username;
        this.password = password;
        this.confirmPassword = confirmPassword;
        this.mail = mail;
        this.sex = sex;
        this.age = age;
    }

    /**
     * 获取
     *
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     *
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     *
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     *
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     *
     * @return confirmPassword
     */
    public String getConfirmPassword() {
        return confirmPassword;
    }

    /**
     * 设置
     *
     * @param confirmPassword
     */
    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    /**
     * 获取
     *
     * @return mail
     */
    public String getMail() {
        return mail;
    }

    /**
     * 设置
     *
     * @param mail
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * 获取
     *
     * @return sex
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置
     *
     * @param sex
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取
     *
     * @return age
     */
    public String getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(String age) {
        this.age = age;
    }


}

