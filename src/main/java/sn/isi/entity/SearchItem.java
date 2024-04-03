package sn.isi.entity;

import jakarta.persistence.*;

@Entity
public class SearchItem {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "request", nullable = false)
    private String request;

    @Column(name = "response", nullable = false)
    private String response;

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}
