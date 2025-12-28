package com.esi.designpatterns;

public class Main {
    public static void main(String[] args) {
        QueryGenerator sqlReq = new SQLQueryGenerator();
        sqlReq.select("person.id");
        sqlReq.select("person.name");
        sqlReq.from("person");
        Request sqlRequest = sqlReq.getResult();
        System.out.println("SQL: " + sqlRequest);

        System.out.println();

        QueryGenerator oqlReq = new OQLQueryGenerator();
        oqlReq.select("p.id");
        oqlReq.select("p.name");
        oqlReq.from("Person p");
        Request oqlRequest = oqlReq.getResult();
        System.out.println("OQL: " + oqlRequest);

        System.out.println();

        QueryGenerator sparqlReq = new SPARQLQueryGenerator();
        sparqlReq.select("?id");
        sparqlReq.select("?name");
        sparqlReq.from("?person");
        Request sparqlRequest = sparqlReq.getResult();
        System.out.println("SPARQL: " + sparqlRequest);
    }
}
