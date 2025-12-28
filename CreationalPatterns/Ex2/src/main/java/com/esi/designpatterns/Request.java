package com.esi.designpatterns;

public class Request {
    private String selectClause;
    private String fromClause;
    private String whereClause;

    public Request(String selectClause, String fromClause, String whereClause) {
        this.selectClause = selectClause;
        this.fromClause = fromClause;
        this.whereClause = whereClause;
    }

    @Override
    public String toString() {
        return selectClause + fromClause + 
               (whereClause != null && !whereClause.isEmpty() ? whereClause : "");
    }
}
