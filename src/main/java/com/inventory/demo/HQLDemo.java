package com.inventory.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import java.util.List;

import com.inventory.entity.Product;
import com.inventory.loader.ProductDataLoader;
import com.inventory.util.HibernateUtility;

public class HQLDemo {

public static void main(String[] args){

SessionFactory factory=HibernateUtility.getSessionFactory();
Session session=factory.openSession();

ProductDataLoader.loadSampleProducts(session);

String hql="FROM Product p ORDER BY p.price ASC";

Query<Product> query=session.createQuery(hql,Product.class);

List<Product> products=query.list();

System.out.println("Products Sorted by Price:");

for(Product p:products){
System.out.println(p);
}

session.close();
factory.close();

}

}