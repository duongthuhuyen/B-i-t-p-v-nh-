package dependency_injection.vd1;

public class Test {
    public static void main(String[] args) {
        AbstractDao abstractDao= DaoFactory.getDao(2);
        abstractDao.delete();
    }
}
