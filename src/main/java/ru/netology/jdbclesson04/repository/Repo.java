package ru.netology.jdbclesson04.repository;


import lombok.Data;
import org.springframework.stereotype.Repository;
import ru.netology.jdbclesson04.entity.Orders;
import ru.netology.jdbclesson04.entity.Customers;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Data
@Repository
public class Repo {
    @PersistenceContext
    private EntityManager entityManager;

//    public String getPersonsByCity(String city) {
//        //ПОЛУЧЕНИЕ СПИСКА ОБЕКТОВ ОБЪЕКТА PERSON СО ЗНАЧЕНИЕМ В СТОЛБЦЕ "city_of_living" РАНЫМ "city"
//        Query query = entityManager.createQuery("select p from Customers p where p.city_of_living = :city_of_living", Customers.class);
//        query.setParameter("city_of_living", city);
//
//        List<Customers> list = query.getResultList();
//        StringBuilder strBuild = new StringBuilder();
//
//        //ВЫБОРКА ФИО И ЗАПИСТЬ В СТРИНГБИЛДЕР
//        for (int i = 0; i < list.size(); i++) {
//            Orders fio = list.get(i).getFio();
//            strBuild.append(fio.getName())
//                    .append(" ")
//                    .append(fio.getSurname());
//            if (i + 1 < list.size()) {
//                strBuild.append(", ");
//            } else {
//                strBuild.append(".");
//            }
//        }
//        return strBuild.toString();
//    }

    @Transactional
    public void addPersons(Customers persons) {
        entityManager.persist(persons);
    }
}
