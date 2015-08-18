/**
 * Teamseer_core_apiPortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package teamseer_core_api;

public interface Teamseer_core_apiPortType extends java.rmi.Remote {

    /**
     * Authenticate the session with a request hash
     */
    public boolean authenticate(int companyId, java.lang.String companyKey, java.lang.String apiVersion) throws java.rmi.RemoteException;

    /**
     * Get a list of the active users
     */
    public java.lang.String[] getActiveUsers() throws java.rmi.RemoteException;

    /**
     * Get the changes since the last API request
     */
    public teamseer_core_api.DayActivityAPI[] getChangesSinceLastAPIRequest() throws java.rmi.RemoteException;

    /**
     * Get all the records for a given user
     */
    public teamseer_core_api.DayActivityAPI[] getRecordsFor(java.lang.String userIdentifier, java.lang.String fromDate, java.lang.String toDate) throws java.rmi.RemoteException;

    /**
     * Authenticate the session with a request hash
     */
    public boolean setDateFormat(java.lang.String dateFormat) throws java.rmi.RemoteException;

    /**
     * Authenticate the session with a request hash
     */
    public boolean setUserIdentifier(java.lang.String identifierType) throws java.rmi.RemoteException;
}
