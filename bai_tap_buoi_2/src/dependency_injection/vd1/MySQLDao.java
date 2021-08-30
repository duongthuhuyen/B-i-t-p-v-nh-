package dependency_injection.vd1;

public class MySQLDao implements AbstractDao{
    @Override
    public void insert() {
        System.out.println("Mysql insert");
    }

    @Override
    public void delete() {
        System.out.println("Mysql delete");
    }

    @Override
    public void update() {
        System.out.println("Mysql update");

    }
}
