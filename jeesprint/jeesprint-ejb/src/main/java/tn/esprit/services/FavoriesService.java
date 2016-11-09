package tn.esprit.services;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class FavoriesService
 */
@Stateless
@LocalBean
public class FavoriesService implements FavoriesServiceRemote, FavoriesServiceLocal {

    /**
     * Default constructor. 
     */
    public FavoriesService() {
        // TODO Auto-generated constructor stub
    }

}
