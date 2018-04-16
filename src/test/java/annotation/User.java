package annotation;

/**
 *
 * @Author lnz
 * @Date created in 2018/3/25
 */
@Table(tableName = "user")
public class User {
    @Column("Id")
    private long id;
    @Column("Name")
    private String name;
    @Column("age")
    private int age;

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
