package pl.MartaHa.ElevManagement.request.dao;

import pl.MartaHa.ElevManagement.request.model.Request;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

public class RequestsQueueDao implements RequestDao {

    private Queue<Request> requestsQueue;

    public RequestsQueueDao(Queue<Request> requestsQueue) {
        requestsQueue = new LinkedBlockingQueue<>() {
        };
    }

    @Override
    public void addRequest(Request request) {
        requestsQueue.add(request);
    }

    @Override
    public Request getFirstRequest() {
        return requestsQueue.poll();
    }
}
