package functionalinterface;

import java.util.function.Supplier;

public class _Supplier {

    public static void main(String[] args) {
        System.out.println(getConnectionUrl());
        System.out.println(getConnectionUrlSupplier.get());
    }

    static String getConnectionUrl() {
        return "jdbc://localhost:5432/users";
    }

    static Supplier<String> getConnectionUrlSupplier = () -> "jdbc://localhost:5432/users";

}
