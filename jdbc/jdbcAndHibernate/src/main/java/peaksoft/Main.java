package peaksoft;

import peaksoft.dao.UserDaoHibernateImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь

        UserDaoHibernateImpl daoHibernate = new UserDaoHibernateImpl();
//        daoHibernate.createUsersTable();
//        daoHibernate.saveUser("rabi", "rabi", (byte)17);
//        daoHibernate.removeUserById(3);
//        System.out.println(daoHibernate.getAllUsers());
//        daoHibernate.cleanUsersTable();
        daoHibernate.dropUsersTable();
    }
}
