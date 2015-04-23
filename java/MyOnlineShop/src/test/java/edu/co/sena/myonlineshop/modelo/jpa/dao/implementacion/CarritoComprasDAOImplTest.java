/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.co.sena.myonlineshop.modelo.jpa.dao.implementacion;

import edu.co.sena.myonlineshop.modelo.jpa.entities.CarritoCompras;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hernando
 */
public class CarritoComprasDAOImplTest {
    
    public CarritoComprasDAOImplTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of insert method, of class CarritoComprasDAOImpl.
     */
    @Test
    public void testInsert() {
        System.out.println("insert");
        CarritoCompras entity = new CarritoCompras();
        entity.setIdCarrito("asdfasdfasdf");
        entity.setImpuestos(0);
        entity.setSubtotal(0);
        entity.setTotal(0);
        
        CarritoComprasDAOImpl instance = new CarritoComprasDAOImpl();
        instance.insert(entity);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of update method, of class CarritoComprasDAOImpl.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        CarritoCompras entity = null;
        CarritoComprasDAOImpl instance = new CarritoComprasDAOImpl();
        instance.update(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class CarritoComprasDAOImpl.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        CarritoCompras entity = null;
        CarritoComprasDAOImpl instance = new CarritoComprasDAOImpl();
        instance.delete(entity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByIdCarrito method, of class CarritoComprasDAOImpl.
     */
    @Test
    public void testFindByIdCarrito() {
        System.out.println("findByIdCarrito");
        CarritoComprasDAOImpl instance = new CarritoComprasDAOImpl();
        CarritoCompras expResult = null;
        CarritoCompras result = instance.findByIdCarrito();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByAll method, of class CarritoComprasDAOImpl.
     */
    @Test
    public void testFindByAll() {
        System.out.println("findByAll");
        CarritoComprasDAOImpl instance = new CarritoComprasDAOImpl();
        List<CarritoCompras> expResult = null;
        List<CarritoCompras> result = instance.findByAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByTotal method, of class CarritoComprasDAOImpl.
     */
    @Test
    public void testFindByTotal() {
        System.out.println("findByTotal");
        Object total = null;
        CarritoComprasDAOImpl instance = new CarritoComprasDAOImpl();
        List<CarritoCompras> expResult = null;
        List<CarritoCompras> result = instance.findByTotal(total);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findBySubtotal method, of class CarritoComprasDAOImpl.
     */
    @Test
    public void testFindBySubtotal() {
        System.out.println("findBySubtotal");
        Object subtotal = null;
        CarritoComprasDAOImpl instance = new CarritoComprasDAOImpl();
        List<CarritoCompras> expResult = null;
        List<CarritoCompras> result = instance.findBySubtotal(subtotal);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findByImpuestos method, of class CarritoComprasDAOImpl.
     */
    @Test
    public void testFindByImpuestos() {
        System.out.println("findByImpuestos");
        Object impuesto = null;
        CarritoComprasDAOImpl instance = new CarritoComprasDAOImpl();
        List<CarritoCompras> expResult = null;
        List<CarritoCompras> result = instance.findByImpuestos(impuesto);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}