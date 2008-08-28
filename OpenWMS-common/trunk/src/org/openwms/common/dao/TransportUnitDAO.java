/*
 * OpenWMS, the open Warehouse Management System
 * 
 * Distributable under LGPL license.
 * See terms of license at gnu.org.
 */
package org.openwms.common.dao;

import org.openwms.common.domain.TransportUnit;
import org.openwms.common.domain.values.Barcode;

/**
 * A TransportUnitDAO.
 * 
 * @author <a href="heiko.scherrer@gmx.de">Heiko Scherrer</a>
 * @version $Revision: 314 $
 */
public class TransportUnitDAO extends GenericDAO<TransportUnit, Barcode> implements ITransportUnitDAO {

    @Override
    String getFindAllQuery() {
        return ITransportUnitDAO.NQ_FIND_ALL;
    }
    
    @Override
    String getFindAllUniqueQuery() {
        return ITransportUnitDAO.NQ_FIND_BY_UNIQUE_QUERY;
    }
    
    // TODO: Provide other TransportUnit based non-CRUD operations here!
}
