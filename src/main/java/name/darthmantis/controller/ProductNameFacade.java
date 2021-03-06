/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package name.darthmantis.controller;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import name.darthmantis.model.ProductName;

/**
 *
 * @author darthmantis
 */
@Stateless
public class ProductNameFacade extends AbstractFacade<ProductName> {

    @PersistenceContext(unitName = "name.darthmantis_WoWAuctionPrices_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProductNameFacade() {
        super(ProductName.class);
    }
     
    
    
    
}
