/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.edu.ittepic.ejb;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import mx.edu.ittepic.entidades.Products;

/**
 *
 * @author arlet
 */
@Stateless
public class EJBoperaciones {
    @PersistenceContext
    EntityManager em;
    
     public String newProduct (int productid, String code, String productname, String brand, double purchprice, int stock, int salepricemin, int reorderpoint, String currency, int categoryid, int salepricemay, String image)
    {
        Products r = new Products();
        r.setProductid(productid);
        r.setCode(code);
        r.setProductname(productname);
        r.setBrand(brand);
        r.setPurchprice(purchprice);
        r.setStock(stock);
        r.setSalepricemin(salepricemin);
        r.setReorderpoint(reorderpoint);
        r.setCurrency(currency);
        r.setCategoryid(categoryid);
        r.setSalepricemay(salepricemay);
        r.setImage(image);
        
        
        String msj;
        
        try
        {
            em.persist(r);
            
            msj = "{\"code\":200, \"msj\"La operacion se realizo correctamente\"}";
            
        } catch (Exception e)
        {
            msj = "{\"code\":400, \"msj\"Error en los tipos de parametros\"}";
        }
        return msj;
        
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
}
