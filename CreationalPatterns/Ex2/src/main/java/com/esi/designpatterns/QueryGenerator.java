package com.esi.designpatterns;

public abstract class QueryGenerator {
    protected StringBuilder select = new StringBuilder();
    protected StringBuilder from = new StringBuilder();
    protected StringBuilder where = new StringBuilder();

    public void select(String field) {
        if (select.length() == 0) {
            select.append(getSelectKeyword()).append(" ");
        } else {
            select.append(", ");
        }
        select.append(field);
    }

    public void from(String table) {
        from.append(" ").append(getFromKeyword()).append(" ").append(table);
    }

    public void where(String condition) {
        where.append(" ").append(getWhereKeyword()).append(" ").append(condition);
    }

    public Request getResult() {
        return new Request(select.toString(), from.toString(), where.toString());
    }

    protected abstract String getSelectKeyword();
    protected abstract String getFromKeyword();
    protected abstract String getWhereKeyword();
}
