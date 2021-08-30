package dependency_injection.vd1;

public class MSSQLDao implements AbstractDao{
    @Override
    public void insert() {
        System.out.println("Mssql insert");
    }

    @Override
    public void delete() {
        System.out.println("Mssql delete");
    }

    @Override
    public void update() {
        System.out.println("Mssql update");
    }
}
