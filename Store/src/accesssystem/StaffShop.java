package accesssystem;

public class StaffShop {
    private String fio;
    private String id;
    private String post;

    public StaffShop (String fio, String id, String post){
        this.fio = fio;
        this.id = id;
        this.post = post;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    @Override
    public String toString() {
        return "StaffShop{" +
                "fio='" + fio + '\'' +
                ", id='" + id + '\'' +
                ", post='" + post + '\'' +
                '}';
    }
}

