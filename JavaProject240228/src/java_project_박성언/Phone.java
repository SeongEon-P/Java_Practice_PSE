package java_project_박성언;

public class Phone {
    private String name;
    private String tel;
    private String address;

    public Phone(String name, String tel, String address) {
        this.name = name;
        this.tel = tel;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getTel() {
        return tel;
    }

    public String getAdr() {
        return address;
    }
}