package services;

import models.client.Client;

public interface ClientService {

    boolean registerClient(String name, String email, String password, Client.type clientType, String licensePlate);

    boolean login(String email, String password);

    Client getLoggedInClient();

    void logout();
}