package teamseer_core_api;

public class Teamseer_core_apiPortTypeProxy implements teamseer_core_api.Teamseer_core_apiPortType {
  private String _endpoint = null;
  private teamseer_core_api.Teamseer_core_apiPortType teamseer_core_apiPortType = null;
  
  public Teamseer_core_apiPortTypeProxy() {
    _initTeamseer_core_apiPortTypeProxy();
  }
  
  public Teamseer_core_apiPortTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initTeamseer_core_apiPortTypeProxy();
  }
  
  private void _initTeamseer_core_apiPortTypeProxy() {
    try {
      teamseer_core_apiPortType = (new teamseer_core_api.Teamseer_core_apiServiceLocator()).getteamseer_core_apiPort();
      if (teamseer_core_apiPortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)teamseer_core_apiPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)teamseer_core_apiPortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (teamseer_core_apiPortType != null)
      ((javax.xml.rpc.Stub)teamseer_core_apiPortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public teamseer_core_api.Teamseer_core_apiPortType getTeamseer_core_apiPortType() {
    if (teamseer_core_apiPortType == null)
      _initTeamseer_core_apiPortTypeProxy();
    return teamseer_core_apiPortType;
  }
  
  public boolean authenticate(int companyId, java.lang.String companyKey, java.lang.String apiVersion) throws java.rmi.RemoteException{
    if (teamseer_core_apiPortType == null)
      _initTeamseer_core_apiPortTypeProxy();
    return teamseer_core_apiPortType.authenticate(companyId, companyKey, apiVersion);
  }
  
  public java.lang.String[] getActiveUsers() throws java.rmi.RemoteException{
    if (teamseer_core_apiPortType == null)
      _initTeamseer_core_apiPortTypeProxy();
    return teamseer_core_apiPortType.getActiveUsers();
  }
  
  public teamseer_core_api.DayActivityAPI[] getChangesSinceLastAPIRequest() throws java.rmi.RemoteException{
    if (teamseer_core_apiPortType == null)
      _initTeamseer_core_apiPortTypeProxy();
    return teamseer_core_apiPortType.getChangesSinceLastAPIRequest();
  }
  
  public teamseer_core_api.DayActivityAPI[] getRecordsFor(java.lang.String userIdentifier, java.lang.String fromDate, java.lang.String toDate) throws java.rmi.RemoteException{
    if (teamseer_core_apiPortType == null)
      _initTeamseer_core_apiPortTypeProxy();
    return teamseer_core_apiPortType.getRecordsFor(userIdentifier, fromDate, toDate);
  }
  
  public boolean setDateFormat(java.lang.String dateFormat) throws java.rmi.RemoteException{
    if (teamseer_core_apiPortType == null)
      _initTeamseer_core_apiPortTypeProxy();
    return teamseer_core_apiPortType.setDateFormat(dateFormat);
  }
  
  public boolean setUserIdentifier(java.lang.String identifierType) throws java.rmi.RemoteException{
    if (teamseer_core_apiPortType == null)
      _initTeamseer_core_apiPortTypeProxy();
    return teamseer_core_apiPortType.setUserIdentifier(identifierType);
  }
  
  
}