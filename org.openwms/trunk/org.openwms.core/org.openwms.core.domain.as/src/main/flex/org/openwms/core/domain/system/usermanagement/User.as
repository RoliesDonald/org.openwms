/*
 * openwms.org, the Open Warehouse Management System.
 *
 * This file is part -of openwms.org.
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
package org.openwms.core.domain.system.usermanagement {

    import mx.collections.ArrayCollection;

    [Bindable]
    [RemoteClass(alias="org.openwms.core.domain.system.usermanagement.User")]
    /**
     * An User represents a human user of the system.
     *
     * @version $Revision$
     * @since 0.1
     */
    public class User extends UserBase {

        /**
         * Constructor.
         * Preset fields. Per default a user is enabled to log in, is not locked and is no external user.
         *
         * @param username Optional username to set
         */
        public function User(username : String=null) {
            if (null != username) {
                this._username = username;
            }
            this._enabled = true;
            this._locked = false;
            this._extern = false;
            this._userDetails = new UserDetails();
        }

        /**
         * Set the username.
         *
         * @param value The username
         */
        public function set username(value : String) : void {
            _username = value;
        }

        /**
         * Check whether the User has UserDetails.
         *
         * @param userData The User to check
         * @return <code>true</code> when the User has UserDetails, otherwise <code>false</code>
         */
        public static function hasDetails(userData : User) : Boolean {
            if (userData != null && userData.userDetails != null) {
                return true;
            }
            return false;
        }

        /**
         * Find and return an User in the collection of Users with the same username like the first
         * argument username.
         *
         * @param username The username to search for
         * @param users The collection of Users to search in
         * @return the User when found, otherwise null
         */
        public static function findByName(username : String, users : ArrayCollection) : User {
            for each (var user : * in users) {
                if (user is User) {
                    if (username == (user as User).username) {
                        return user as User;
                    }
                }
            }
            return null;
        }

        /**
         * Format the User as String: fullname (username).
         *
         * @param item Usually an Object selected in a List
         * @return The User expressed by the String: fullname (username)
         */
        public static function formatWithFullnameUsername(item : *) : String {
            return (item as User).fullname + " (" + (item as User).username + ")";
        }
    }
}