
package Reto2_web.interfaces;

import Reto2_web.modelo.Supplements;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author LUIS JULIAN ORTIZ HEREDIA
 */
public interface InterfaceSupplements extends MongoRepository<Supplements, String>{
    
}
