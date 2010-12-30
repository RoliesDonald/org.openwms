/*
 * openwms.org, the Open Warehouse Management System.
 *
 * This file is part of openwms.org.
 *
 * openwms.org is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as 
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * openwms.org is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software. If not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.openwms.core.service.exception;

import java.io.Serializable;

/**
 * A ServiceException is a checked application exception.
 * 
 * @author <a href="mailto:scherrer@users.sourceforge.net">Heiko Scherrer</a>
 * @version $Revision$
 * @since 0.1
 */
public class ServiceException extends Exception implements Serializable {

    private static final long serialVersionUID = 3091182786979000919L;

    /**
     * Create a new ServiceException.
     */
    public ServiceException() {}

    /**
     * Create a new ServiceException with a message text.
     * 
     * @param message
     *            Message text as String
     */
    public ServiceException(String message) {
        super(message);
    }

    /**
     * Create a new ServiceException with a cause exception.
     * 
     * @param cause
     *            The cause exception
     */
    public ServiceException(Throwable cause) {
        super(cause);
    }

    /**
     * Create a new ServiceException with a message text and the cause
     * exception.
     * 
     * @param message
     *            Message text as String
     * @param cause
     *            The cause exception
     */
    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }

}