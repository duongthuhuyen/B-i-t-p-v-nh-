package dependency_injection.vd1;

public class PostgreDao implements AbstractDao{
    @Override
    public void insert() {
        System.out.println("PostgreDao insert");
    }

    @Override
    public void delete() {
        System.out.println("Postgre delete");
    }

    @Override
    public void update() {
        System.out.println("Postgre update");

    }
}
