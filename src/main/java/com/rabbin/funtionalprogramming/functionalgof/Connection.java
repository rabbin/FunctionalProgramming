package com.rabbin.funtionalprogramming.functionalgof;

import java.util.Optional;
import java.util.function.Consumer;

public class Connection {
    public static void main(String[] args) {
        Connection.runWithTransaction(x -> System.out.println("Execute statement..."));
    }

    public void commit() {
    }

    public void rollback() {
    }

    public void close() {
    }

    void setAutoCommit(boolean autoCommit) {
    }

    public static void runWithTransaction(Consumer<Connection> consumer) {
        Connection connection = null;
        try {
            connection = new Connection();
            connection.setAutoCommit(false);
            consumer.accept(connection);
            connection.commit();
        } catch (Exception e) {
            if (connection != null) {
                connection.rollback();
            }
        } finally {
            if (connection != null) {
                connection.close();
            }
        }
    }
}
