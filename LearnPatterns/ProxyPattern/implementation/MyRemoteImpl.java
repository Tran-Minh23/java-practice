package LearnPatterns.ProxyPattern.implementation;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import LearnPatterns.ProxyPattern.interfaces.MyRemote;

public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {

    public MyRemoteImpl() throws RemoteException { }

    @Override
    public String sayHello() throws RemoteException {
        return "Server says, ‘Hey’";
    }
    
}
