package reflect;

/**
 * @Author lnz
 * @Date created in 2018/3/5
 */
public class User<T> extends Person<T> {

    private long id;

    private String name;

    public User(long id) {
        this.id = id;
    }

    public User() {
    }

    protected void test(){
        System.out.println("test");
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
