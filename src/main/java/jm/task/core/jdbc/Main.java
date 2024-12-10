package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserServiceImpl;
/*
 Создание таблицы User(ов)
 Добавление 4 User(ов) в таблицу с данными на свой выбор. После каждого добавления должен быть вывод в консоль (User с именем — name добавлен в базу данных)
 Получение всех User из базы и вывод в консоль (должен быть переопределен toString в классе User)
 Очистка таблицы User(ов)
 Удаление таблицы
 */

public class Main {
    public static void main(String[] args) {
        UserServiceImpl userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("Ivan" , "Ivanov", (byte) 22);
        userService.saveUser("Roman" , "Smirnov", (byte) 27);
        userService.saveUser("Igor" , "Sokolov", (byte) 25);
        userService.saveUser("Lev" , "Petrov", (byte) 20);
        userService.getAllUsers();
        userService.cleanUsersTable();

    }
}
