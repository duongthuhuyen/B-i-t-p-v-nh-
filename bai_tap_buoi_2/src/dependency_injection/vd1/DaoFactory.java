package dependency_injection.vd1;

public class DaoFactory {
    public static AbstractDao list [];
    static {
        list = new AbstractDao[3];
        list[0]= new MySQLDao();
        list[1]= new MSSQLDao();
        list[2]= new PostgreDao();
    }

    public static AbstractDao getDao(int type){
        return list[type];
    }
}
