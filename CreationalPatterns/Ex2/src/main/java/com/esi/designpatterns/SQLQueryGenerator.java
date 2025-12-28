package com.esi.designpatterns;

public class SQLQueryGenerator extends QueryGenerator {
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
