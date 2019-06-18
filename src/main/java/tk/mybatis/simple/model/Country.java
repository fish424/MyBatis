package tk.mybatis.simple.model;

/**
 * @ClassName Country
 * @Description TODO
 * @Author liuzj
 * @Date 2019/6/17 11:21
 **/
public class Country {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }

    private String countryname;
    private String countrycode;
}

