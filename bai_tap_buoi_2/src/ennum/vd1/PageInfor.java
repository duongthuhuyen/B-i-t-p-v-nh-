package ennum.vd1;

public enum PageInfor {
    page_01("page_01","Login","/login");
  //  page_02("page_02","Add new user","/adduser");
    //page_03("page_03","List user","/listuser");

    private String id;
    private String titleName;
    private String titleURL;

    private PageInfor(String id, String titleName, String titleURL) {
        this.id = id;
        this.titleName = titleName;
        this.titleURL = titleURL;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public String getTitleURL() {
        return titleURL;
    }

    public void setTitleURL(String titleURL) {
        this.titleURL = titleURL;
    }
}
