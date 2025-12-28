package com.esi.designpatterns;

public class OQLQueryGenerator extends QueryGenerator {
    @Override
    protected String getSelectKeyword() {
        return "SELECT";
    }

    @Override
    protected String getFromKeyword() {
        return "FROM";
    }

    @Override
    protected String getWhereKeyword() {
        return "WHERE";
    }
}
