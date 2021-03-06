/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package name.darthmantis.controller;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import name.darthmantis.model.ServerList;

/**
 *
 * @author darthmantis
 */
@Stateless
public class ServerListFacade extends AbstractFacade<ServerList> {

    @PersistenceContext(unitName = "name.darthmantis_WoWAuctionPrices_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ServerListFacade() {
        super(ServerList.class);
    }
  
    
}
