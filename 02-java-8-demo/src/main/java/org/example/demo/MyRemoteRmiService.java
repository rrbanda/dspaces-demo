package org.example.demo;

import java.rmi.activation.Activatable;
import java.rmi.activation.ActivationID;
import java.rmi.MarshalledObject;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class MyRemoteRmiService extends Activatable implements MyRemoteInterface {
    public MyRemoteService(ActivationID id, MarshalledObject<?> data) throws RemoteException {
        super(id, 0);
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Hello from activated object!";
    }
}
