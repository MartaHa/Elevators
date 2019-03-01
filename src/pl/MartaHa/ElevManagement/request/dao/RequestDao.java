package pl.MartaHa.ElevManagement.request.dao;

import pl.MartaHa.ElevManagement.request.model.Request;

public interface RequestDao {

    void addRequest(Request request);
    Request getFirstRequest();
}
