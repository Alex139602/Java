/**
 * Teamseer_core_apiServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package teamseer_core_api;

public class Teamseer_core_apiServiceLocator extends org.apache.axis.client.Service implements teamseer_core_api.Teamseer_core_apiService {

    public Teamseer_core_apiServiceLocator() {
    }


    public Teamseer_core_apiServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Teamseer_core_apiServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for teamseer_core_apiPort
    private java.lang.String teamseer_core_apiPort_address = "https://www.teamseer.com/services/soap/coreapi/1_0_0/teamseer_core_api.php";

    public java.lang.String getteamseer_core_apiPortAddress() {
        return teamseer_core_apiPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String teamseer_core_apiPortWSDDServiceName = "teamseer_core_apiPort";

    public java.lang.String getteamseer_core_apiPortWSDDServiceName() {
        return teamseer_core_apiPortWSDDServiceName;
    }

    public void setteamseer_core_apiPortWSDDServiceName(java.lang.String name) {
        teamseer_core_apiPortWSDDServiceName = name;
    }

    public teamseer_core_api.Teamseer_core_apiPortType getteamseer_core_apiPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(teamseer_core_apiPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getteamseer_core_apiPort(endpoint);
    }

    public teamseer_core_api.Teamseer_core_apiPortType getteamseer_core_apiPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            teamseer_core_api.Teamseer_core_apiBindingStub _stub = new teamseer_core_api.Teamseer_core_apiBindingStub(portAddress, this);
            _stub.setPortName(getteamseer_core_apiPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setteamseer_core_apiPortEndpointAddress(java.lang.String address) {
        teamseer_core_apiPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (teamseer_core_api.Teamseer_core_apiPortType.class.isAssignableFrom(serviceEndpointInterface)) {
                teamseer_core_api.Teamseer_core_apiBindingStub _stub = new teamseer_core_api.Teamseer_core_apiBindingStub(new java.net.URL(teamseer_core_apiPort_address), this);
                _stub.setPortName(getteamseer_core_apiPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("teamseer_core_apiPort".equals(inputPortName)) {
            return getteamseer_core_apiPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:teamseer_core_api", "teamseer_core_apiService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:teamseer_core_api", "teamseer_core_apiPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("teamseer_core_apiPort".equals(portName)) {
            setteamseer_core_apiPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
