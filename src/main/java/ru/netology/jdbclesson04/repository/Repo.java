package ru.netology.jdbclesson04.repository;


import lombok.Data;
import org.springframework.stereotype.Repository;
import ru.netology.jdbclesson04.entity.Orders;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Data
@Repository
public class Repo {
    @PersistenceContext
    private EntityManager entityManager;

    public String getProductName(String name) {
        //ПОЛУЧЕНИЕ СВЯЗАННОГО СПИСКА ORDERS и COSTOMERS, СВЯЗЬ ПО КЛЮЧЮ ИЗ ORDERS, C ФИЛЬТРАЦИЕЙ ПО NAME
        Query query = entityManager.createQuery(
                "select o from Orders o  join o.customer_id where o.customer_id.name=:name", Orders.class);
        query.setParameter("name", name);

        List<Orders> list = query.getResultList();
        StringBuilder strBuild = new StringBuilder();

        //ВЫБОРКА ФИО И ЗАПИСТЬ В СТРИНГБИЛДЕР
        for (int i = 0; i < list.size(); i++) {
            Orders orders = list.get(i);
            strBuild.append(orders.getProduct_name());

            //ВЫБОР: ТОЧКА ИЛИ ЗАПЯТАЯ + ПРОБЕЛ
            if (i + 1 < list.size()) {
                strBuild.append(", ");
            } else {
                strBuild.append(".");
            }
        }
        return strBuild.toString();
    }
}
